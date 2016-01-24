package tokenization;

import java.util.LinkedList;
import java.util.List;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class TagParser {
	private DocParser doc;
	private List<String> tags;

	//Costruttore
	public TagParser(){}
	
	//metodo per parsare un nuovo cv
	public List<String> parseCV(String text) throws UnirestException{
		doc.setText(text);
		//genero la lista di tag da TAGME
		tags = getTagsFromText(text);
		doc.setEntity(tags);
		return tags;
	}

	//metodo per parsare la query
	public List<String> parseQuery(String text){
		//TODO fare il parsing dei tag
		return null;
	}
	
	//metodo per aggiornare la lista di tag
	public void updateList(List<String> tag){
		//sostituisce la lista dei tag del documento con quella data in input
		doc.setEntity(tag);
	}
	
	//metodo per ricavare la lista di tag tramite TAGME
	private List<String> getTagsFromText(String text) throws UnirestException {
		//TODO ricava la lista di tag tramite TAGME
		List<String> tagList = new LinkedList<String>();
		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://tagme.di.unipi.it/tag")
				  .header("accept", "application/json")
				  .field("text", text)
				  .field("key", "8020b57e2d41b6041c4fd06937acbec7")
				  .field("lang","it")
				  .field("include_categories","true")
				  .field("long_text", "0")
				  .asJson();
		return tagList;
	}
}
