package init;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

import tokenization.TagParser;

public class DataSet {
	private List<String> cv;	
	private TagParser tg;
	private List<String> tag;
	
	public DataSet(){
		cv= new LinkedList<String>();
		}
	
	
	public void create () throws UnirestException{
		createListCv();
		//invio ogni singolo cv alla classe TagParser affinch� sia tokenizzato
		Iterator<String> it= cv.iterator();
		while (it.hasNext()){
			String text= it.next();
			tag= tg.parseCV(text);
			tg.updateList(tag);
		}
	}
	
	//inserimento manuale dei cv
	public void createListCv(){
		cv.add("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Citt� Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Citt� Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalit� Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
		cv.add("");
	}
}
