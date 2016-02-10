package tokenization;

import java.util.*;

import com.mashape.unirest.http.exceptions.UnirestException;

public class TagParserTest {

	public static void main(String[] args) throws UnirestException {
		String prova1 = "PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Citt� Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Citt� Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalit� Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.";
		String prova2 = "Andreoli Enterprise direttore";
		TagParser parser = new TagParser();
		parser.parseCV(prova1);
		parser.parseCV(prova2);
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("Pescara");
		for(DocParser dp : lista){
			System.out.println(dp.getText() + "\n");
		}
	}

}
