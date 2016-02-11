package tokenization;

import java.util.*;

import com.mashape.unirest.http.exceptions.UnirestException;

public class TagParserTest {

	public static void main(String[] args) throws UnirestException {
		TagParser parser = new TagParser();
		List<String> CV = new LinkedList<String>();
		CV.add("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Citt� Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Citt� Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalit� Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
		CV.add("Elena Rossi Luogo di nascita: Bologna Data di nascita: 1 settembre 1968 Cittadinanza: italiana Stato civile : nubile Residenza: Roma, Via Aurelio, 24 (CAP 00190) Tel: 06 000000 STUDI Università: 1993 : Laurea in Lettere moderne all'Università degli Studi Roma 3");
		/*CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");
		CV.add("");*/
		for(String s : CV){
			parser.parseCV(s);
		}
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("Pescara");
		for(DocParser dp : lista){
			System.out.println(dp.getText() + "\n");
		}
	}

}
