package tokenization;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;

public class Parser {

	//Costruttore
	public Parser(){}
	
	//Tokenizza un cv
	//Riceve il cv da userInterface, e invia a db i token ottenuti dal cv
	public void setParser (String cv){
		// TODO
		
//		try {
//			StandardAnalyzer analyzer = new StandardAnalyzer();
//			
//			Directory index = new RAMDirectory();		
//			IndexWriterConfig config = new IndexWriterConfig(analyzer);
//			
//			IndexWriter w = new IndexWriter(index, config);
//			Document doc = new Document();
//			doc.add(new TextField("id" , cv, Field.Store.YES));
//			w.addDocument(doc);
//			w.close();
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
	}
	
	//Tokenizza query 
	//Riceve la query da userInterface, e invia i token da cercare
	//Poi invia i risultati ottenuti dal db, a userInterface
	public List<String> getParser (String query){
		// TODO
		List<String> results= new LinkedList<>();
		return results;
	}
	
	//Creazione DataSet
	//Riceve il cv e restituisce i token ottenuti
	public List<String> CreateDataSet (String cv){
		List<String> results= new LinkedList<>();
	
			Document doc = new Document();
			doc.add(new TextField("id" , cv, Field.Store.YES));
			Iterator<IndexableField> it=doc.getFields().iterator();
			while(it.hasNext())
				results.add(it.next().stringValue());			
		
		return results;
	}
	
}
