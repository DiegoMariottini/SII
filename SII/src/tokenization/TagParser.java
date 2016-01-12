package tokenization;

import java.util.List;

public class TagParser {
	private DocParser doc;

	//Costruttore
	public TagParser(){}
	
	//metodo che trasforma un testo in una lista di tag
	public List<String> parseCV(String text){
		doc.setText(text);
		//TODO usare il metodo parse(String text) per ricavare una lista di tag
		return null;
	}
	
	public List<String> parseQuery(String text){
		//TODO fare il parsing dei tag
		return null;
	}
	
	//metodo per aggiornare la lista di tag
	public void updateList(List<String> tag){
		// fare setList al file DocParser doc
	}

}
