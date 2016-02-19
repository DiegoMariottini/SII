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
		String cv="Ragazza italiana di Roma, laureata in ingegneria informatica alla Sapienza e alla magistrale a Roma tre. Esperienza di anni presso azinede di settore quali Google, Microsoft, Facebook, Whatsapp. Specializzata in programmazione java, android, c, c++, programmazione a oggetti, html, xml. Disponibile a viaggiare anche all'estero. Esperta in lingua inglese, francese, tedesco e spagnolo.";
		List<String> tags= new LinkedList<String>();
		TagParser parser= new TagParser();
		tags= parser.parseTags(cv);
		tags.remove(0);
		parser.saveCV(cv, tags);
		
//		List<String> curricula = new LinkedList<String>();
//		File f= new File("myLucene");
//		if(!f.exists()){
//			curricula.add("Musicista, Roma");
//			curricula.add("Ingegnere informatico, Milano");
//			curricula.add("Cameriera, Napoli");
		//}
		
//		Repository r= new Repository(1);
//		DataSet ds= new DataSet();
//		List<DocParser> list_default_doc= ds.getList();
//		r.addDocsParser(list_default_doc);
//		
//		TagParser parser= new TagParser();
//		List<DocParser> lista = new LinkedList<DocParser>();
//		lista = parser.parseQuery("Roma");
//		for(DocParser dp1 : lista){
//			System.out.println(dp1.getText()+ " \n"+dp1.getWeight() + "\n"+ dp1.getMatchedTags().toString()+ "\n");
//		}
//		
		
		
	}
}
