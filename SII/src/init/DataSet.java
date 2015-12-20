package init;

import java.util.Iterator;
import java.util.List;

import tokenization.Parser;

public class DataSet {
	private static String cv="PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Città Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Città Milano.. Prov. .MI. Tel. .02/333333.Cell. …335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalità Italiana. Stato civile celibePatente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.";
	
	 public static void main(String[] args) {
		 Parser p= new Parser();
		 List<String> results=p.CreateDataSet(cv);
		 Iterator<String> it= results.iterator();
		 while(it.hasNext())
			 System.out.println("\n"+it.next().toString());
	 }
	 

}
