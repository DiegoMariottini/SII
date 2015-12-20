package init;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;

import tokenization.Parser;


//non serve a una cippa
public class TestLucene 
{
	
	private static String cv="PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Città Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Città Milano.. Prov. .MI. Tel. .02/333333.Cell. …335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalità Italiana. Stato civile celibePatente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.";
	
	 public static void main(String[] args) {
		 Parser p= new Parser();
		 List<String> results=p.CreateDataSet(cv);
		 Iterator<String> it= results.iterator();
		 while(it.hasNext())
			 System.out.println("\n"+it.next().toString());
	 }
	
	
	
//	public static void main(String[] args)
//	{
//		try
//		{
//			//	Specify the analyzer for tokenizing text.
//		    //	The same analyzer should be used for indexing and searching
//			StandardAnalyzer analyzer = new StandardAnalyzer();
//			
//			//	Code to create the index
//			Directory index = new RAMDirectory();
//			
//			IndexWriterConfig config = new IndexWriterConfig(analyzer);
//			
//			IndexWriter w = new IndexWriter(index, config);
//			addDoc(w, "Lucene in Action", "193398817");
//			addDoc(w, "Lucene for Dummies", "55063554A");
//			addDoc(w, "Managing Gigabytes", "55063554A");
//			addDoc(w, "The Art of Computer Science", "9900333X");
//			addDoc(w, "My name is teja", "12842d99");
//			addDoc(w, "Lucene demo by teja", "23k43413");
//			w.close();
//			
//			//	Text to search
//			String querystr = args.length > 0 ? args[0] : "teja";
//			
//			//	The \"title\" arg specifies the default field to use when no field is explicitly specified in the query
//			Query q = new QueryParser("title", analyzer).parse(querystr);
//			
//			// Searching code
//			int hitsPerPage = 10;
//		    IndexReader reader = DirectoryReader.open(index);
//		    IndexSearcher searcher = new IndexSearcher(reader);
//		    TopScoreDocCollector collector = TopScoreDocCollector.create(hitsPerPage);
//		    searcher.search(q, collector);
//		    ScoreDoc[] hits = collector.topDocs().scoreDocs;
//		    
//		    //	Code to display the results of search
//		    System.out.println("Found " + hits.length + " hits.");
//		    for(int i=0;i<hits.length;++i) 
//		    {
//		      int docId = hits[i].doc;
//		      Document d = searcher.doc(docId);
//		      System.out.println((i + 1) + ". " + d.get("isbn") + "\t" + d.get("title"));
//		    }
//		    
//		    // reader can only be closed when there is no need to access the documents any more
//		    reader.close();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//	}
//	private static void addDoc(IndexWriter w, String title, String isbn) throws IOException 
//	{
//		  Document doc = new Document();
//		  // A text field will be tokenized
//		  doc.add(new TextField("title" , title, Field.Store.YES));
//		  // We use a string field for isbn because we don\'t want it tokenized
//		  doc.add(new StringField("isbn", isbn, Field.Store.YES));
//		  w.addDocument(doc);
//	}
}




