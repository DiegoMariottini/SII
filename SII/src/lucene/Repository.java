package lucene;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;

import tokenization.DocParser;

public class Repository {
	
	public Repository(){}
	
	//aggiungi un cv a Lucene
	public void addDocParser(DocParser dp){}
	
	//cerca un cv su Lucene
	public List<DocParser> search(List<String> query){	
		//TODO
		return null;
	}
	
/*
		//Tokenizza un cv
		//Riceve il cv da userInterface, e invia a db i token ottenuti dal cv
		public void setParser (String cv){
			// TODO
			
//			try {
//				StandardAnalyzer analyzer = new StandardAnalyzer();
//				
//				Directory index = new RAMDirectory();		
//				IndexWriterConfig config = new IndexWriterConfig(analyzer);
//				
//				IndexWriter w = new IndexWriter(index, config);
//				Document doc = new Document();
//				doc.add(new TextField("id" , cv, Field.Store.YES));
//				w.addDocument(doc);
//				w.close();
//				
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
			
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
			
			StandardAnalyzer analyzer = new StandardAnalyzer();
			TokenStream tokenStream = analyzer.tokenStream("fieldName", cv);
			OffsetAttribute offsetAttribute = tokenStream.addAttribute(OffsetAttribute.class);
			CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);

			try {
				tokenStream.reset();
				while (tokenStream.incrementToken()) {
				    int startOffset = offsetAttribute.startOffset();
				    int endOffset = offsetAttribute.endOffset();
				    String term = charTermAttribute.toString();
				    results.add(term);
				} 
			}
				catch (IOException e) {
					System.out.println(e.getMessage());
			}
		
			return results;
		}
*/
}
