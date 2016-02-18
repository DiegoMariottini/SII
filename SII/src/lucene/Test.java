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
		List<String> curricula = new LinkedList<String>();
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
		
		TagParser parser= new TagParser();
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("Microsoft");
		for(DocParser dp1 : lista){
			System.out.println(dp1.getText()+ " \n"+dp1.getWeight() + "\n");
		}
		
		
		
	}
}
