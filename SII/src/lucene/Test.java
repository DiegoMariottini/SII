package lucene;



import java.io.File;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

import init.DataSet;
import tokenization.DocParser;
import tokenization.TagParser;

public class Test {
	public static void main(String[] args) throws UnirestException {
//		String cv="Il corso prenderà  in esame vari metodi per la progettazione, l'implementazione e la sperimentazione di sistemi adattivi su Web, realizzati mediante tecniche di Intelligenza Artificiale. Particolare attenzione verrà  posta ai sistemi di Information Retrieval, come i motori di ricerca, e a nuove ed emergenti tecnologie idonee per la realizzazione della prossima generazione di strumenti di ricerca intelligenti e personalizzati. Verranno studiati i modelli di retrieval classici, come il modello vector space e i modelli probabilistici, le tecniche di ranking dei documenti, così come l'algoritmo PageRank utilizzato da Google. Saranno affrontati i metodi di Machine Learning in Information Retrieval, incluse le tecniche per la Sentiment Analysis, i metodi di User Modeling necessari per la ricerca personalizzata, i sistemi di raccomandazione, la scoperta e l'analisi delle comunità on-line e social network (come ad es. Facebook e Twitter). Infine verranno descritti i metodi statistici per la valutazione sperimentale dei suddetti sistemi.";
//		List<String> tags= new LinkedList<String>();
//		TagParser parser= new TagParser();
//		tags= parser.parseTags(cv);
//		parser.saveCV(cv, tags);
//		
//		System.out.println(tags.toString());
		
//		List<String> curricula = new LinkedList<String>();
//		File f= new File("myLucene");
//		if(!f.exists()){
//			curricula.add("Musicista, Roma");
//			curricula.add("Ingegnere informatico, Milano");
//			curricula.add("Cameriera, Napoli");
		//}
		
		Repository r= new Repository(1);
//		DataSet ds= new DataSet();
//		List<DocParser> list_default_doc= ds.getList();
//		r.addDocsParser(list_default_doc);
//		
		TagParser parser= new TagParser();
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("Milano");
		for(DocParser dp1 : lista){
			System.out.println(dp1.getText()+ " \n"+dp1.getWeight() + "\n"+ dp1.getMatchedTags().toString()+ "\n");
		}
		
		
		
	}
	
	
//	cv.add("PAOLO ROSSI Residenza: Via dei Ciclamini, 4 Cap. 60500 Città Pescara Prov. PE Tel. ..085/22222Domicilio: Via .delle Rose, 15..Cap. .20100. Città Milano.. Prov. .MI. Tel. .02/333333.Cell. 335/555555e-mail info@cvlavoro.comNato a Pescara. il 26/6/1981. Nazionalità Italiana. Stato civile celibe. Patente di guida B. Servizio civile volontario svolto nel 2004 presso il Comune di Milano, area servizi sociali per i minori.");
//	cv.add("Sono un esperto di Web Marketing (campagne Google Adwords, Bing e Facebook) e posizionamento organico di siti web. Posso vantare un'esperienza di oltre 6 anni e la gestione con successo di budget pubblicitari ingenti. Metto a disposizione le mie competenze per aiutare le aziende ed i privati ad ottenere il massimo dalla loro presenza online. Lavoro come freelance, coadiuvato da un team di altri professionisti, anche loro freelance, in modo da garantire la massima professionalità e mantenere bassi i costi per il cliente.Città: Firenze, Provincia: Firenze");
//	cv.add("Cerco lavoro come educatrice: ho esperienze in vari settori, dall'animazione all'assistenza ad personam ed anche come educatrice in asilo nido. tel 320.0645731, Città: Salò, Provincia: Brescia");
//	cv.add("Anna Paola Conte, Via Ariosto 88, 40126 Bologna (Italia), +39 06123456 +39 312345678, annapaola.conte@example.it, OCCUPAZIONE DESIDERATA Gesitone risorse umane ESPERIENZA PROFESSIONALE gennaio 2005 - alla data attuale Assistente amministrativo Alma Mater Studiorum Via Zamboni 37 40126 Bologna, Gestione della documentazione contabile generale, fiscale e tributaria, relazione con la clientela e il pubblico, settembre 2001 - agosto 2004 Tirocinio Cooperativa Tirrenica Via Enrico Fermi 45 45133 Bologna Analisi Curriculum Vitae, gestione dei colloqui, rapporto con la clientela (fornitori, pubblico, personale interno)");
//	cv.add("ELETTRICISTA qualificato 48 anni italiano esperienza trentennale impianti elettrici e tecnologici civile ed industriale cerca serio impiego presso importante e strutturata azienda del settore no ag. servizi o interinali Roberto");
//	cv.add("IDRAULICO ed elettricista esperto cerca lavoro anche come badante");
//	cv.add("RAGAZZA iscritta a garanzia giovani residente a Roma centro cerca azienda per stage addetta inserimento dati max 25 ore settimana esperienza segreteria preferenza campo: agroalimentare informatico lingue mail claudialidi@libero.it");
//	cv.add("AUTISTA patente B-D italiano 50enne diplomato informatico inoccupato non fumatore offresi come autista per commissioni o altro anche in centro risiedo a Roma Sud");
//	cv.add("Carlo Bianchi, Ruolo: IT Manager, Responsabilità:  - Gestione di un parco macchine di circa 70 client. - Sviluppo, manutenzione e personalizzazione di applicativi Ad-hoc. - Implementazione e gestione di un architettura complessa che prevede la convivenza di  Linux e Windows sia dal lato client che dal lato server.- Help desk di primo e secondo livello, configurazione, manutenzione dei sistemi informativi aziendali a livello sistemistico. - Implementazione del gestionale. - Gestione fornitori.");
//	cv.add("C.V. Istituto tecnico industriale Enrico Fermi 73/100 informatica età 21 cerco lavoro come magazziniere operaio barista cameriere informatico iacchetti.daniele@gmail.com");
//	cv.add("RAGAZZO perito informatico 26 anni cerca lavoro esperienze lavorative cassiere addetto vendita corriere tecnico informatico rapido apprendimento curriculum disponibile contattare tramite email/cellulare");
//	cv.add("40ENNE informatico sistemista Microsoft tecnico Hardware Web Designer esperienza 18 anni patente europea cerca lavoro nella grafica web html flash oppure qualsiasi altro lavoro ottime referenzte tel. ore pasti");
//	cv.add("LAVORO in ambito informatico e dei computer in generale. Varie conoscenze informatiche con attestato come Tecnico Sistemi Multimediali. Particolarmente capace a risolvere problemi sia a livello software che a livello hardware.");
//	cv.add("CUOCO russo 32 anni con esperienza dall'antipasto al dessert esperto griglista carne e pesce ho fatto corso di Scuola Italiana Pizzaioli serio professionale puntuale residente Roma Acilia. Alex alexandr.roma55@gmail.com");
//	cv.add("MANOVALE Pittore Controsoffitti Pavimentista Piastrellista del mestiere da generazione di famiglia cerca lavoro anche a giornata Max serietà e manifattura Claudio tel.333 8820598");
//	cv.add("PENSIONATO ex insegnante informatica matematica musicista colto educato cerca incarico (tutor o insegn. informatica aiuto compiti lavori vari segreteria ecc.) disposto viaggiare no vendita. tel. 347 9629591");
//	cv.add("PASTICCERE con molta esperienza nella migliore pasticceria di Roma esperienza di lavoro: torta decorazioni torta cornetto sfoglia frolla mignon biscotti Gmail: mahajabin98@gmail.com tel. 342 7768040");
//	cv.add("MURATORE autonomo abile esperto mastro 3°livello esegue lavori di ristrutturazioni complete piastrellista pittore rifinito pavimenti bagni cucine terrazzi muri intonaci rasature guaina porfido scorza copertina conoscenza materiali e disegno djmaaa@libero.it tel. 349 4387309");
//	cv.add("IMBIANCHINO altamente qualificato mastro muratore piastrellista specializzato esperto rifinito in opere murarie generali d'interni ed esterni ottima conoscenza disegno e materiali offresi per ditte e privati anche trasporto con furgoncino djmaaa@libero.it tel. 339 8178123");
//	cv.add("CUOCO Italiano residente a Mentana serio professionale e molto devoto al lavoro cerca immediata sistemazione x lavoro solo serale in zona sono capace di apportare le mie conoscenze ed esperienze al servizio di chi volesse contattarmi antonio10alex@yahoo.it tel. 338 1633196");

}
