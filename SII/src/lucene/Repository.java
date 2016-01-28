package lucene;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
//import org.apache.lucene.search.TopScoreDocCollector;
//import org.apache.lucene.analysis.TokenStream;
//import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
//import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;


import tokenization.DocParser;

public class Repository {
	private Directory index;
	private StandardAnalyzer analyzer;
	private IndexSearcher searcher;
	private List<DocParser> result= new LinkedList<DocParser>();
	private int hitsPerPage = 10; //Numero massimo di cv che vengono restituiti dalla search
	private final String ENTITY="entity"; //nome dei campi 
	private final String DBPEDIA="dbpedia";
	private final String CV="cv";
	private final int ON_DBPEDIA=2; //valore peso
	private final int ON_ENTITY=1;
	
	public Repository(){}
	
	//aggiungi un cv a Lucene
	public void addDocParser(DocParser dp){
		analyzer = new StandardAnalyzer();
		
		index = new RAMDirectory();		
		IndexWriterConfig config = new IndexWriterConfig(analyzer);
		
		try {
			IndexWriter w = new IndexWriter(index, config);
			Document doc = new Document();
			//inserisco il testo completo del cv
			doc.add(new TextField(CV , dp.getText(), Field.Store.YES));
			//inserisco i singoli tag
			Iterator<String> it= dp.getEntity().iterator();
			while(it.hasNext()){
				doc.add(new StringField(ENTITY , it.next(), Field.Store.YES));
			}
			//inserisco i singoli tag delle categorie di dbpedia dei tag
			Iterator<String> it2= dp.getDbpedia().iterator();
			while(it2.hasNext()){
				doc.add(new StringField(DBPEDIA , it2.next(), Field.Store.YES));
			}
			//aggiungo doc al file
			w.addDocument(doc);
			w.close();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//cerca un cv su Lucene e restituisce una lista di doc che corrispondono ai parametri
	public List<DocParser> search(DocParser dp) throws ParseException, IOException{	
		//Trasformo lista di tag in due stringhe: una per i tag principali e uno per gli altri
		String querystr1=FromTagToString("",dp.getEntity());
		String querystr2=FromTagToString(querystr1,dp.getDbpedia());
		try {
			//parso le query, sia per le entity che per le dbpedia, per entrambe le query
			Query queryEntityOnEntity = new QueryParser(ENTITY, analyzer).parse(querystr1);
			Query queryEntityOnDbpedia = new QueryParser(DBPEDIA, analyzer).parse(querystr1);
			Query queryDbpediaOnEntity = new QueryParser(ENTITY, analyzer).parse(querystr2);	
			Query queryDbpediaOnDbpedia = new QueryParser(DBPEDIA, analyzer).parse(querystr2);
			//invio la ricerca delle singole query a Lucene e inserisco i risultati nella lista result
			searchLucene(queryEntityOnEntity,dp.getEntity(),ON_ENTITY);
			searchLucene(queryEntityOnDbpedia, dp.getEntity(),ON_DBPEDIA);
			searchLucene(queryDbpediaOnEntity, dp.getDbpedia(),ON_ENTITY);
			searchLucene(queryDbpediaOnDbpedia, dp.getDbpedia(),ON_DBPEDIA);
		} catch (ParseException e) {
			
			System.out.println(e.getMessage());
		}
		//elimino i doppioni
		deleteDuplicate();
		return result;
	}
	
	

	public String FromTagToString (String Startquery, List<String> tags){
		String query=Startquery;
		Iterator<String> it= tags.iterator();
		while(it.hasNext()){
			query= query + " " + it.next();
		}
		return query;
	}
	
	
	public void searchLucene (Query query, List<String> tags, int value) throws IOException{
		try {
			//apro l'indice di lettura del file
			IndexReader reader = DirectoryReader.open(index);
			searcher = new IndexSearcher(reader);
			//Fa la ricerca e restituisce un numero max di doc che matchano con la query
			TopDocs docs=searcher.search(query, hitsPerPage);
			//trasformo la lista in un vettore di doc
			ScoreDoc[] hits = docs.scoreDocs;
			//Ricavo da ogni documento che matcha con la query 
			for (int i = 0; i < hits.length; i++) {
				int docId=hits[i].doc;
				Document doc =searcher.doc(docId);
				 if (isOnResult(docId)) return;
				    else addInResult(doc,docId, tags, value);
			    }
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void addInResult(Document doc, int docId, List<String> tags, int value) {
		//prelevo tutti i campi salvati di doc
		String text= doc.get(CV);
		String [] tags_entity=doc.getValues(ENTITY);
		List<String> tags_entity_list= FromVectorToList(tags_entity);
		String [] tags_dbpedia=doc.getValues(DBPEDIA);
		List<String> tags_dbpedia_list= FromVectorToList(tags_dbpedia);
		
		//creo un docParser equivalente al doc 
		DocParser dp= new DocParser();
	    dp.setId(docId);
	    dp.setText(text);
	    dp.setDbpedia(tags_dbpedia_list);
	    dp.setEntity(tags_entity_list);
	    
	    //calcola peso
	  
	    
	    //inserisco docParser nella lista result
	    result.add(dp);	   
    }
	
	
	private List<String> FromVectorToList(String[] tags) {
		List<String> tags_list= new LinkedList<String>();
		for(int i=0; i< tags.length; i++){
			tags_list.add(tags[i]);
		}
		return tags_list;
	}

	//verifico se un doc è già presente nella lista
	public boolean isOnResult(int docId){
		Iterator<DocParser> it= result.iterator();
		while(it.hasNext()){
			DocParser dp= it.next();
			if(dp.getId()==docId) return true;
		}
		return false;
	}  
	

	//elimino i doppioni dalla lista dei risultati, e fondo insieme i loro tag
		private void deleteDuplicate() {
			// TODO Auto-generated method stub
			
		}


	
}
