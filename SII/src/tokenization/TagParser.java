package tokenization;

import java.io.IOException;
import java.util.*;

import org.apache.lucene.queryparser.classic.ParseException;
import org.json.*;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import lucene.Repository;

public class TagParser {
	private DocParser dp;
	final Repository rep;

	//Costruttore
	public TagParser(){
		dp = new DocParser();
		rep = new Repository();
	}
	
	//metodo per parsare un nuovo cv
	public List<String> parseCV(String text) throws UnirestException{
		dp.setText(text);
		//genero le liste di tag da TAGME
		Map<String, LinkedList<String>> tagMap = new HashMap<String, LinkedList<String>>();
		tagMap = getTagsFromText(text);
		//imposto il DocParser
		dp.setEntity(tagMap.get("entity"));
		dp.setDbpedia(tagMap.get("dbpedia_cat"));
		//aggiungo il cv nel repository
		rep.addDocParser(dp);
		//print di check della lista di tag ottenuti
		//System.out.println(tagMap.get("entity").toString());
		return tagMap.get("entity");
	}

	//metodo per parsare la query
	public List<DocParser> parseQuery(String text) throws UnirestException{
		//genero le liste di tag della query da TAGME
		Map<String, LinkedList<String>> qtagMap = new HashMap<String, LinkedList<String>>();
		qtagMap = getTagsFromText(text);
		//imposto il DocParser
		dp.setEntity(qtagMap.get("entity"));
		dp.setDbpedia(qtagMap.get("dbpedia_cat"));
		//faccio la search dei documenti nel repository
		List<DocParser> listDP = new LinkedList<DocParser>();
		try {
			listDP = rep.search(dp);
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
		return listDP;
	}
	
	//metodo per aggiornare la lista di tag
	public void updateList(List<String> tag){
		//sostituisce la lista dei tag del documento con quella data in input
		//TODO fare che sistemi anche la lista delle categorie di dbpedia?
		dp.setEntity(tag);
	}
	
	//metodo per ricavare la lista di tag tramite TAGME
	private Map<String, LinkedList<String>> getTagsFromText(String text) throws UnirestException {
		Map<String, LinkedList<String>> tagMap = new HashMap<String, LinkedList<String>>();
		tagMap.put("entity", new LinkedList<String>());
		tagMap.put("dbpedia_cat", new LinkedList<String>());
		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://tagme.di.unipi.it/tag")
				  .header("accept", "application/json")
				  .field("text", text)
				  .field("key", "8020b57e2d41b6041c4fd06937acbec7")
				  .field("lang","it")
				  .field("include_categories","true")
				  .field("long_text", "0")
				  .asJson();
		//print di check dell'oggetto json
		//System.out.println(jsonResponse.getBody().toString() + "\n");
		JSONArray jsonArr = jsonResponse.getBody().getObject().getJSONArray("annotations");
		
		for(int i=0;i<jsonArr.length();i++)
		{
		    JSONObject jOb = jsonArr.getJSONObject(i);
		    String entity = jOb.getString("title");
		    String[] dbcat = new String[jOb.getJSONArray("dbpedia_categories").length()]; 
		    List<String> dbcatList = new LinkedList<String>(Arrays.asList(dbcat));
		    tagMap.get("entity").add(entity);
		    tagMap.get("dbpedia_cat").addAll(dbcatList);
		  }
		return tagMap;
	}
}
