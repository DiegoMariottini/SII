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
	
	//metodo per trovare i tag di un CV in input
	public DocParser parseTags(String text) throws UnirestException{
		dp.setText(text);
		//genero le liste di tag da TAGME
		Map<String, LinkedList<String>> tagMap = new HashMap<String, LinkedList<String>>();
		tagMap = getTagsFromText(text);
		//imposto il DocParser
		dp.setEntity(tagMap.get("entity"));
		dp.setDbpedia(tagMap.get("dbpedia_cat"));
		return dp;
	}
	
	//metodo per salvare un nuovo documento nel repository
	public void saveCV(DocParser dp){
		//aggiungo il cv nel repository
		rep.addDocParser(dp);
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
			if(jOb.has("title")){
				//print di check
				//System.out.println(jOb.toString() + "\n");
				JSONArray jObArr = jOb.getJSONArray("dbpedia_categories");
				//print di check
				//System.out.println(jObArr.toString() + "\n");
				String entity = jOb.getString("title");
				String[] dbcat = new String[jObArr.length()];
				for(int j=0; j<jObArr.length(); j++){
					dbcat[j] = jObArr.getString(j);
				};
				List<String> dbcatList = new LinkedList<String>(Arrays.asList(dbcat));
				tagMap.get("entity").add(entity);
				tagMap.get("dbpedia_cat").addAll(dbcatList);
			}
			else {
				String entity = jOb.getString("spot");
				tagMap.get("entity").add(entity);
			}
		  }
		return tagMap;
	}
}
