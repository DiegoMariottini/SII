package tokenization;


import java.util.*;

import com.mashape.unirest.http.exceptions.UnirestException;

public class TagParserTest {

	public static void main(String[] args) throws UnirestException {
		
		TagParser parser = new TagParser();
		List<String> lTags = parser.parseTags("39enne cerca lavoro, anche saltuario Inserito da Ecology76 il 20/02/2016 Località Lombardia Sondrio e provincia Colorina Tipo di lavoro Risorse umane Contratto Tempo indeterminato Mobilita' Regionale Disponibilita' Part-time Descrizione 39 enne cerca lavoro, anche solo 1-2 giorni a settimana. Esperienza come colf, baby sitter, operaia, barista, cameriera, commessa, segretaria, cassiera. disponibile, puntuale, seria e discreta.");
		System.out.println(lTags.toString());
		
		/*DocParser dp = new DocParser();
		List<String> CV = new LinkedList<String>();
		CV.add("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Citt� Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Citt� Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalit� Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
		CV.add("Elena Rossi Luogo di nascita: Bologna Data di nascita: 1 settembre 1968 Cittadinanza: italiana Stato civile : nubile Residenza: Roma, Via Aurelio, 24 (CAP 00190) Tel: 06 000000 STUDI Università: 1993 : Laurea in Lettere moderne all'Università degli Studi Roma 3");
		CV.add("Riccardo Gilli Via San Giovanni 19, 10088 Settimo (To) Telefono: + 39 329/7212357 +39 011/9852520 E-mail: rick82@hotmail.com Nato a La Spezia il 31 Marzo 1982 ISTRUZIONE Laurea magistrale, anno accademico 2005/2006 col punteggio di 102/110. Titolo della tesi: Modello di analisi del portafoglio delle attività di un’impresa di servizi.  Laurea di primo livello, anno accademico 2003/2004 col punteggio di 101/110. Diploma di maturità scientifica presso il Liceo G.P. Vieusseux di La Spezia col punteggio di 84/100. ESPERIENZE PROFESSIONALI 2006-07 Iveco spa.; Stage in ambito marketing nel quale ho avuto a che fare con attività di Analisi di dati di mercato delle quote di Iveco e della concorrenza per la gamma Bus, e creazione di report LINGUE STRANIERE Inglese: ottima conoscenza. Cambridge First Certificate Francese: discreta conoscenza CONOSCENZE INFORMATICHE Ottima conoscenza di Word Ottima conoscenza nella navigazione in internet (explorer, mozilla). Ottima conoscenza sistema operativo WINDOWS HOBBIES Calcio; Tennis; Musica e chitarra");
		CV.add("Silvia Carena Via Petrarca 21, 20131 Milano (MI) Telefono: + 39 328/7232357 +39 02/898525 E-mail: silvia.carena@yahoo.com Nato a Milano il 12 Giugno 1982 PROFILO Durante gli studi e lo stage ho acquisito un forte interesse per l’ambito della gestione e lo sviluppo delle risorse umane. Le mie competenze principali sono:     Programmazione e attenzione al dettaglio Organizzazione di documenti e presentazioni Conoscenza degli applicativi Adobe Lavoro in gruppo Gestione delle attività per priorità ISTRUZIONE Dicembre 2006 Laurea Specialistica in ANALISI E VALUTAZIONE DEI SISTEMI COMPLESSI – Facoltà di Scienze Politiche, Università degli studi di Padova. Votazione:102/110 Titolo tesi: Analisi della  comunicazione interna e del clima aziendale durante il cambiamento organizzativo: il caso Siemens. Luglio 2004 Laurea Triennale in CONSULENZA DEL LAVORO E GESTIONE DELLER RISORSE UMANE – Facoltà di Scienze Politiche, Università degli studi di Padova. Votazione:101/110 Luglio 2001 Diploma di Maturità Scientifica – Liceo Copernico di Milano Votazione:86/100 suggerimento: ESPERIENZE PROFESSIONALI Dic. 2006 – Giu. 2007 Siemens (Milano, Italia) Stage – Sviluppo del personale Ho eseguito la mappatura delle competenze aziendali. Ho identificato il divario fra situazione attuale e situazione desiderata. Ho sintetizzato l’analisi e realizzato una presentazione per meeting direzionali. Feb. 2006 Progetto Universitario di Mercati del Lavoro e Organizzazione L’acquisizione, lo sviluppo e la gestione meritocratica delle persone nelle aziende. Lug. 2002 – Ott. 2006 Lezioni Private Ho preparato studenti liceali in Italiano, Storia, Filosofia e Francese. Tutti gli studenti a cui ho fornito lezioni private hanno migliorato in modo consistente il loro rendimento nelle materie di insegnamento. LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Francese Ottimo	Ottimo Ottimo Set 2004 – Feb 2005: Studente Erasmus all’Universite’ Paris IX a Parigi CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office e degli applicativi Adobe, in particolare Acrobat, Photoshop e Publishing. Buona conoscenza degli applicativi Mac. INTERESSI Pratico diversi sport a livello amatoriale, tra cui pallavolo e rollerblade. Mi piace viaggiare e sono appassionata di musica. Canto in un gruppo musicale.");
		CV.add("Sara Bottari Via Giolitti 26, 00184 Roma Telefono: + 39 338/7232357 +39 06/7885250 E-mail: sara.bottari@gmail.com Nata a Roma il 08 Febbraio 1982 PROFILO Durante gli studi e lo stage ho acquisito un forte interesse per il settore della comunicazione per le imprese, in particolare nell’ambito Internet. Le mie competenze principali sono:     Utilizzo di Java e HTML Creatività nella ricerca di soluzioni alternative. Atteggiamento positivo e determinato Lavoro in gruppo Capacità di stabilire e mantenere rapporti interpersonali ISTRUZIONE Dicembre 2006 Laurea Specialistica in COMUNICAZIONE PER LE ISTITUZIONI E LE IMPRESE – Facoltà di Scienze Della Comunicazione, Università degli studi di Roma La Sapienza. Votazione:107/110 Titolo tesi: Analisi della comunicazione interna e del clima aziendale durante il cambiamento organizzativo: il caso Siemens. Luglio 2004 Laurea Triennale in SCIENZE DELLA COMUNICAZIONE – Facoltà di Facoltà di Scienze Della Comunicazione, Università degli studi di Roma La Sapienza. Votazione:107/110 Luglio 2001 Diploma di Maturità Classica – Liceo Gramsci di Roma Votazione:92/100 ESPERIENZE PROFESSIONALI Dic. 2006 – Giu. 2007 Nissan (Roma, Italia) Stage – Comunicazione e Pubbliche Relazioni Ho sviluppato la comunicazione web per il lancio di un nuovo modello. Ho mantenuto i contatti con la stampa di settore. Ho coordinato la comunicazione con i concessionari. Feb. 2006 Progetto Universitario di Web e comunicazione pubblica Gestione della comunicazione aziendale attraverso lo sviluppo di un sito web. Lug. 2002 – Ott. 2006 Collaboratrice casa editrice Ho collaborato nell’attività di lettura e schedatura di testi. Ho collaborato nell’attività di traduzione di testi in lingua spagnola. LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Spagnolo Ottimo Ottimo Ottimo Set 2004 – Feb 2005: Studente Erasmus all’Università di Madrid. CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows e degli applicativi del pacchetto Office. Buona conoscenza degli ambienti Java e HTML. INTERESSI Mi piace viaggiare e sono appassionata di cinema. Realizzo e sviluppo siti web. Collaboro con una casa editrice indipendente specializzata in poesie.");
		CV.add("Marco Vascone Corso Traiano 39, 10124 Torino (To) Telefono: + 39 349/7212357 +39 011/3172520 E-mail: marco.vascone@gmail.com Nato a Napoli il 11 Maggio 1982 PROFILO Durante gli studi ho dimostrato di saper conciliare al meglio gli impegni universitari, con un lavoro da disegnatore, maturando un forte interesse per l’ambito della progettazione in campo automobilistico e acquisendo le seguenti competenze: Preparazione di documenti e report Analisi ed organizzazione di dati e informazioni Utilizzo di Microsoft Project Condivisione di informazioni Capacità di lavorare per obiettivi ISTRUZIONE Dicembre 2006 Laurea Specialistica in INGEGNERIA DELL’AUTOVEICOLO – Politecnico di Torino Votazione:100/110 Titolo tesi: Modello a 14 gradi di libertà di un veicolo isolato: Analisi del comportamento direzionale e della stabilità su strada. Luglio 2004 Laurea Triennale in INGEGNERIA DELL’AUTOVEICOLO – Politecnico di Torino Votazione:99/110 Luglio 2001 Diploma di Maturità Scientifica – Liceo Majorana di Napoli Votazione:89/100 ESPERIENZE PROFESSIONALI Dic. 2006 – Giu. 2007 PININFARINA (Torino, Italia) Stage – Analisi di affidabilità Ho sviluppato indicatori di affidabilità per la scocca di un autoveicolo tramite l’utilizzo di indici MTTF Ho verificato i risultati teorici tramite prove in laboratorio Ho interpolato i risultati teorici e sperimentali creando una procedura aziendale. Feb. 2006 Progetto Universitario di Progetto dell’Autotelaio Ho realizzato il modello di veicolo in codice multi-body, e simulato il comportamento dello stesso al variare di alcuni parametri di progetto. Lug. 2003 – Ott. 2005 Disegnatore Ho eseguito disegni in CAD e UG. Ho analizzato la fattibilità produttiva di componenti. LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Francese Discreto Discreto Buono CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office, di Microsoft Project, di CAD e UG. Buona conoscenza di strumenti di analisi FEM. Conoscenza di base di Visual Basic. INTERESSI Pratico diversi sport a livello amatoriale, tra cui calcio, basket e arrampicata. Sono un appassionato di arte e collaboro alla realizzazione di eventi nei quali vengono presentati quadri di artisti nuovo.");
		CV.add("Paola Dosso Corso De Gasperi 23, 10122 Torino (To) Telefono: + 39 339/7212457 +39 011/8652520 E-mail: paola.dosso@yahoo.it Nata a Torino il 31 Maggio 1977 PROFILO Responsabile relazioni pubbliche e stampa con esposizione internazionale nel settore dei beni di lusso. Alcuni dei risultati principali conseguiti: Ho incrementato sia la visibilità che il ritorno economico dei comunicati con la stampa extra-settore di oltre il 70% Sotto la mia direzione, la tiratura dell’In-House Magazine è aumentata da 8,000 a 25,000 copie. Le mie competenze principali sono: Capacità di costruire e mantenere rapporti interpersonali Comunicazione efficace e capacità di persuasione Capacità di coordinare risorse e progetti anche sotto pressione Lavoro in gruppo e capacità di delega Attenzione al dettaglio ESPERIENZE PROFESSIONALI Da Settembre 2006 AZIMUT-BENETTI SPA (Torino, Italia) – Leader Mondiale negli yacht di lusso Public Relations Manager Gestisco i rapporti con la stampa di settore italiana e mondiale. Gestisco i rapporti con la stampa extra-settore italiana e mondiale. Dirigo i comunicati stampa istituzionali. Gestisco le attività di relazioni pubbliche e interfaccia stampa in occasione dei principali saloni nautici internazionali (Cannes, Monaco, Genova, Ft. Lauderdale, Dusseldorf, Miami, Londra e Dubai). Dirigo l’In-House Magazine di Gruppo, incrementando la tiratura quadrimestrale da 8.000 a 25.000 copie. Ho incrementato la visibilità di Azimut nella stampa extra-settore extraeuropea (misurata in mm2) di oltre l’80%, con la stampa europea extra-settore europea di oltre il 70%, contribuendo a rendere il brand Azimut leader nella nautica di lusso. Ho incrementato il ritorno economico del 70%. Set. 2003 - Ago. 2006 Public Relations Co-ordinator Ho coordinato i rapporti con la stampa di settore italiana. Ho diretto i comunicati stampa di prodotto. Ho collaborato all’organizzazione di eventi. Ho gestito i rapporti con i dealer a livello internazionale per attività di ufficio stampa, realizzazione eventi e media plan. Ho collaborato all’ideazione dell’In-House Magazine di Gruppo. Ho creato un database per attività di ufficio stampa a favore della rete vendita internazionale. Da Aprile 2005 HARLEQUIN MONDADORI Freelance Ho collaborato con la casa editrice per attività di traduzione, lettura e schedatura di testi originali americani ed inglesi. Mar. 2003 – Lug. 2003 COIN SPA (Mestre (VE), Italia) Stage – Customer Relationship Management Ho collaborato alle attività di direct marketing online e offline per possessori della fidelity card. Ho gestito attività di copy-writing per campagne di direct marketing Ho gestito i rapporti con l’agenzia di direct marketing. Ho collaborato alla gestione del database marketing. La campagna direct marketing alla quale ho collaborato ha incrementato la fidelizzazione dei titolari Fidelity Card del 30%. ISTRUZIONE Luglio 2003 Master  in COMUNICAZIONE D’AZIENDA E MARKETING – UPA Ca’ Foscari di Venezia Progetto finale presso COIN spa dal titolo: La fidelizzazione continua attraverso l’offerta di servizi esclusivi ai Titolari Fidelity Card. Settembre 2002 Laurea Quinquennale in SCIENZE DELLA COMUNICAZIONE – Facoltà Università degli Studi di Torino Votazione:110/110 Titolo tesi: L’email marketing e la comunicazione one to one. L’esperienza di Cemit Interactive Media. Giugno 1996 Diploma di Maturità Scientifica – Liceo Copernico di Torino Votazione:55/60 Ott 1999 – Ago 2000: Progetto Erasmus presso Universitaet zu Koeln in Germania. CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office, dei programmi di gestione della posta elettronica Outlook e Lotus Notes e di Explorer e Mozilla. Buona conoscenza di Adobe Photoshop, CorelDraw, ACDSee e Paint Shop Pro. INTERESSI  Pratico diversi sport a livello amatoriale, tra cui pallavolo e sci. Sono appassionata di cinema, arte e viaggi.");
		 */
		/*for(String s : CV){
			dp = parser.parseTags(s);
			parser.saveCV(dp);
		}
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("Windows HTML Java");
		for(DocParser dpi : lista){
			System.out.println(dpi.getText() + "\n");
		}
		*/
	}
	
	public void DataSet2(){
		//cv è ripetuto per non avere warnings, non ricopiare
		List<DocParser> cv=new LinkedList<DocParser>();

		//copiare da qui in poi
		// cambiano entity_listDoc, dbpedia_listDoc, doc
		List<String> entity_listDoc1= new LinkedList<String>();
		List<String> dbpedia_listDoc1= new LinkedList<String>();
		DocParser doc1= new DocParser();
		doc1.setText("Elena Rossi Luogo di nascita: Bologna Data di nascita: 1 settembre 1968 Cittadinanza: italiana Stato civile : nubile Residenza: Roma, Via Aurelio, 24 (CAP 00190) Tel: 06 000000 STUDI Università: 1993 : Laurea in Lettere moderne all'Università degli Studi Roma 3");
		entity_listDoc1.clear();
		dbpedia_listDoc1.clear();
		entity_listDoc1.add("Elena Rossi");
		entity_listDoc1.add("Bologna");
		entity_listDoc1.add("Cittadinanza italiana");
		entity_listDoc1.add("Stato civile");
		entity_listDoc1.add("Celibato");
		entity_listDoc1.add("Roma");
		entity_listDoc1.add("Laurea");
		entity_listDoc1.add("Discipline umanistiche");
		entity_listDoc1.add("Università degli Studi Roma Tre");
		//
		dbpedia_listDoc1.add("Bologna");
		dbpedia_listDoc1.add("Comuni della provincia di Bologna");
		dbpedia_listDoc1.add("Roma");
		dbpedia_listDoc1.add("Comuni della provincia di Roma");
		dbpedia_listDoc1.add("Scienze umanistiche");
		dbpedia_listDoc1.add("Università degli Studi Roma Tre");
		doc1.setEntity(entity_listDoc1);
		doc1.setDbpedia(dbpedia_listDoc1);
		cv.add(doc1);

		List<String> entity_listDoc2= new LinkedList<String>();
		   List<String> dbpedia_listDoc2= new LinkedList<String>();
		   DocParser doc2= new DocParser();
			doc2.setText("Riccardo Gilli Via San Giovanni 19, 10088 Settimo (To) Telefono: + 39 329/7212357 +39 011/9852520 E-mail: rick82@hotmail.com Nato a La Spezia il 31 Marzo 1982 ISTRUZIONE Laurea magistrale, anno accademico 2005/2006 col punteggio di 102/110. Titolo della tesi: Modello di analisi del portafoglio delle attività di un’impresa di servizi.  Laurea di primo livello, anno accademico 2003/2004 col punteggio di 101/110. Diploma di maturità scientifica presso il Liceo G.P. Vieusseux di La Spezia col punteggio di 84/100. ESPERIENZE PROFESSIONALI 2006-07 Iveco spa.; Stage in ambito marketing nel quale ho avuto a che fare con attività di Analisi di dati di mercato delle quote di Iveco e della concorrenza per la gamma Bus, e creazione di report LINGUE STRANIERE Inglese: ottima conoscenza. Cambridge First Certificate Francese: discreta conoscenza CONOSCENZE INFORMATICHE Ottima conoscenza di Word Ottima conoscenza nella navigazione in internet (explorer, mozilla). Ottima conoscenza sistema operativo WINDOWS HOBBIES Calcio; Tennis; Musica e chitarra");
			entity_listDoc2.clear();
			dbpedia_listDoc2.clear();
			entity_listDoc2.add("Riccardo Gilli");
			entity_listDoc2.add("Windows Live Hotmail");
			entity_listDoc2.add("Component Object Model");
			entity_listDoc2.add("La Spezia");
			entity_listDoc2.add("Laurea magistrale");
			entity_listDoc2.add("Liceo scientifico");
			entity_listDoc2.add("Tirocinio");
			entity_listDoc2.add("Marketing");
			entity_listDoc2.add("First Certificate in English");
			entity_listDoc2.add("Lingua francese");
			entity_listDoc2.add("Informatica");
			entity_listDoc2.add("Microsoft Word");
			entity_listDoc2.add("Internet");
			entity_listDoc2.add("Windows Explorer");
			entity_listDoc2.add("Microsoft Windows");
			//
			dbpedia_listDoc2.add("Posta elettronica");
			dbpedia_listDoc2.add("Mezzi di comunicazione");
			dbpedia_listDoc2.add("MSN");
			dbpedia_listDoc2.add("Windows Live");
			dbpedia_listDoc2.add("Software di sistema");
			dbpedia_listDoc2.add("Microsoft");
			dbpedia_listDoc2.add("La Spezia");
			dbpedia_listDoc2.add("Città romane della Liguria");
			dbpedia_listDoc2.add("inanza aziendale");
			dbpedia_listDoc2.add("Marketing");
			dbpedia_listDoc2.add("Terminologia informatica");
			dbpedia_listDoc2.add("Diritto commerciale");
			dbpedia_listDoc2.add("Certificati di conoscenza della lingua inglese");
			dbpedia_listDoc2.add("Lingua francese");
			dbpedia_listDoc2.add("Programmi di scrittura");
			dbpedia_listDoc2.add("Software di Microsoft");
			dbpedia_listDoc2.add("Office");
			dbpedia_listDoc2.add("Internet");
			dbpedia_listDoc2.add("Terminologia informatica");
			dbpedia_listDoc2.add("Microsoft Windows");
			dbpedia_listDoc2.add("Mozilla");
			dbpedia_listDoc2.add("Sistema operativo");
			dbpedia_listDoc2.add("Sistemi operativi Microsoft");
			doc2.setEntity(entity_listDoc2);
			doc2.setDbpedia(dbpedia_listDoc2);
			cv.add(doc2);

			List<String> entity_listDoc3= new LinkedList<String>();
			List<String> dbpedia_listDoc3= new LinkedList<String>();
			DocParser doc3= new DocParser();
			doc3.setText("Silvia Carena Via Petrarca 21, 20131 Milano (MI) Telefono: + 39 328/7232357 +39 02/898525 E-mail: silvia.carena@yahoo.com Nato a Milano il 12 Giugno 1982 PROFILO Le mie competenze principali sono: Programmazione e attenzione al dettaglio Organizzazione di documenti e presentazioni Conoscenza degli applicativi Adobe Lavoro in gruppo Gestione delle attività per priorità ISTRUZIONE Dicembre 2006 Laurea Specialistica in ANALISI E VALUTAZIONE DEI SISTEMI COMPLESSI – Facoltà di Scienze Politiche, Università degli studi di Padova. Luglio 2004 Laurea Triennale in CONSULENZA DEL LAVORO E GESTIONE DELLER RISORSE UMANE – Facoltà di Scienze Politiche, Università degli studi di Padova. CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office e degli applicativi Adobe, in particolare Acrobat, Photoshop e Publishing. Buona conoscenza degli applicativi Mac.");
			entity_listDoc3.clear();
			dbpedia_listDoc3.clear();
			entity_listDoc3.add("Silvia Carena");
			entity_listDoc3.add("Milano");
			entity_listDoc3.add("Vendita al dettaglio");
			entity_listDoc3.add("Organizzazione");
			entity_listDoc3.add("Adobe Systems");
			entity_listDoc3.add("Gestione");
			entity_listDoc3.add("Laurea magistrale");
			entity_listDoc3.add("Sistema complesso");
			entity_listDoc3.add("Scienza politica");
			entity_listDoc3.add("Università degli Studi di Padova");
			entity_listDoc3.add("Consulente del lavoro");
			entity_listDoc3.add("Risorse umane");
			entity_listDoc3.add("Informatica");
			entity_listDoc3.add("Microsoft Windows");
			entity_listDoc3.add("Microsoft Office");
			entity_listDoc3.add("Adobe Acrobat");
			entity_listDoc3.add("Adobe Photoshop");
			entity_listDoc3.add("Apple Macintosh");
			//
			dbpedia_listDoc3.add("Sociologia");
			dbpedia_listDoc3.add("Milano");
			dbpedia_listDoc3.add("Risorse umane");
			dbpedia_listDoc3.add("Ingegneria gestionale");
			dbpedia_listDoc3.add("Psicologia cognitiva");
			dbpedia_listDoc3.add("Antropologia sociale");
			dbpedia_listDoc3.add("Sociologia economica");
			dbpedia_listDoc3.add("Sociologia politica");
			dbpedia_listDoc3.add("Marketing");
			dbpedia_listDoc3.add("Applicazioni dell'informatica");
			dbpedia_listDoc3.add("Adobe Systems");
			dbpedia_listDoc3.add("Sociologia politica");
			dbpedia_listDoc3.add("Scienze politiche");
			dbpedia_listDoc3.add("Università di Padova");
			dbpedia_listDoc3.add("Risorse umane");
			dbpedia_listDoc3.add("Microsoft Windows");
			dbpedia_listDoc3.add("Sistemi operativi Microsoft");
			dbpedia_listDoc3.add("Software di Microsoft");
			dbpedia_listDoc3.add("Software Adobe");
			dbpedia_listDoc3.add("Applicazioni per Mac OS X");
			dbpedia_listDoc3.add("Programmi di grafica");
			dbpedia_listDoc3.add("Software Adobe");
			dbpedia_listDoc3.add("Computer Apple");
			doc3.setEntity(entity_listDoc3);
			doc3.setDbpedia(dbpedia_listDoc3);
			cv.add(doc3);
			
			List<String> entity_listDoc4= new LinkedList<String>();
			List<String> dbpedia_listDoc4= new LinkedList<String>();
			DocParser doc4= new DocParser();
			doc4.setText("Sara Bottari Via Giolitti 26, 00184 Roma Telefono: + 39 338/7232357 +39 06/7885250 E-mail: sara.bottari@gmail.com Nata a Roma il 08 Febbraio 1982 PROFILO Le mie competenze principali sono: Utilizzo di Java e HTML Creatività nella ricerca di soluzioni alternative. ISTRUZIONE Dicembre 2006 Laurea Specialistica in COMUNICAZIONE PER LE ISTITUZIONI E LE IMPRESE – Facoltà di Scienze Della Comunicazione, Università degli studi di Roma La Sapienza. Luglio 2004 Laurea Triennale in SCIENZE DELLA COMUNICAZIONE – Facoltà di Facoltà di Scienze Della Comunicazione, Università degli studi di Roma La Sapienza. ESPERIENZE PROFESSIONALI Ho collaborato nell’attività di traduzione di testi in lingua spagnola. LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Spagnolo Ottimo Ottimo Ottimo Set 2004 – Feb 2005: Studente Erasmus all’Università di Madrid. CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows e degli applicativi del pacchetto Office. Buona conoscenza degli ambienti Java e HTML.");
			entity_listDoc4.clear();
			dbpedia_listDoc4.clear();
			entity_listDoc4.add("Sara Bottari");
			entity_listDoc4.add("Roma");
			entity_listDoc4.add("Java (linguaggio)");
			entity_listDoc4.add("HTML");
			entity_listDoc4.add("Creatività");
			entity_listDoc4.add("Laurea magistrale");
			entity_listDoc4.add("Scienze della comunicazione");
			entity_listDoc4.add("Sapienza - Università di Roma");
			entity_listDoc4.add("Lingua spagnola");
			entity_listDoc4.add("Lingua inglese");
			entity_listDoc4.add("Lingua francese");
			entity_listDoc4.add("Progetto Erasmus");
			entity_listDoc4.add("Università Complutense di Madrid");
			entity_listDoc4.add("Microsoft Windows");
			entity_listDoc4.add("Pacchetto (reti)");
			entity_listDoc4.add("Microsoft Office");
			//
			dbpedia_listDoc4.add("Linguaggio Java");
			dbpedia_listDoc4.add("Standard W3C");
			dbpedia_listDoc4.add("HTML");
			dbpedia_listDoc4.add("Creatività");
			dbpedia_listDoc4.add("Sociologia politica");
			dbpedia_listDoc4.add("Aziende");
			dbpedia_listDoc4.add("Sociologia della comunicazione");
			dbpedia_listDoc4.add("Sapienza - Università di Roma");
			dbpedia_listDoc4.add("Roma");
			dbpedia_listDoc4.add("Roma Q. VI Tiburtino");
			dbpedia_listDoc4.add("Lingua spagnola");
			dbpedia_listDoc4.add("Progetto Erasmus");
			dbpedia_listDoc4.add("Università in Spagna");
			dbpedia_listDoc4.add("Madrid");
			dbpedia_listDoc4.add("Comuni della provincia di Madrid");
			dbpedia_listDoc4.add("Scienze cognitive");
			dbpedia_listDoc4.add("Microsoft Windows");
			dbpedia_listDoc4.add("Sistemi operativi Microsoft");
			dbpedia_listDoc4.add("Office");
			dbpedia_listDoc4.add("Software di Microsoft");
			dbpedia_listDoc4.add("Software applicativo individuale");
			doc4.setEntity(entity_listDoc4);
			doc4.setDbpedia(dbpedia_listDoc4);
			cv.add(doc4);
			
			List<String> entity_listDoc5= new LinkedList<String>();
			List<String> dbpedia_listDoc5= new LinkedList<String>();
			DocParser doc5= new DocParser();
			doc5.setText("Marco Vascone Corso Traiano 39, 10124 Torino (To) Telefono: + 39 349/7212357 +39 011/3172520 E-mail: marco.vascone@gmail.com Nato a Napoli il 11 Maggio 1982 PROFILO Ho le seguenti competenze: Preparazione di documenti e report Analisi ed organizzazione di dati e informazioni Utilizzo di Microsoft Project Condivisione di informazioni Capacità di lavorare per obiettivi ISTRUZIONE Dicembre 2006 Laurea Specialistica in INGEGNERIA DELL’AUTOVEICOLO – Politecnico di Torino Luglio 2004 Laurea Triennale in INGEGNERIA DELL’AUTOVEICOLO – Politecnico di Torino Luglio 2001 Diploma di Maturità Scientifica – Liceo Majorana di Napoli LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Francese Discreto Discreto Buono CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office, di Microsoft Project, di CAD e UG. Buona conoscenza di strumenti di analisi FEM. Conoscenza di base di Visual Basic.");
			entity_listDoc5.clear();
			dbpedia_listDoc5.clear();
			entity_listDoc5.add("Marco Vascone");
			entity_listDoc5.add("Component Object Model");
			entity_listDoc5.add("Torino");
			entity_listDoc5.add("Organizzazione");
			entity_listDoc5.add("Microsoft Project");
			entity_listDoc5.add("Laurea magistrale");
			entity_listDoc5.add("Ingegneria dell'autoveicolo");
			entity_listDoc5.add("Politecnico di Torino");
			entity_listDoc5.add("Liceo scientifico");
			entity_listDoc5.add("Lingua inglese");
			entity_listDoc5.add("Lingua francese");
			entity_listDoc5.add("Desktop environment");
			entity_listDoc5.add("Microsoft Windows");
			entity_listDoc5.add("Microsoft Office");
			entity_listDoc5.add("CAD");
			entity_listDoc5.add("Visual Basic");
			//
			dbpedia_listDoc5.add("Scuola secondaria di secondo grado in Italia");
			dbpedia_listDoc5.add("Software di sistema");
			dbpedia_listDoc5.add("Linguaggi di programmazione");
			dbpedia_listDoc5.add("Microsoft");
			dbpedia_listDoc5.add("Terminologia aerospaziale");
			dbpedia_listDoc5.add("Ingegneria navale");
			dbpedia_listDoc5.add("Terminologia informatica");
			dbpedia_listDoc5.add("Ingegneria meccanica");
			dbpedia_listDoc5.add("Politecnico di Torino");
			dbpedia_listDoc5.add("Linguaggi");
			dbpedia_listDoc5.add("Lingua inglese");
			dbpedia_listDoc5.add("Lingua francese");
			dbpedia_listDoc5.add("Microsoft Windows");
			dbpedia_listDoc5.add("Sistemi operativi Microsoft");
			dbpedia_listDoc5.add("Office");
			dbpedia_listDoc5.add("Software di Microsoft");
			dbpedia_listDoc5.add("Software applicativo individuale");
			dbpedia_listDoc5.add("Computer grafica");
			dbpedia_listDoc5.add("Modellazione geometrica");
			dbpedia_listDoc5.add("Software CAD");
			dbpedia_listDoc5.add("Linguaggi di programmazione");
			dbpedia_listDoc5.add("Visual Basic");
			doc5.setEntity(entity_listDoc5);
			doc5.setDbpedia(dbpedia_listDoc5);
			cv.add(doc5);
			
			List<String> entity_listDoc6= new LinkedList<String>();
			List<String> dbpedia_listDoc6= new LinkedList<String>();
			DocParser doc6= new DocParser();
			doc6.setText("Paola Dosso Corso De Gasperi 23, 10122 Torino (To) Telefono: + 39 339/7212457 +39 011/8652520 E-mail: paola.dosso@yahoo.it Nata a Torino il 31 Maggio 1977 PROFILO Responsabile relazioni pubbliche e stampa con esposizione internazionale nel settore dei beni di lusso. ESPERIENZE PROFESSIONALI Da Settembre 2006 AZIMUT-BENETTI SPA (Torino, Italia)- Gestisco i rapporti con la stampa extra-settore italiana e mondiale. Dirigo i comunicati stampa istituzionali, le attività di relazioni pubbliche e interfaccia stampa in occasione dei principali saloni nautici internazionali. ISTRUZIONE Luglio 2003 Master  in COMUNICAZIONE D’AZIENDA E MARKETING – UPA Ca’ Foscari di Venezia Progetto finale presso COIN spa dal titolo: La fidelizzazione continua attraverso l’offerta di servizi esclusivi ai Titolari Fidelity Card. Settembre 2002 Laurea Quinquennale in SCIENZE DELLA COMUNICAZIONE – Facoltà Università degli Studi di Torino Titolo tesi: L’email marketing e la comunicazione one to one.");
			entity_listDoc6.clear();
			dbpedia_listDoc6.clear();
			entity_listDoc6.add("Paola Dosso");
			entity_listDoc6.add("Pubbliche relazioni");
			entity_listDoc6.add("Stampa");
			entity_listDoc6.add("Settore economico");
			entity_listDoc6.add("Bene (economia)");
			entity_listDoc6.add("Lusso");
			entity_listDoc6.add("Società per azioni");
			entity_listDoc6.add("Italia");
			entity_listDoc6.add("Comunicato stampa");
			entity_listDoc6.add("Interfaccia grafica");
			entity_listDoc6.add("Master universitario");
			entity_listDoc6.add("Università Ca' Foscari Venezia");
			entity_listDoc6.add("Venezia");
			entity_listDoc6.add("Torino");
			entity_listDoc6.add("Fidelizzazione");
			entity_listDoc6.add("Università degli Studi di Torino");
			entity_listDoc6.add("Email marketing");
			//
			dbpedia_listDoc6.add("Torino");
			dbpedia_listDoc6.add("Venezia");
			dbpedia_listDoc6.add("Marketing");
			dbpedia_listDoc6.add("Scienze sociali");
			dbpedia_listDoc6.add("Comunicazione");
			dbpedia_listDoc6.add("Sociologia del lavoro");
			dbpedia_listDoc6.add("Teorie della comunicazione");
			dbpedia_listDoc6.add("Stampa");
			dbpedia_listDoc6.add("Diritto societario");
			dbpedia_listDoc6.add("Italia");
			dbpedia_listDoc6.add("Giornalismo");
			dbpedia_listDoc6.add("Diritto societario");
			dbpedia_listDoc6.add("Interazione uomo-computer");
			dbpedia_listDoc6.add("Interfacce grafiche");
			dbpedia_listDoc6.add("Design della comunicazione");
			dbpedia_listDoc6.add("Università nel Veneto");
			dbpedia_listDoc6.add("Comuni della provincia di Venezia");
			dbpedia_listDoc6.add("Ingegneria");
			dbpedia_listDoc6.add("Project management");
			dbpedia_listDoc6.add("Aziende della provincia di Venezia");
			dbpedia_listDoc6.add("Marketing");
			dbpedia_listDoc6.add("Sociologia della comunicazione");
			dbpedia_listDoc6.add("Università del Piemonte");
			dbpedia_listDoc6.add("Applicazioni dell'informatica");
			doc6.setEntity(entity_listDoc6);
			doc6.setDbpedia(dbpedia_listDoc6);
			cv.add(doc6);
			
			List<String> entity_listDoc7= new LinkedList<String>();
			List<String> dbpedia_listDoc7= new LinkedList<String>();
			DocParser doc7= new DocParser();
			doc7.setText("39enne cerca lavoro, anche saltuario Inserito da Ecology76 il 20/02/2016 Località Lombardia Sondrio e provincia Colorina Tipo di lavoro Risorse umane Contratto Tempo indeterminato Mobilita' Regionale Disponibilita' Part-time Descrizione 39 enne cerca lavoro, anche solo 1-2 giorni a settimana. Esperienza come colf, baby sitter, operaia, barista, cameriera, commessa, segretaria, cassiera. disponibile, puntuale, seria e discreta.");
			entity_listDoc7.clear();
			dbpedia_listDoc7.clear();
			entity_listDoc7.add("Lombardia");
			entity_listDoc7.add("Sondrio");
			entity_listDoc7.add("Colorina");
			entity_listDoc7.add("Risorse umane");
			entity_listDoc7.add("Contratto di lavoro a tempo parziale");
			entity_listDoc7.add("Colf");
			entity_listDoc7.add("Bambinaia");
			//
			dbpedia_listDoc7.add("Lombardia");
			dbpedia_listDoc7.add("Sondrio");
			dbpedia_listDoc7.add("Colorina");
			dbpedia_listDoc7.add("Comuni della provincia di Sondrio");
			dbpedia_listDoc7.add("Risorse umane");
			dbpedia_listDoc7.add("Professioni nei servizi");
			dbpedia_listDoc7.add("Famiglia");
			doc7.setEntity(entity_listDoc7);
			doc7.setDbpedia(dbpedia_listDoc7);
			cv.add(doc7);

			List<String> entity_listDoc8= new LinkedList<String>();
			List<String> dbpedia_listDoc8= new LinkedList<String>();
			DocParser doc8= new DocParser();
			doc8.setText("Impiegata /Segretaria Inserito da Ciakrok61 il 19/02/2016 Località Emilia Romagna Ferrara e provincia Ferrara Tipo di lavoro 	Amministrativo, Ufficio Contratto Tempo indeterminato Mobilita' Regionale Disponibilita' 	Part-time Descrizione Impiegata, con pluriennale esperienza in campo amministrativo/segretariale e con buona conoscenza utilizzo computer, cerca lavoro d'ufficio Part-Time (mattino) zona Ferrara e provincia. Si garantisce disponibilità immediata, affidabilità e serietà nel lavoro. Se interessati telefonare al n. 3471855958 o inviare una e-mail all’indirizzo ciakrok61@gmail.com.");
			entity_listDoc8.clear();
			dbpedia_listDoc8.clear();
			entity_listDoc8.add("");
			entity_listDoc8.add("");
			entity_listDoc8.add("");
			entity_listDoc8.add("");
			//
			dbpedia_listDoc8.add("");
			dbpedia_listDoc8.add("");
			dbpedia_listDoc8.add("");
			dbpedia_listDoc8.add("");
			doc8.setEntity(entity_listDoc8);
			doc8.setDbpedia(dbpedia_listDoc8);
			cv.add(doc8);
			
			List<String> entity_listDoc9= new LinkedList<String>();
			List<String> dbpedia_listDoc9= new LinkedList<String>();
			DocParser doc9= new DocParser();
			doc9.setText("Inserito da Giuseppe il 15/02/2016 Località Piemonte Torino e provincia Torino Tipo di lavoro Ingegneria, Architettura Contratto Tempo indeterminato Mobilita' Regionale Disponibilita' Tempo pieno Descrizione Geometra abilitato cerca urgentemente lavoro in Torino e Provincia. Esperienza in gestione commesse edili private e pubbliche, direzione tecnica di cantiere, redazione e verifica computi metrici, preventivazione, verifica capitolati, gestione sicurezza. Età anni 50. Conoscenza uso pc e Autocad. Serietà e puntualità. Residente in Caselle Torinese. Tel. 334.8716460");
			entity_listDoc9.clear();
			dbpedia_listDoc9.clear();
			entity_listDoc9.add("");
			entity_listDoc9.add("");
			entity_listDoc9.add("");
			entity_listDoc9.add("");
			//
			dbpedia_listDoc9.add("");
			dbpedia_listDoc9.add("");
			dbpedia_listDoc9.add("");
			dbpedia_listDoc9.add("");
			doc9.setEntity(entity_listDoc9);
			doc9.setDbpedia(dbpedia_listDoc9);
			cv.add(doc9);
			
			List<String> entity_listDoc10= new LinkedList<String>();
			List<String> dbpedia_listDoc10= new LinkedList<String>();
			DocParser doc10= new DocParser();
			doc10.setText("DISEGNATORE AUTOCAD IMPIANTISTICA Inserito da GIULIANO il 15/02/2016 Località Lombardia Milano e provincia Gorgonzola Tipo di lavoro 	Ingegneria, Architettura Contratto 	Libero professionista Mobilita' Nazionale Disponibilita' Tempo pieno Descrizione DISEGNATORE AUTOCAD IMPIANTISTICA (carpenteria, piping, macchine) perito meccanico, autonomo, offresi. Tel. 32.01.97.07.34");
			entity_listDoc10.clear();
			dbpedia_listDoc10.clear();
			entity_listDoc10.add("");
			entity_listDoc10.add("");
			entity_listDoc10.add("");
			entity_listDoc10.add("");
			//
			dbpedia_listDoc10.add("");
			dbpedia_listDoc10.add("");
			dbpedia_listDoc10.add("");
			dbpedia_listDoc10.add("");
			doc10.setEntity(entity_listDoc10);
			doc10.setDbpedia(dbpedia_listDoc10);
			cv.add(doc10);
			
			List<String> entity_listDoc11= new LinkedList<String>();
			List<String> dbpedia_listDoc11= new LinkedList<String>();
			DocParser doc11= new DocParser();
			doc11.setText("");
			entity_listDoc11.clear();
			dbpedia_listDoc11.clear();
			entity_listDoc11.add("");
			entity_listDoc11.add("");
			entity_listDoc11.add("");
			entity_listDoc11.add("");
			//
			dbpedia_listDoc11.add("");
			dbpedia_listDoc11.add("");
			dbpedia_listDoc11.add("");
			dbpedia_listDoc11.add("");
			doc11.setEntity(entity_listDoc11);
			doc11.setDbpedia(dbpedia_listDoc11);
			cv.add(doc11);
			
			List<String> entity_listDoc12= new LinkedList<String>();
			List<String> dbpedia_listDoc12= new LinkedList<String>();
			DocParser doc12= new DocParser();
			doc12.setText("");
			entity_listDoc12.clear();
			dbpedia_listDoc12.clear();
			entity_listDoc12.add("");
			entity_listDoc12.add("");
			entity_listDoc12.add("");
			entity_listDoc12.add("");
			//
			dbpedia_listDoc12.add("");
			dbpedia_listDoc12.add("");
			dbpedia_listDoc12.add("");
			dbpedia_listDoc12.add("");
			doc12.setEntity(entity_listDoc12);
			doc12.setDbpedia(dbpedia_listDoc12);
			cv.add(doc12);
			
			List<String> entity_listDoc13= new LinkedList<String>();
			List<String> dbpedia_listDoc13= new LinkedList<String>();
			DocParser doc13= new DocParser();
			doc13.setText("");
			entity_listDoc13.clear();
			dbpedia_listDoc13.clear();
			entity_listDoc13.add("");
			entity_listDoc13.add("");
			entity_listDoc13.add("");
			entity_listDoc13.add("");
			//
			dbpedia_listDoc13.add("");
			dbpedia_listDoc13.add("");
			dbpedia_listDoc13.add("");
			dbpedia_listDoc13.add("");
			doc13.setEntity(entity_listDoc13);
			doc13.setDbpedia(dbpedia_listDoc13);
			cv.add(doc13);
			
			List<String> entity_listDoc14= new LinkedList<String>();
			List<String> dbpedia_listDoc14= new LinkedList<String>();
			DocParser doc14= new DocParser();
			doc14.setText("");
			entity_listDoc14.clear();
			dbpedia_listDoc14.clear();
			entity_listDoc14.add("");
			entity_listDoc14.add("");
			entity_listDoc14.add("");
			entity_listDoc14.add("");
			//
			dbpedia_listDoc14.add("");
			dbpedia_listDoc14.add("");
			dbpedia_listDoc14.add("");
			dbpedia_listDoc14.add("");
			doc14.setEntity(entity_listDoc14);
			doc14.setDbpedia(dbpedia_listDoc14);
			cv.add(doc14);
			
			List<String> entity_listDoc15= new LinkedList<String>();
			List<String> dbpedia_listDoc15= new LinkedList<String>();
			DocParser doc15= new DocParser();
			doc15.setText("");
			entity_listDoc15.clear();
			dbpedia_listDoc15.clear();
			entity_listDoc15.add("");
			entity_listDoc15.add("");
			entity_listDoc15.add("");
			entity_listDoc15.add("");
			//
			dbpedia_listDoc15.add("");
			dbpedia_listDoc15.add("");
			dbpedia_listDoc15.add("");
			dbpedia_listDoc15.add("");
			doc15.setEntity(entity_listDoc15);
			doc15.setDbpedia(dbpedia_listDoc15);
			cv.add(doc15);
	}
	

	/*
	 // cv resta sempre cv, � l'unico che non cambia
	 // cambiano entity_listDoc, dbpedia_listDoc, doc
	   List<String> entity_listDocXXX= new LinkedList<String>();
	   List<String> dbpedia_listDocXXX= new LinkedList<String>();
	   DocParser docXXX= new DocParser();
		docXXX.setText("");
		entity_listDocXXX.clear();
		dbpedia_listDocXXX.clear();
		entity_listDocXXX.add("");
		entity_listDocXXX.add("");
		entity_listDocXXX.add("");
		entity_listDocXXX.add("");
		//
		dbpedia_listDocXXX.add("");
		dbpedia_listDocXXX.add("");
		dbpedia_listDocXXX.add("");
		dbpedia_listDocXXX.add("");
		docXXX.setEntity(entity_listDocXXX);
		docXXX.setDbpedia(dbpedia_listDocXXX);
		cv.add(docXXX);
		*/
}
