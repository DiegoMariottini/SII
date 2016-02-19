package lucene;



import java.io.File;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

import init.DataSet;
import tokenization.DocParser;
import tokenization.TagParser;

public class Test {
	public static void main(String[] args) throws UnirestException {
//		String cv="Il corso prenderà  in esame vari metodi per la progettazione, l'implementazione e la sperimentazione di sistemi adattivi su Web, realizzati mediante tecniche di Intelligenza Artificiale. Particolare attenzione verrà  posta ai sistemi di Information Retrieval, come i motori di ricerca, e a nuove ed emergenti tecnologie idonee per la realizzazione della prossima generazione di strumenti di ricerca intelligenti e personalizzati. Verranno studiati i modelli di retrieval classici, come il modello vector space e i modelli probabilistici, le tecniche di ranking dei documenti, così come l'algoritmo PageRank utilizzato da Google. Saranno affrontati i metodi di Machine Learning in Information Retrieval, incluse le tecniche per la Sentiment Analysis, i metodi di User Modeling necessari per la ricerca personalizzata, i sistemi di raccomandazione, la scoperta e l'analisi delle comunità on-line e social network (come ad es. Facebook e Twitter). Infine verranno descritti i metodi statistici per la valutazione sperimentale dei suddetti sistemi.";
//		List<String> tags= new LinkedList<String>();
//		TagParser parser= new TagParser();
//		tags= parser.parseTags(cv);
//		parser.saveCV(cv, tags);
//		
//		System.out.println(tags.toString());
		
//		List<String> curricula = new LinkedList<String>();
//		File f= new File("myLucene");
//		if(!f.exists()){
//			curricula.add("Musicista, Roma");
//			curricula.add("Ingegnere informatico, Milano");
//			curricula.add("Cameriera, Napoli");
		//}
		
		Repository r= new Repository(1);
//		DataSet ds= new DataSet();
//		List<DocParser> list_default_doc= ds.getList();
//		r.addDocsParser(list_default_doc);
//		
		TagParser parser= new TagParser();
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("Roma");
		for(DocParser dp1 : lista){
			System.out.println(dp1.getText()+ " \n"+dp1.getWeight() + "\n"+ dp1.getMatchedTags().toString()+ "\n");
		}
		
		
		
	}
}
