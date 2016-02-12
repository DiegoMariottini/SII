package lucene;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

import tokenization.DocParser;
import tokenization.TagParser;

public class Test {
	public static void main(String[] args) throws UnirestException {
		List<String> curricula = new LinkedList<String>();
//		curricula.add("Musicista, Roma");
//		curricula.add("Ingegnere informatico, Milano");
//		curricula.add("Cameriera, Napoli");
		
		
//		List<String> curricula = new LinkedList<String>();
//		curricula.add("Sono un esperto di Web Marketing (campagne Google Adwords, Bing e Facebook) e posizionamento organico di siti web. Posso vantare un'esperienza di oltre 6 anni e la gestione con successo di budget pubblicitari ingenti. Metto a disposizione le mie competenze per aiutare le aziende ed i privati ad ottenere il massimo dalla loro presenza online. Lavoro come freelance, coadiuvato da un team di altri professionisti, anche loro freelance, in modo da garantire la massima professionalità e mantenere bassi i costi per il cliente.Città: Firenze, Provincia: Firenze");
//		curricula.add("Cerco lavoro come educatrice: ho esperienze in vari settori, dall'animazione all'assistenza ad personam ed anche come educatrice in asilo nido. tel 320.0645731, Città: Salò, Provincia: Brescia");
//		curricula.add("Anna Paola Conte, Via Ariosto 88, 40126 Bologna (Italia), +39 06123456 +39 312345678, annapaola.conte@example.it, OCCUPAZIONE DESIDERATA Gesitone risorse umane ESPERIENZA PROFESSIONALE gennaio 2005 - alla data attuale Assistente amministrativo Alma Mater Studiorum Via Zamboni 37 40126 Bologna, Gestione della documentazione contabile generale, fiscale e tributaria, relazione con la clientela e il pubblico, settembre 2001 - agosto 2004 Tirocinio Cooperativa Tirrenica Via Enrico Fermi 45 45133 Bologna Analisi Curriculum Vitae, gestione dei colloqui, rapporto con la clientela (fornitori, pubblico, personale interno)");
//		curricula.add("ELETTRICISTA qualificato 48 anni italiano esperienza trentennale impianti elettrici e tecnologici civile ed industriale cerca serio impiego presso importante e strutturata azienda del settore no ag. servizi o interinali Roberto");
//		curricula.add("IDRAULICO ed elettricista esperto cerca lavoro anche come badante");
//		curricula.add("RAGAZZA iscritta a garanzia giovani residente a Roma centro cerca azienda per stage addetta inserimento dati max 25 ore settimana esperienza segreteria preferenza campo: agroalimentare informatico lingue mail claudialidi@libero.it");
//		curricula.add("AUTISTA patente B-D italiano 50enne diplomato informatico inoccupato non fumatore offresi come autista per commissioni o altro anche in centro risiedo a Roma Sud");
//		curricula.add("Carlo Bianchi, Ruolo: IT Manager, Responsabilità:  - Gestione di un parco macchine di circa 70 client. - Sviluppo, manutenzione e personalizzazione di applicativi Ad-hoc. - Implementazione e gestione di un architettura complessa che prevede la convivenza di  Linux e Windows sia dal lato client che dal lato server.- Help desk di primo e secondo livello, configurazione, manutenzione dei sistemi informativi aziendali a livello sistemistico. - Implementazione del gestionale. - Gestione fornitori.");
//		curricula.add("C.V. Istituto tecnico industriale Enrico Fermi 73/100 informatica età 21 cerco lavoro come magazziniere operaio barista cameriere informatico iacchetti.daniele@gmail.com");
//		curricula.add("RAGAZZO perito informatico 26 anni cerca lavoro esperienze lavorative cassiere addetto vendita corriere tecnico informatico rapido apprendimento curriculum disponibile contattare tramite email/cellulare");
//		curricula.add("40ENNE informatico sistemista Microsoft tecnico Hardware Web Designer esperienza 18 anni patente europea cerca lavoro nella grafica web html flash oppure qualsiasi altro lavoro ottime referenzte tel. ore pasti");
//		curricula.add("LAVORO in ambito informatico e dei computer in generale. Varie conoscenze informatiche con attestato come Tecnico Sistemi Multimediali. Particolarmente capace a risolvere problemi sia a livello software che a livello hardware.");
//		curricula.add("CUOCO russo 32 anni con esperienza dall'antipasto al dessert esperto griglista carne e pesce ho fatto corso di Scuola Italiana Pizzaioli serio professionale puntuale residente Roma Acilia. Alex alexandr.roma55@gmail.com");
		
		TagParser parser = new TagParser();
		DocParser dp= new DocParser();
		for(String s : curricula){
			dp = parser.parseTags(s);
			parser.saveCV(dp);
		}
		
		List<DocParser> lista = new LinkedList<DocParser>();
		lista = parser.parseQuery("maestra d'asilo");
		for(DocParser dp1 : lista){
			System.out.println(dp1.getText()+ " \n"+dp1.getWeight() + "\n");
		}
		
	}
}
