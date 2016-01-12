package tokenization;

import java.util.LinkedList;
import java.util.List;

// oggetto da passare a lucene
public class DocParser {
	private String text; //testo intero del cv
	private List<String> entity; // lista dei tag del cv
	
	
	public DocParser(){
		entity = new LinkedList<String>();
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

	
}
