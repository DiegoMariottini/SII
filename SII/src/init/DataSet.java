package init;


import java.util.LinkedList;
import java.util.List;

import tokenization.DocParser;


public class DataSet {
	private List<DocParser> cv=new LinkedList<DocParser>();	

	public DataSet(){
		List<String> entity_list= new LinkedList<String>();
		List<String> dbpedia_list= new LinkedList<String>();
		DocParser dp1= new DocParser();
		dp1.setText("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Città Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Città Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalità Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("Paolo Rossi");
		entity_list.add("Pescara");
		entity_list.add("Milano");
		entity_list.add("Italia");
		entity_list.add("Patente di guida");
		entity_list.add("Servizio civile");
		entity_list.add("Volontariato");
		entity_list.add("Assistente sociale");
		dbpedia_list.add("Pescara");
		dbpedia_list.add("Comuni della provincia di Pescara");
		dbpedia_list.add("Milano");
		dbpedia_list.add("Italia");
		dbpedia_list.add("Patenti");
		dbpedia_list.add("Solidarietà");
		dbpedia_list.add("Volontariato");
		dbpedia_list.add("Assistenza sociale");
		dbpedia_list.add("Diritto dei minori");
		dp1.setEntity(entity_list);
		dp1.setDbpedia(dbpedia_list);
		cv.add(dp1);
		
		DocParser dp2= new DocParser();
		dp2.setText("Sono un esperto di Web Marketing (campagne Google Adwords, Bing e Facebook) e posizionamento organico di siti web. Posso vantare un'esperienza di oltre 6 anni e la gestione con successo di budget pubblicitari ingenti. Metto a disposizione le mie competenze per aiutare le aziende ed i privati ad ottenere il massimo dalla loro presenza online. Lavoro come freelance, coadiuvato da un team di altri professionisti, anche loro freelance, in modo da garantire la massima professionalità e mantenere bassi i costi per il cliente.Città: Firenze, Provincia: Firenze");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("Web marketing");
		entity_list.add("Google");
		entity_list.add("Bing");
		entity_list.add("Facebook");
		entity_list.add("Sito web");
		entity_list.add("Pubblicità");
		entity_list.add("Internet");
		entity_list.add("Freelance");
		entity_list.add("Libero professionista");		
		dbpedia_list.add("Provincia di Firenze");
		dbpedia_list.add("Firenze");
		dbpedia_list.add("Marketing");
		dbpedia_list.add("Google");
		dbpedia_list.add("Motori di ricerca");
		dbpedia_list.add("Microsoft");
		dbpedia_list.add("Facebook");
		dbpedia_list.add("Pubblicità");
		dp2.setEntity(entity_list);
		dp2.setDbpedia(dbpedia_list);
		cv.add(dp2);
		
//		DocParser dp3= new DocParser();
//		dp3.setText("Cerco lavoro come educatrice: ho esperienze in vari settori, dall'animazione all'assistenza ad personam ed anche come educatrice in asilo nido. tel 320.0645731, Città: Salò, Provincia: Brescia");
//		entity_list.clear();
//		dbpedia_list.clear();
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		entity_list.add("");
//		//
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dbpedia_list.add("");
//		dp3.setEntity(entity_list);
//		dp3.setDbpedia(dbpedia_list);
//		cv.add(dp3);
//	
	}
	
	
	public List<DocParser> getList() {
		return cv;
	}

	/*
	 
		
		
		DocParser dp4= new DocParser();
		dp4.setText("Anna Paola Conte, Via Ariosto 88, 40126 Bologna (Italia), +39 06123456 +39 312345678, annapaola.conte@example.it, OCCUPAZIONE DESIDERATA Gesitone risorse umane ESPERIENZA PROFESSIONALE gennaio 2005 - alla data attuale Assistente amministrativo Alma Mater Studiorum Via Zamboni 37 40126 Bologna, Gestione della documentazione contabile generale, fiscale e tributaria, relazione con la clientela e il pubblico, settembre 2001 - agosto 2004 Tirocinio Cooperativa Tirrenica Via Enrico Fermi 45 45133 Bologna Analisi Curriculum Vitae, gestione dei colloqui, rapporto con la clientela (fornitori, pubblico, personale interno)");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp4);
		
		
		DocParser dp5= new DocParser();
		dp5.setText("ELETTRICISTA qualificato 48 anni italiano esperienza trentennale impianti elettrici e tecnologici civile ed industriale cerca serio impiego presso importante e strutturata azienda del settore no ag. servizi o interinali Roberto");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp5);
		
		
		DocParser dp6= new DocParser();
		dp6.setText("IDRAULICO ed elettricista esperto cerca lavoro anche come badante");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp6);
		
		
		
		DocParser dp7= new DocParser();
		dp7.setText("RAGAZZA iscritta a garanzia giovani residente a Roma centro cerca azienda per stage addetta inserimento dati max 25 ore settimana esperienza segreteria preferenza campo: agroalimentare informatico lingue mail claudialidi@libero.it");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp7);
		
		DocParser dp8= new DocParser();
		dp8.setText("AUTISTA patente B-D italiano 50enne diplomato informatico inoccupato non fumatore offresi come autista per commissioni o altro anche in centro risiedo a Roma Sud");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp8);
		
		DocParser dp9= new DocParser();
		dp9.setText("Carlo Bianchi, Ruolo: IT Manager, Responsabilità:  - Gestione di un parco macchine di circa 70 client. - Sviluppo, manutenzione e personalizzazione di applicativi Ad-hoc. - Implementazione e gestione di un architettura complessa che prevede la convivenza di  Linux e Windows sia dal lato client che dal lato server.- Help desk di primo e secondo livello, configurazione, manutenzione dei sistemi informativi aziendali a livello sistemistico. - Implementazione del gestionale. - Gestione fornitori.");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp9);
		
		DocParser dp10= new DocParser();
		dp10.setText("C.V. Istituto tecnico industriale Enrico Fermi 73/100 informatica età 21 cerco lavoro come magazziniere operaio barista cameriere informatico iacchetti.daniele@gmail.com");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp10);
		
		DocParser dp11= new DocParser();
		dp11.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp11);
		
		DocParser dp12= new DocParser();
		dp12.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp12);
		
		DocParser dp13= new DocParser();
		dp13.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp13);
		
		DocParser dp14= new DocParser();
		dp14.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp14);
		
		DocParser dp15= new DocParser();
		dp15.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp15);
		
		DocParser dp16= new DocParser();
		dp16.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp16);
		
		DocParser dp17= new DocParser();
		dp17.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp17);
		
		DocParser dp18= new DocParser();
		dp18.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp18);
		
		DocParser dp19= new DocParser();
		dp19.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp19);
		
		DocParser dp20= new DocParser();
		dp20.setText("");
		entity_list.clear();
		dbpedia_list.clear();
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		entity_list.add("");
		//
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dbpedia_list.add("");
		dp.setEntity(entity_list);
		dp.setDbpedia(dbpedia_list);
		cv.add(dp20);
		
//		cv.add("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Città Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Città Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalità Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
//		cv.add("Sono un esperto di Web Marketing (campagne Google Adwords, Bing e Facebook) e posizionamento organico di siti web. Posso vantare un'esperienza di oltre 6 anni e la gestione con successo di budget pubblicitari ingenti. Metto a disposizione le mie competenze per aiutare le aziende ed i privati ad ottenere il massimo dalla loro presenza online. Lavoro come freelance, coadiuvato da un team di altri professionisti, anche loro freelance, in modo da garantire la massima professionalità e mantenere bassi i costi per il cliente.Città: Firenze, Provincia: Firenze");
//		cv.add("Cerco lavoro come educatrice: ho esperienze in vari settori, dall'animazione all'assistenza ad personam ed anche come educatrice in asilo nido. tel 320.0645731, Città: Salò, Provincia: Brescia");
//		cv.add("Anna Paola Conte, Via Ariosto 88, 40126 Bologna (Italia), +39 06123456 +39 312345678, annapaola.conte@example.it, OCCUPAZIONE DESIDERATA Gesitone risorse umane ESPERIENZA PROFESSIONALE gennaio 2005 - alla data attuale Assistente amministrativo Alma Mater Studiorum Via Zamboni 37 40126 Bologna, Gestione della documentazione contabile generale, fiscale e tributaria, relazione con la clientela e il pubblico, settembre 2001 - agosto 2004 Tirocinio Cooperativa Tirrenica Via Enrico Fermi 45 45133 Bologna Analisi Curriculum Vitae, gestione dei colloqui, rapporto con la clientela (fornitori, pubblico, personale interno)");
//		cv.add("ELETTRICISTA qualificato 48 anni italiano esperienza trentennale impianti elettrici e tecnologici civile ed industriale cerca serio impiego presso importante e strutturata azienda del settore no ag. servizi o interinali Roberto");
//		cv.add("IDRAULICO ed elettricista esperto cerca lavoro anche come badante");
//		cv.add("RAGAZZA iscritta a garanzia giovani residente a Roma centro cerca azienda per stage addetta inserimento dati max 25 ore settimana esperienza segreteria preferenza campo: agroalimentare informatico lingue mail claudialidi@libero.it");
//		cv.add("AUTISTA patente B-D italiano 50enne diplomato informatico inoccupato non fumatore offresi come autista per commissioni o altro anche in centro risiedo a Roma Sud");
//		cv.add("Carlo Bianchi, Ruolo: IT Manager, Responsabilità:  - Gestione di un parco macchine di circa 70 client. - Sviluppo, manutenzione e personalizzazione di applicativi Ad-hoc. - Implementazione e gestione di un architettura complessa che prevede la convivenza di  Linux e Windows sia dal lato client che dal lato server.- Help desk di primo e secondo livello, configurazione, manutenzione dei sistemi informativi aziendali a livello sistemistico. - Implementazione del gestionale. - Gestione fornitori.");
//		cv.add("C.V. Istituto tecnico industriale Enrico Fermi 73/100 informatica età 21 cerco lavoro come magazziniere operaio barista cameriere informatico iacchetti.daniele@gmail.com");
//		cv.add("RAGAZZO perito informatico 26 anni cerca lavoro esperienze lavorative cassiere addetto vendita corriere tecnico informatico rapido apprendimento curriculum disponibile contattare tramite email/cellulare");
//		cv.add("40ENNE informatico sistemista Microsoft tecnico Hardware Web Designer esperienza 18 anni patente europea cerca lavoro nella grafica web html flash oppure qualsiasi altro lavoro ottime referenzte tel. ore pasti");
//		cv.add("LAVORO in ambito informatico e dei computer in generale. Varie conoscenze informatiche con attestato come Tecnico Sistemi Multimediali. Particolarmente capace a risolvere problemi sia a livello software che a livello hardware.");
//		cv.add("CUOCO russo 32 anni con esperienza dall'antipasto al dessert esperto griglista carne e pesce ho fatto corso di Scuola Italiana Pizzaioli serio professionale puntuale residente Roma Acilia. Alex alexandr.roma55@gmail.com");
//		cv.add("MANOVALE Pittore Controsoffitti Pavimentista Piastrellista del mestiere da generazione di famiglia cerca lavoro anche a giornata Max serietà e manifattura Claudio tel.333 8820598");
//		cv.add("PENSIONATO ex insegnante informatica matematica musicista colto educato cerca incarico (tutor o insegn. informatica aiuto compiti lavori vari segreteria ecc.) disposto viaggiare no vendita. tel. 347 9629591");
//		cv.add("PASTICCERE con molta esperienza nella migliore pasticceria di Roma esperienza di lavoro: torta decorazioni torta cornetto sfoglia frolla mignon biscotti Gmail: mahajabin98@gmail.com tel. 342 7768040");
//		cv.add("MURATORE autonomo abile esperto mastro 3°livello esegue lavori di ristrutturazioni complete piastrellista pittore rifinito pavimenti bagni cucine terrazzi muri intonaci rasature guaina porfido scorza copertina conoscenza materiali e disegno djmaaa@libero.it tel. 349 4387309");
//		cv.add("IMBIANCHINO altamente qualificato mastro muratore piastrellista specializzato esperto rifinito in opere murarie generali d'interni ed esterni ottima conoscenza disegno e materiali offresi per ditte e privati anche trasporto con furgoncino djmaaa@libero.it tel. 339 8178123");
//		cv.add("CUOCO Italiano residente a Mentana serio professionale e molto devoto al lavoro cerca immediata sistemazione x lavoro solo serale in zona sono capace di apportare le mie conoscenze ed esperienze al servizio di chi volesse contattarmi antonio10alex@yahoo.it tel. 338 1633196");


//		cv.add(""); 
	  */
	
}
