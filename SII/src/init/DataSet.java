package init;


import java.util.LinkedList;
import java.util.List;

import tokenization.DocParser;


public class DataSet {
	private List<DocParser> cv=new LinkedList<DocParser>();	

	public DataSet(){
		List<String> entity_list1= new LinkedList<String>();
		List<String> dbpedia_list1= new LinkedList<String>();
		DocParser dp1= new DocParser();
		dp1.setText("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Città Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Città Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalità Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
		entity_list1.clear();
		dbpedia_list1.clear();
		entity_list1.add("Paolo Rossi");
		entity_list1.add("Pescara");
		entity_list1.add("Milano");
		entity_list1.add("Italia");
		entity_list1.add("Patente di guida");
		entity_list1.add("Servizio civile");
		entity_list1.add("Volontariato");
		entity_list1.add("Assistente sociale");
		dbpedia_list1.add("Pescara");
		dbpedia_list1.add("Comuni della provincia di Pescara");
		dbpedia_list1.add("Milano");
		dbpedia_list1.add("Italia");
		dbpedia_list1.add("Patenti");
		dbpedia_list1.add("Solidarietà");
		dbpedia_list1.add("Volontariato");
		dbpedia_list1.add("Assistenza sociale");
		dbpedia_list1.add("Diritto dei minori");
		dp1.setEntity(entity_list1);
		dp1.setDbpedia(dbpedia_list1);
		cv.add(dp1);
		
		List<String> entity_list2= new LinkedList<String>();
		List<String> dbpedia_list2= new LinkedList<String>();
		DocParser dp2= new DocParser();
		dp2.setText("Sono un esperto di Web Marketing (campagne Google Adwords, Bing e Facebook) e posizionamento organico di siti web. Posso vantare un'esperienza di oltre 6 anni e la gestione con successo di budget pubblicitari ingenti. Metto a disposizione le mie competenze per aiutare le aziende ed i privati ad ottenere il massimo dalla loro presenza online. Lavoro come freelance, coadiuvato da un team di altri professionisti, anche loro freelance, in modo da garantire la massima professionalità e mantenere bassi i costi per il cliente.Città: Firenze, Provincia: Firenze");
		entity_list2.clear();
		dbpedia_list2.clear();
		entity_list2.add("Web marketing");
		entity_list2.add("Google");
		entity_list2.add("Bing");
		entity_list2.add("Facebook");
		entity_list2.add("Sito web");
		entity_list2.add("Pubblicità");
		entity_list2.add("Internet");
		entity_list2.add("Freelance");
		entity_list2.add("Libero professionista");		
		dbpedia_list2.add("Provincia di Firenze");
		dbpedia_list2.add("Firenze");
		dbpedia_list2.add("Marketing");
		dbpedia_list2.add("Google");
		dbpedia_list2.add("Motori di ricerca");
		dbpedia_list2.add("Microsoft");
		dbpedia_list2.add("Facebook");
		dbpedia_list2.add("Pubblicità");
		dp2.setEntity(entity_list2);
		dp2.setDbpedia(dbpedia_list2);
		cv.add(dp2);
		
		List<String> entity_list3= new LinkedList<String>();
		List<String> dbpedia_list3= new LinkedList<String>();
		DocParser dp3= new DocParser();
		dp3.setText("Cerco lavoro come educatrice: ho esperienze in vari settori, dall'animazione all'assistenza ad personam ed anche come educatrice in asilo nido. tel 320.0645731, Città: Salò, Provincia: Brescia");
		entity_list3.clear();
		dbpedia_list3.clear();
		entity_list3.add("Educatrice");
		entity_list3.add("Animazione");
		entity_list3.add("Assistenza ad personam");
		entity_list3.add("Asilo nido");
		entity_list3.add("Salo");
		entity_list3.add("Brescia");
		//
		dbpedia_list3.add("Educatore");
		dbpedia_list3.add("Animazione");
		dbpedia_list3.add("Ad personam");
		dbpedia_list3.add("Provincia di Brescia");
		dbpedia_list3.add("Asilo nido");
		dbpedia_list3.add("Brescia");
		dbpedia_list3.add("Assistenza");
		dp3.setEntity(entity_list3);
		dp3.setDbpedia(dbpedia_list3);
		cv.add(dp3);
		
		List<String> entity_list4= new LinkedList<String>();
		List<String> dbpedia_list4= new LinkedList<String>();
		DocParser dp4= new DocParser();
		dp4.setText("Anna Paola Conte, Via Ariosto 88, 40126 Bologna (Italia), +39 06123456 +39 312345678, annapaola.conte@example.it, OCCUPAZIONE DESIDERATA Gesitone risorse umane ESPERIENZA PROFESSIONALE gennaio 2005 - alla data attuale Assistente amministrativo Alma Mater Studiorum Via Zamboni 37 40126 Bologna, Gestione della documentazione contabile generale, fiscale e tributaria, relazione con la clientela e il pubblico, settembre 2001 - agosto 2004 Tirocinio Cooperativa Tirrenica Via Enrico Fermi 45 45133 Bologna Analisi Curriculum Vitae, gestione dei colloqui, rapporto con la clientela (fornitori, pubblico, personale interno)");
		entity_list4.clear();
		dbpedia_list4.clear();
		entity_list4.add("Anna Paola Conte");
		entity_list4.add("Bologna");
		entity_list4.add("Italia");
		entity_list4.add("Risorse umane");
		entity_list4.add("Assistente amministrativo");
		entity_list4.add("Documentazione contabile generale");
		entity_list4.add("Rapporto con la clientela");
		entity_list4.add("Fiscale");
		entity_list4.add("Tributaria");
		entity_list4.add("Relazione con la clientela");
		//
		dbpedia_list4.add("Bologna");
		dbpedia_list4.add("Italia");
		dbpedia_list4.add("Risorse umane");
		dbpedia_list4.add("Assistente");
		dbpedia_list4.add("Gestione, amministrazione, esercizio");
		dbpedia_list4.add("Ragioneria");
		dbpedia_list4.add("Diritto");
		dp4.setEntity(entity_list4);
		dp4.setDbpedia(dbpedia_list4);
		cv.add(dp4);
		
		List<String> entity_list5= new LinkedList<String>();
		List<String> dbpedia_list5= new LinkedList<String>();
		DocParser dp5= new DocParser();
		dp5.setText("ELETTRICISTA qualificato 48 anni italiano esperienza trentennale impianti elettrici e tecnologici civile ed industriale cerca serio impiego presso importante e strutturata azienda del settore no ag. servizi o interinali Roberto");
		entity_list5.clear();
		dbpedia_list5.clear();
		entity_list5.add("Elettricista");
		entity_list5.add("Italia");
		entity_list5.add("Impianti elettrici");
		entity_list5.add("Impianti tecnologici");
		entity_list5.add("Impianti civili");
		entity_list5.add("Impianti industriali");
		//
		dbpedia_list5.add("Elettricità");
		dbpedia_list5.add("Italia");
		dbpedia_list5.add("Elettrico");
		dbpedia_list5.add("Tecnologia");
		dbpedia_list5.add("Ingegneria civile");
		dbpedia_list5.add("Industriale");
		dp5.setEntity(entity_list5);
		dp5.setDbpedia(dbpedia_list5);
		cv.add(dp5);
		List<String> entity_list6= new LinkedList<String>();
		List<String> dbpedia_list6= new LinkedList<String>();
		DocParser dp6= new DocParser();
		dp6.setText("IDRAULICO ed elettricista esperto cerca lavoro anche come badante");
		entity_list6.clear();
		dbpedia_list6.clear();
		entity_list6.add("Idraulico");
		entity_list6.add("Elettricista");
		entity_list6.add("Badante");
		//
		dbpedia_list6.add("Idraulica");
		dbpedia_list6.add("Elettricità");
		dbpedia_list6.add("Anziani");
		dp6.setEntity(entity_list6);
		dp6.setDbpedia(dbpedia_list6);
		cv.add(dp6);
		
		
		List<String> entity_list7= new LinkedList<String>();
		List<String> dbpedia_list7= new LinkedList<String>();
		DocParser dp7= new DocParser();
		dp7.setText("RAGAZZA iscritta a garanzia giovani residente a Roma centro cerca azienda per stage addetta inserimento dati max 25 ore settimana esperienza segreteria preferenza campo: agroalimentare informatico lingue mail claudialidi@libero.it");
		entity_list7.clear();
		dbpedia_list7.clear();
		entity_list7.add("Garanzia giovani");
		entity_list7.add("Roma");
		entity_list7.add("Stage");
		entity_list7.add("Segreteria");
		//
		dbpedia_list7.add("Roma");
		dbpedia_list7.add("Italia");
		dbpedia_list7.add("Tirocinio");
		dbpedia_list7.add("Agroalimentare");
		dbpedia_list7.add("Informatico");
		dbpedia_list7.add("Lingue");
		dp7.setEntity(entity_list7);
		dp7.setDbpedia(dbpedia_list7);
		cv.add(dp7);
		
		List<String> entity_list8= new LinkedList<String>();
		List<String> dbpedia_list8= new LinkedList<String>();
		DocParser dp8= new DocParser();
		dp8.setText("AUTISTA patente B-D italiano 50enne diplomato informatico inoccupato non fumatore offresi come autista per commissioni o altro anche in centro risiedo a Roma Sud");
		entity_list8.clear();
		dbpedia_list8.clear();
		entity_list8.add("Autista");
		entity_list8.add("Patente b");
		entity_list8.add("Patente d");
		entity_list8.add("Diplomato informatico");
		entity_list8.add("Roma");
		//
		dbpedia_list8.add("Italiano");
		dbpedia_list8.add("Italia");
		dbpedia_list8.add("Roma");
		dbpedia_list8.add("Informatico");
		dbpedia_list8.add("Programmatore");
		dp8.setEntity(entity_list8);
		dp8.setDbpedia(dbpedia_list8);
		cv.add(dp8);
		
		List<String> entity_list9= new LinkedList<String>();
		List<String> dbpedia_list9= new LinkedList<String>();
		DocParser dp9= new DocParser();
		dp9.setText("Carlo Bianchi, Ruolo: IT Manager, Responsabilità:  - Gestione di un parco macchine di circa 70 client. - Sviluppo, manutenzione e personalizzazione di applicativi Ad-hoc. - Implementazione e gestione di un architettura complessa che prevede la convivenza di  Linux e Windows sia dal lato client che dal lato server.- Help desk di primo e secondo livello, configurazione, manutenzione dei sistemi informativi aziendali a livello sistemistico. - Implementazione del gestionale. - Gestione fornitori.");
		entity_list9.clear();
		dbpedia_list9.clear();
		entity_list9.add("Carlo Bianchi");
		entity_list9.add("Manager");
		entity_list9.add("Gestione");
		entity_list9.add("Sviluppo, manutenzione");
		entity_list9.add("Linux");
		entity_list9.add("Windows");
		entity_list9.add("Client e server");
		entity_list9.add("Help desk");
		entity_list9.add("Sistemi informativi aziendali");
		entity_list9.add("Gestione fornitori");
		//
		dbpedia_list9.add("Client");
		dbpedia_list9.add("Sviluppo");
		dbpedia_list9.add("Informatica");
		dbpedia_list9.add("Programmatore");
		dbpedia_list9.add("Sviluppatore");
		dbpedia_list9.add("Linux");
		dbpedia_list9.add("Microsoft");
		dbpedia_list9.add("Implementazione");
		dbpedia_list9.add("Planning");
		dbpedia_list9.add("Server");
		dp9.setEntity(entity_list9);
		dp9.setDbpedia(dbpedia_list9);
		cv.add(dp9);
		
		List<String> entity_list10= new LinkedList<String>();
		List<String> dbpedia_list10= new LinkedList<String>();
		DocParser dp10= new DocParser();
		dp10.setText("C.V. Istituto tecnico industriale Enrico Fermi 73/100 informatica età 21 cerco lavoro come magazziniere operaio barista cameriere informatico iacchetti.daniele@gmail.com");
		entity_list10.clear();
		dbpedia_list10.clear();
		entity_list10.add("Istituto tecnico industriale");
		entity_list10.add("Informatica");
		entity_list10.add("Magazziniere");
		entity_list10.add("Operaio");
		entity_list10.add("Barista");
		entity_list10.add("Cameriere");
		entity_list10.add("Informatico");
		//
		dbpedia_list10.add("Istituto tecnico");
		dbpedia_list10.add("Informatica");
		dbpedia_list10.add("Magazzino");
		dbpedia_list10.add("Bar");
		dbpedia_list10.add("Pubblico esercizio");
		dp10.setEntity(entity_list10);
		dp10.setDbpedia(dbpedia_list10);
		cv.add(dp10);

		List<String> entity_list11= new LinkedList<String>();
		List<String> dbpedia_list11= new LinkedList<String>();
		DocParser dp11= new DocParser();
		dp11.setText("RAGAZZO perito informatico 26 anni cerca lavoro esperienze lavorative cassiere addetto vendita corriere tecnico informatico rapido apprendimento curriculum disponibile contattare tramite email/cellulare");
		entity_list11.clear();
		dbpedia_list11.clear();
		entity_list11.add("Perito informatico");
		entity_list11.add("Cassiere");
		entity_list11.add("Addetto vendita");
		entity_list11.add("Corriere");
		entity_list11.add("Tecnico informatico");
		//
		dbpedia_list11.add("Perito");
		dbpedia_list11.add("Informatica");
		dbpedia_list11.add("Corriere");
		dbpedia_list11.add("Compravendita");
		dbpedia_list11.add("Programmatore");
		dp11.setEntity(entity_list11);
		dp11.setDbpedia(dbpedia_list11);
		cv.add(dp11);
		
		List<String> entity_list12= new LinkedList<String>();
		List<String> dbpedia_list12= new LinkedList<String>();
		DocParser dp12= new DocParser();
		dp12.setText("LAVORO in ambito informatico e dei computer in generale. Varie conoscenze informatiche con attestato come Tecnico Sistemi Multimediali. Particolarmente capace a risolvere problemi sia a livello software che a livello hardware.");
		entity_list12.clear();
		dbpedia_list12.clear();
		entity_list12.add("Informatico");
		entity_list12.add("Computer");
		entity_list12.add("Conoscenze informatiche");
		entity_list12.add("Tecnico Sistemi Multimediali");
		entity_list12.add("Software ");
		entity_list12.add("Hardware");
		//
		dbpedia_list12.add("Informatica");
		dbpedia_list12.add("Computer");
		dbpedia_list12.add("Sistema");
		dbpedia_list12.add("Programmatore");
		dbpedia_list12.add("Software");
		dbpedia_list12.add("Hardware");
		dbpedia_list12.add("Tecnico");
		dp12.setEntity(entity_list12);
		dp12.setDbpedia(dbpedia_list12);
		cv.add(dp12);
		
		List<String> entity_list13= new LinkedList<String>();
		List<String> dbpedia_list13= new LinkedList<String>();
		DocParser dp13= new DocParser();
		dp13.setText("CUOCO Italiano residente a Mentana serio professionale e molto devoto al lavoro cerca immediata sistemazione x lavoro solo serale in zona sono capace di apportare le mie conoscenze ed esperienze al servizio di chi volesse contattarmi antonio10alex@yahoo.it tel. 338 1633196");
		entity_list13.clear();
		dbpedia_list13.clear();
		entity_list13.add("Cuoco");
		entity_list13.add("Italiano");
		entity_list13.add("Mentana");
		//
		dbpedia_list13.add("Cucina");
		dbpedia_list13.add("Lingua italiana");
		dbpedia_list13.add("Italia");
		dp13.setEntity(entity_list13);
		dp13.setDbpedia(dbpedia_list13);
		cv.add(dp13);
		
		List<String> entity_list14= new LinkedList<String>();
		List<String> dbpedia_list14= new LinkedList<String>();
		DocParser dp14= new DocParser();
		dp14.setText("IMBIANCHINO altamente qualificato mastro muratore piastrellista specializzato esperto rifinito in opere murarie generali d'interni ed esterni ottima conoscenza disegno e materiali offresi per ditte e privati anche trasporto con furgoncino djmaaa@libero.it tel. 339 8178123");
		entity_list14.clear();
		dbpedia_list14.clear();
		entity_list14.add("Imbianchino");
		entity_list14.add("Piastrellista");
		entity_list14.add("Muratore");
		entity_list14.add("Opere murarie");
		entity_list14.add("Conoscenza disegno");
		//
		dbpedia_list14.add("Disegno");
		dbpedia_list14.add("Trasporto");
		dbpedia_list14.add("Italiana");
		dbpedia_list14.add("Edilizia");
		dbpedia_list14.add("Piastrella");
		dbpedia_list14.add("Mura (architettura)");
		dbpedia_list14.add("Furgone");
		dp14.setEntity(entity_list14);
		dp14.setDbpedia(dbpedia_list14);
		cv.add(dp14);
		
		List<String> entity_list15= new LinkedList<String>();
		List<String> dbpedia_list15= new LinkedList<String>();
		DocParser dp15= new DocParser();
		dp15.setText("MURATORE autonomo abile esperto mastro 3°livello esegue lavori di ristrutturazioni complete piastrellista pittore rifinito pavimenti bagni cucine terrazzi muri intonaci rasature guaina porfido scorza copertina conoscenza materiali e disegno djmaaa@libero.it tel. 349 4387309");
		entity_list15.clear();
		dbpedia_list15.clear();
		entity_list15.add("Muratore");
		entity_list15.add("Mastro");
		entity_list15.add("Lavori di ristrutturazioni");
		entity_list15.add("Piastrellista");
		entity_list15.add("Pittore");
		entity_list15.add("Pavimenti");
		entity_list15.add("Bagni");
		entity_list15.add("Cucine");
		entity_list15.add("Terrazzi ");
		entity_list15.add("Muri intonaci rasature");
		//
		dbpedia_list15.add("Edilizia");
		dbpedia_list15.add("Intervento");
		dbpedia_list15.add("Piastrella");
		dbpedia_list15.add("Stanza");
		dbpedia_list15.add("Muratura");
		dbpedia_list15.add("Pavimento");
		dbpedia_list15.add("Bagno");
		dbpedia_list15.add("Terrazzo");
		dbpedia_list15.add("Muro");
		dbpedia_list15.add("Cucina");
		dp15.setEntity(entity_list15);
		dp15.setDbpedia(dbpedia_list15);
		cv.add(dp15);
		
		List<String> entity_list16= new LinkedList<String>();
		List<String> dbpedia_list16= new LinkedList<String>();
		DocParser dp16= new DocParser();
		dp16.setText("PASTICCERE con molta esperienza nella migliore pasticceria di Roma esperienza di lavoro: torta decorazioni torta cornetto sfoglia frolla mignon biscotti Gmail: mahajabin98@gmail.com tel. 342 7768040");
		entity_list16.clear();
		dbpedia_list16.clear();
		entity_list16.add("Pasticcere");
		entity_list16.add("Roma");
		entity_list16.add("Decorazioni");
		entity_list16.add("Torta");
		entity_list16.add("Cornetto");
		entity_list16.add("Sfoglia");
		entity_list16.add("Frolla");
		entity_list16.add("Mignon");
		entity_list16.add("Biscotti");
		//
		dbpedia_list16.add("Pasticceria");
		dbpedia_list16.add("Croissant");
		dbpedia_list16.add("Roma");
		dbpedia_list16.add("Decorazione");
		dbpedia_list16.add("Pasta Sfoglia");
		dbpedia_list16.add("Pasta Frolla");
		dp16.setEntity(entity_list16);
		dp16.setDbpedia(dbpedia_list16);
		cv.add(dp16);
		
		List<String> entity_list17= new LinkedList<String>();
		List<String> dbpedia_list17= new LinkedList<String>();
		DocParser dp17= new DocParser();
		dp17.setText("PENSIONATO ex insegnante informatica matematica musicista colto educato cerca incarico (tutor o insegn. informatica aiuto compiti lavori vari segreteria ecc.) disposto viaggiare no vendita. tel. 347 9629591");
		entity_list17.clear();
		dbpedia_list17.clear();
		entity_list17.add("Insegnante informatica");
		entity_list17.add("Insegnante matematica");
		entity_list17.add("Insegnante musicista");
		entity_list17.add("Pensionato");
		entity_list17.add("Tutor");
		//
		dbpedia_list17.add("Pensione");
		dbpedia_list17.add("Docente");
		dbpedia_list17.add("Insegnante");
		dbpedia_list17.add("Informatica");
		dbpedia_list17.add("Matematica");
		dbpedia_list17.add("Musica");
		dbpedia_list17.add("Educazione");
		dbpedia_list17.add("Tutor");
		dp17.setEntity(entity_list17);
		dp17.setDbpedia(dbpedia_list17);
		cv.add(dp17);
		
//		List<String> entity_list18= new LinkedList<String>();
//		List<String> dbpedia_list18= new LinkedList<String>();
//		DocParser dp18= new DocParser();
//		dp18.setText("MANOVALE Pittore Controsoffitti Pavimentista Piastrellista del mestiere da generazione di famiglia cerca lavoro anche a giornata Max serietà e manifattura Claudio tel.333 8820598");
//		entity_list18.clear();
//		dbpedia_list18.clear();
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		entity_list18.add("");
//		//
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dbpedia_list18.add("");
//		dp18.setEntity(entity_list18);
//		dp18.setDbpedia(dbpedia_list18);
//		cv.add(dp18);
//		
//		List<String> entity_list19= new LinkedList<String>();
//		List<String> dbpedia_list19= new LinkedList<String>();
//		DocParser dp19= new DocParser();
//		dp19.setText("40ENNE informatico sistemista Microsoft tecnico Hardware Web Designer esperienza 18 anni patente europea cerca lavoro nella grafica web html flash oppure qualsiasi altro lavoro ottime referenzte tel. ore pasti");
//		entity_list19.clear();
//		dbpedia_list19.clear();
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		entity_list19.add("");
//		//
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dbpedia_list19.add("");
//		dp19.setEntity(entity_list19);
//		dp19.setDbpedia(dbpedia_list19);
//		cv.add(dp19);
//		
//		List<String> entity_list20= new LinkedList<String>();
//		List<String> dbpedia_list20= new LinkedList<String>();
//		DocParser dp20= new DocParser();
//		dp20.setText("CUOCO russo 32 anni con esperienza dall'antipasto al dessert esperto griglista carne e pesce ho fatto corso di Scuola Italiana Pizzaioli serio professionale puntuale residente Roma Acilia. Alex alexandr.roma55@gmail.com");
//		entity_list20.clear();
//		dbpedia_list20.clear();
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		entity_list20.add("");
//		//
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dbpedia_list20.add("");
//		dp20.setEntity(entity_list20);
//		dp20.setDbpedia(dbpedia_list20);
//		cv.add(dp20);
//	
	}
	
	
	public List<DocParser> getList() {
		return cv;
	}	
		
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


	
}
