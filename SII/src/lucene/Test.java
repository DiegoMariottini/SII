package lucene;


import java.util.LinkedList;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

import tokenization.DocParser;
import tokenization.TagParser;

public class Test {
	public static void main(String[] args) throws UnirestException {
		List<String> curricula = new LinkedList<String>();
//		curricula.add("Musicista, Roma");
//		curricula.add("Ingegnere informatico, Milano");
//		curricula.add("Cameriera, Napoli");
		
		
		TagParser parser = new TagParser();
		DocParser dp= new DocParser();
		for(String s : curricula){
			dp = parser.parseTags(s);
			parser.saveCV(dp);
		}
		
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("maestra d'asilo");
		for(DocParser dp1 : lista){
			System.out.println(dp1.getText()+ " \n"+dp1.getWeight() + "\n");
		}
		
	}
}
