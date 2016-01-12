package tokenization;

import java.util.List;

public class TagParser {
	private DocParser doc;

	//Costruttore
	public TagParser(){}
	
	//metodo che trasforma un testo in una lista di tag
	public List<String> parse(String text){
		doc.setText(text);
		
		//TODO
		return null;
	}
	
	//metodo per aggiornare la lista di tag
	public void updateList(List<String> tag){
		// fare setList al file DocParser doc
	}

	
		
}
