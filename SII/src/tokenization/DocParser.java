package tokenization;

import java.util.LinkedList;
import java.util.List;

// oggetto da passare a lucene
public class DocParser {
	private String text; //testo intero
	private List<String> entity; // lista dei tag
	private List<String> dbpedia; // lista delle categorie di dbpedia dei tag
	
	public DocParser(){
		entity = new LinkedList<String>();
		dbpedia = new LinkedList<String>();
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public List<String> getEntity() {
		return entity;
	}
	public void setEntity(List<String> entity) {
		this.entity = entity;
	}

	public List<String> getDbpedia() {
		return dbpedia;
	}

	public void setDbpedia(List<String> dbpedia) {
		this.dbpedia = dbpedia;
	}
	
}
