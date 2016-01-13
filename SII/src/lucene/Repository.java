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
	private int hitsPerPage = 10; //Numero massimo di cv che vengono restituiti dalla search
	
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
			doc.add(new TextField("cv" , dp.getText(), Field.Store.YES));
			//inserisco i singoli tag
			Iterator<String> it= dp.getEntity().iterator();
			while(it.hasNext()){
				doc.add(new StringField("entity" , it.next(), Field.Store.YES));
			}
			w.addDocument(doc);
			w.close();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//cerca un cv su Lucene
	public List<String> search(List<String> tags) throws IOException{	
		List<String> cv= new LinkedList<>();
		//Trasformo lista di tag in una stringa
		String querystr=FromTagToString(tags);
		try {
			//parso la query
			Query q = new QueryParser("entity", analyzer).parse(querystr);
			//apro l'indice di lettura del file
			IndexReader reader = DirectoryReader.open(index);
		    searcher = new IndexSearcher(reader);
		    //Fa la ricerca e restituisce un numero max di doc che matchano con la query
		    TopDocs docs=searcher.search(q, hitsPerPage);
		    //trasformo la lista in un vettore di doc
		    ScoreDoc[] hits = docs.scoreDocs;
		    //Ricavo da ogni documento il testo dei cv 
		    for (int i = 0; i < hits.length; i++) {
		        Document doc =getDocument(hits[i].doc);
		        cv.add(doc.get("cv"));
		        }
		} catch (ParseException e) {
			
			System.out.println(e.getMessage());
		}
		return cv;
	}
	
	public String FromTagToString (List<String> tags){
		String query="";
		Iterator<String> it= tags.iterator();
		while(it.hasNext()){
			query= query + " " + it.next();
		}
		return query;
	}
	
	public Document getDocument(int docId) throws IOException {
		        return searcher.doc(docId);
		    }

	
}
