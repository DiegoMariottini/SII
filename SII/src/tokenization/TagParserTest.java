package tokenization;


import java.util.*;

import com.mashape.unirest.http.exceptions.UnirestException;

public class TagParserTest {

	public static void main(String[] args) throws UnirestException {
		TagParser parser = new TagParser();
		DocParser dp = new DocParser();
		List<String> CV = new LinkedList<String>();
		CV.add("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Citt� Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Citt� Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalit� Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
		CV.add("Elena Rossi Luogo di nascita: Bologna Data di nascita: 1 settembre 1968 Cittadinanza: italiana Stato civile : nubile Residenza: Roma, Via Aurelio, 24 (CAP 00190) Tel: 06 000000 STUDI Università: 1993 : Laurea in Lettere moderne all'Università degli Studi Roma 3");
		CV.add("Riccardo Gilli Via San Giovanni 19, 10088 Settimo (To) Telefono: + 39 329/7212357 +39 011/9852520 E-mail: rick82@hotmail.com Nato a La Spezia il 31 Marzo 1982 ISTRUZIONE Laurea magistrale, anno accademico 2005/2006 col punteggio di 102/110. Titolo della tesi: Modello di analisi del portafoglio delle attività di un’impresa di servizi.  Laurea di primo livello, anno accademico 2003/2004 col punteggio di 101/110. Diploma di maturità scientifica presso il Liceo G.P. Vieusseux di La Spezia col punteggio di 84/100. ESPERIENZE PROFESSIONALI 2006-07 Iveco spa.; Stage in ambito marketing nel quale ho avuto a che fare con attività di Analisi di dati di mercato delle quote di Iveco e della concorrenza per la gamma Bus, e creazione di report LINGUE STRANIERE Inglese: ottima conoscenza. Cambridge First Certificate Francese: discreta conoscenza CONOSCENZE INFORMATICHE Ottima conoscenza di Word Ottima conoscenza nella navigazione in internet (explorer, mozilla). Ottima conoscenza sistema operativo WINDOWS HOBBIES Calcio; Tennis; Musica e chitarra");
		CV.add("Silvia Carena Via Petrarca 21, 20131 Milano (MI) Telefono: + 39 328/7232357 +39 02/898525 E-mail: silvia.carena@yahoo.com Nato a Milano il 12 Giugno 1982 PROFILO Durante gli studi e lo stage ho acquisito un forte interesse per l’ambito della gestione e lo sviluppo delle risorse umane. Le mie competenze principali sono:     Programmazione e attenzione al dettaglio Organizzazione di documenti e presentazioni Conoscenza degli applicativi Adobe Lavoro in gruppo Gestione delle attività per priorità ISTRUZIONE Dicembre 2006 Laurea Specialistica in ANALISI E VALUTAZIONE DEI SISTEMI COMPLESSI – Facoltà di Scienze Politiche, Università degli studi di Padova. Votazione:102/110 Titolo tesi: Analisi della  comunicazione interna e del clima aziendale durante il cambiamento organizzativo: il caso Siemens. Luglio 2004 Laurea Triennale in CONSULENZA DEL LAVORO E GESTIONE DELLER RISORSE UMANE – Facoltà di Scienze Politiche, Università degli studi di Padova. Votazione:101/110 Luglio 2001 Diploma di Maturità Scientifica – Liceo Copernico di Milano Votazione:86/100 suggerimento: ESPERIENZE PROFESSIONALI Dic. 2006 – Giu. 2007 Siemens (Milano, Italia) Stage – Sviluppo del personale Ho eseguito la mappatura delle competenze aziendali. Ho identificato il divario fra situazione attuale e situazione desiderata. Ho sintetizzato l’analisi e realizzato una presentazione per meeting direzionali. Feb. 2006 Progetto Universitario di Mercati del Lavoro e Organizzazione L’acquisizione, lo sviluppo e la gestione meritocratica delle persone nelle aziende. Lug. 2002 – Ott. 2006 Lezioni Private Ho preparato studenti liceali in Italiano, Storia, Filosofia e Francese. Tutti gli studenti a cui ho fornito lezioni private hanno migliorato in modo consistente il loro rendimento nelle materie di insegnamento. LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Francese Ottimo	Ottimo Ottimo Set 2004 – Feb 2005: Studente Erasmus all’Universite’ Paris IX a Parigi CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office e degli applicativi Adobe, in particolare Acrobat, Photoshop e Publishing. Buona conoscenza degli applicativi Mac. INTERESSI Pratico diversi sport a livello amatoriale, tra cui pallavolo e rollerblade. Mi piace viaggiare e sono appassionata di musica. Canto in un gruppo musicale.");
		CV.add("Sara Bottari Via Giolitti 26, 00184 Roma Telefono: + 39 338/7232357 +39 06/7885250 E-mail: sara.bottari@gmail.com Nata a Roma il 08 Febbraio 1982 PROFILO Durante gli studi e lo stage ho acquisito un forte interesse per il settore della comunicazione per le imprese, in particolare nell’ambito Internet. Le mie competenze principali sono:     Utilizzo di Java e HTML Creatività nella ricerca di soluzioni alternative. Atteggiamento positivo e determinato Lavoro in gruppo Capacità di stabilire e mantenere rapporti interpersonali ISTRUZIONE Dicembre 2006 Laurea Specialistica in COMUNICAZIONE PER LE ISTITUZIONI E LE IMPRESE – Facoltà di Scienze Della Comunicazione, Università degli studi di Roma La Sapienza. Votazione:107/110 Titolo tesi: Analisi della comunicazione interna e del clima aziendale durante il cambiamento organizzativo: il caso Siemens. Luglio 2004 Laurea Triennale in SCIENZE DELLA COMUNICAZIONE – Facoltà di Facoltà di Scienze Della Comunicazione, Università degli studi di Roma La Sapienza. Votazione:107/110 Luglio 2001 Diploma di Maturità Classica – Liceo Gramsci di Roma Votazione:92/100 ESPERIENZE PROFESSIONALI Dic. 2006 – Giu. 2007 Nissan (Roma, Italia) Stage – Comunicazione e Pubbliche Relazioni Ho sviluppato la comunicazione web per il lancio di un nuovo modello. Ho mantenuto i contatti con la stampa di settore. Ho coordinato la comunicazione con i concessionari. Feb. 2006 Progetto Universitario di Web e comunicazione pubblica Gestione della comunicazione aziendale attraverso lo sviluppo di un sito web. Lug. 2002 – Ott. 2006 Collaboratrice casa editrice Ho collaborato nell’attività di lettura e schedatura di testi. Ho collaborato nell’attività di traduzione di testi in lingua spagnola. LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Spagnolo Ottimo Ottimo Ottimo Set 2004 – Feb 2005: Studente Erasmus all’Università di Madrid. CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows e degli applicativi del pacchetto Office. Buona conoscenza degli ambienti Java e HTML. INTERESSI Mi piace viaggiare e sono appassionata di cinema. Realizzo e sviluppo siti web. Collaboro con una casa editrice indipendente specializzata in poesie.");
		CV.add("Marco Vascone Corso Traiano 39, 10124 Torino (To) Telefono: + 39 349/7212357 +39 011/3172520 E-mail: marco.vascone@gmail.com Nato a Napoli il 11 Maggio 1982 PROFILO Durante gli studi ho dimostrato di saper conciliare al meglio gli impegni universitari, con un lavoro da disegnatore, maturando un forte interesse per l’ambito della progettazione in campo automobilistico e acquisendo le seguenti competenze: Preparazione di documenti e report Analisi ed organizzazione di dati e informazioni Utilizzo di Microsoft Project Condivisione di informazioni Capacità di lavorare per obiettivi ISTRUZIONE Dicembre 2006 Laurea Specialistica in INGEGNERIA DELL’AUTOVEICOLO – Politecnico di Torino Votazione:100/110 Titolo tesi: Modello a 14 gradi di libertà di un veicolo isolato: Analisi del comportamento direzionale e della stabilità su strada. Luglio 2004 Laurea Triennale in INGEGNERIA DELL’AUTOVEICOLO – Politecnico di Torino Votazione:99/110 Luglio 2001 Diploma di Maturità Scientifica – Liceo Majorana di Napoli Votazione:89/100 ESPERIENZE PROFESSIONALI Dic. 2006 – Giu. 2007 PININFARINA (Torino, Italia) Stage – Analisi di affidabilità Ho sviluppato indicatori di affidabilità per la scocca di un autoveicolo tramite l’utilizzo di indici MTTF Ho verificato i risultati teorici tramite prove in laboratorio Ho interpolato i risultati teorici e sperimentali creando una procedura aziendale. Feb. 2006 Progetto Universitario di Progetto dell’Autotelaio Ho realizzato il modello di veicolo in codice multi-body, e simulato il comportamento dello stesso al variare di alcuni parametri di progetto. Lug. 2003 – Ott. 2005 Disegnatore Ho eseguito disegni in CAD e UG. Ho analizzato la fattibilità produttiva di componenti. LINGUE STRANIERE Scritto Parlato Letto Inglese Buono Buono Buono Francese Discreto Discreto Buono CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office, di Microsoft Project, di CAD e UG. Buona conoscenza di strumenti di analisi FEM. Conoscenza di base di Visual Basic. INTERESSI Pratico diversi sport a livello amatoriale, tra cui calcio, basket e arrampicata. Sono un appassionato di arte e collaboro alla realizzazione di eventi nei quali vengono presentati quadri di artisti nuovo.");
		CV.add("Paola Dosso Corso De Gasperi 23, 10122 Torino (To) Telefono: + 39 339/7212457 +39 011/8652520 E-mail: paola.dosso@yahoo.it Nata a Torino il 31 Maggio 1977 PROFILO Responsabile relazioni pubbliche e stampa con esposizione internazionale nel settore dei beni di lusso. Alcuni dei risultati principali conseguiti: Ho incrementato sia la visibilità che il ritorno economico dei comunicati con la stampa extra-settore di oltre il 70% Sotto la mia direzione, la tiratura dell’In-House Magazine è aumentata da 8,000 a 25,000 copie. Le mie competenze principali sono: Capacità di costruire e mantenere rapporti interpersonali Comunicazione efficace e capacità di persuasione Capacità di coordinare risorse e progetti anche sotto pressione Lavoro in gruppo e capacità di delega Attenzione al dettaglio ESPERIENZE PROFESSIONALI Da Settembre 2006 AZIMUT-BENETTI SPA (Torino, Italia) – Leader Mondiale negli yacht di lusso Public Relations Manager Gestisco i rapporti con la stampa di settore italiana e mondiale. Gestisco i rapporti con la stampa extra-settore italiana e mondiale. Dirigo i comunicati stampa istituzionali. Gestisco le attività di relazioni pubbliche e interfaccia stampa in occasione dei principali saloni nautici internazionali (Cannes, Monaco, Genova, Ft. Lauderdale, Dusseldorf, Miami, Londra e Dubai). Dirigo l’In-House Magazine di Gruppo, incrementando la tiratura quadrimestrale da 8.000 a 25.000 copie. Ho incrementato la visibilità di Azimut nella stampa extra-settore extraeuropea (misurata in mm2) di oltre l’80%, con la stampa europea extra-settore europea di oltre il 70%, contribuendo a rendere il brand Azimut leader nella nautica di lusso. Ho incrementato il ritorno economico del 70%. Set. 2003 - Ago. 2006 Public Relations Co-ordinator Ho coordinato i rapporti con la stampa di settore italiana. Ho diretto i comunicati stampa di prodotto. Ho collaborato all’organizzazione di eventi. Ho gestito i rapporti con i dealer a livello internazionale per attività di ufficio stampa, realizzazione eventi e media plan. Ho collaborato all’ideazione dell’In-House Magazine di Gruppo. Ho creato un database per attività di ufficio stampa a favore della rete vendita internazionale. Da Aprile 2005 HARLEQUIN MONDADORI Freelance Ho collaborato con la casa editrice per attività di traduzione, lettura e schedatura di testi originali americani ed inglesi. Mar. 2003 – Lug. 2003 COIN SPA (Mestre (VE), Italia) Stage – Customer Relationship Management Ho collaborato alle attività di direct marketing online e offline per possessori della fidelity card. Ho gestito attività di copy-writing per campagne di direct marketing Ho gestito i rapporti con l’agenzia di direct marketing. Ho collaborato alla gestione del database marketing. La campagna direct marketing alla quale ho collaborato ha incrementato la fidelizzazione dei titolari Fidelity Card del 30%. ISTRUZIONE Luglio 2003 Master  in COMUNICAZIONE D’AZIENDA E MARKETING – UPA Ca’ Foscari di Venezia Progetto finale presso COIN spa dal titolo: La fidelizzazione continua attraverso l’offerta di servizi esclusivi ai Titolari Fidelity Card. Settembre 2002 Laurea Quinquennale in SCIENZE DELLA COMUNICAZIONE – Facoltà Università degli Studi di Torino Votazione:110/110 Titolo tesi: L’email marketing e la comunicazione one to one. L’esperienza di Cemit Interactive Media. Giugno 1996 Diploma di Maturità Scientifica – Liceo Copernico di Torino Votazione:55/60 Ott 1999 – Ago 2000: Progetto Erasmus presso Universitaet zu Koeln in Germania. CONOSCENZE INFORMATICHE Ottima conoscenza dell’ambiente Windows, degli applicativi del pacchetto Office, dei programmi di gestione della posta elettronica Outlook e Lotus Notes e di Explorer e Mozilla. Buona conoscenza di Adobe Photoshop, CorelDraw, ACDSee e Paint Shop Pro. INTERESSI  Pratico diversi sport a livello amatoriale, tra cui pallavolo e sci. Sono appassionata di cinema, arte e viaggi.");
		CV.add(" ");
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
		CV.add("");*/
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
	
	/*
	 // cv resta sempre cv, � l'unico che non cambia
	 // cambiano entity_list, dbpedia_list, doc
	   List<String> entity_list= new LinkedList<String>();
	   List<String> dbpedia_list= new LinkedList<String>();
	   DocParser doc= new DocParser();
		doc.setText("");
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
		doc.setEntity(entity_list);
		doc.setDbpedia(dbpedia_list);
		cv.add(doc);
		*/

}
