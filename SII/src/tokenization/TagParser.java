package tokenization;

import java.io.IOException;
import java.util.*;
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
		//genero la lista di tag da TAGME
		Map<String, LinkedList<String>> tagMap = new HashMap<String, LinkedList<String>>();
		tagMap = getTagsFromText(text);
		dp.setEntity(tagMap.get("entity"));
		dp.setDbpedia(tagMap.get("dbpedia_cat"));
		//aggiungo il cv nel repository
		rep.addDocParser(dp);
		return tagMap.get("entity");
	}

	//metodo per parsare la query
	public List<String> parseQuery(String text){
		//TODO fare il parsing dei tag
		return null;
	}
	
	//metodo per aggiornare la lista di tag
	public void updateList(List<String> tag){
		//sostituisce la lista dei tag del documento con quella data in input
		dp.setEntity(tag);
	}
	
	//metodo per ricavare la lista di tag tramite TAGME
	private Map<String, LinkedList<String>> getTagsFromText(String text) throws UnirestException {
		//TODO ricava la lista di tag tramite TAGME
		Map<String, LinkedList<String>> tagMap = new HashMap<String, LinkedList<String>>();
		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://tagme.di.unipi.it/tag")
				  .header("accept", "application/json")
				  .field("text", text)
				  .field("key", "8020b57e2d41b6041c4fd06937acbec7")
				  .field("lang","it")
				  .field("include_categories","true")
				  .field("long_text", "0")
				  .asJson();
		System.out.println(jsonResponse.getBody().toString());
		JSONObject jsonObject = new JSONObject(jsonResponse.getBody().getObject());
		JSONArray jsonArr = jsonObject.getJSONArray("annotations");
		
		return tagMap;
	}
}
