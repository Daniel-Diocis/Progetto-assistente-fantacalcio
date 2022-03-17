package it.univpm.AssistenteFantacalcio.model;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

public class Stats {


	private int partiteGiocate;
	private double mediaFantavoto;
	private int golFattiNonSuRigore;
	private int golSubiti;
	private int rigoriParati;
	private int rigoriCalciati;
	private int rigoriFatti;
	private int rigoriSbagliati;
	private GolSegnatiInTotale golSegnatiInTotale;
	private MediaGolFatti mediaGolFatti;
	private MediaGolSubiti mediaGolSubiti;
	private int assist;
	private int ammonizioni;
	private MediaAssist mediaAssist;
	private int espulsioni;
	private int autogol;
	
	/** Costruttore dell'oggetto.
	 * 
     */
	public Stats() {
		this.partiteGiocate = 0;
		this.mediaFantavoto = 0;
		this.golFattiNonSuRigore = 0;
		this.golSubiti = 0;
		this.rigoriParati = 0;
		this.rigoriCalciati = 0;
		this.rigoriFatti = 0;
		this.rigoriSbagliati = 0;
		this.golSegnatiInTotale = null;
		this.mediaGolFatti = null;
		this.mediaGolSubiti = null;
		this.assist = 0;
		this.mediaAssist = null;
		this.ammonizioni = 0;
		this.espulsioni = 0;
		this.autogol = 0;
	}
	
	
	/** Costruttore dell'oggetto.
     * @param Pg: Partite giocate.
     * @param mediaFantavoto: Media fantavoto.
     */
	public Stats(int partiteGiocate, double mediaFantavoto) {
		super();
		this.partiteGiocate = partiteGiocate;
		this.mediaFantavoto = mediaFantavoto;
	}
	

	/** Costruttore dell'oggetto.
     * @param partiteGiocate: Partite giocate.
     * @param mediaFantavoto: Media fantavoto.
     * @param golFattiNonSuRigore: gol segnati non su rigore dal giocatore.
     * @param golSubiti: gol subiti dal giocatore (portiere).
     * @param assist: assist fatti dal giocatore
     */
	public Stats(int partiteGiocate, double mediaFantavoto, int golFattiNonSuRigore, int golSubiti, int assist) {
		super();
		this.partiteGiocate = partiteGiocate;
		this.mediaFantavoto = mediaFantavoto;
		this.golFattiNonSuRigore = golFattiNonSuRigore;
		this.golSubiti = golSubiti;
		this.assist = assist;
	}

	
	/** Costruttore dell'oggetto.
     * @param partiteGiocate: Partite giocate.
     * @param mediaFantavoto: Media fantavoto.
     * @param golFattiNonSuRigore: gol segnati non su rigore dal giocatore.
     * @param golSubiti: gol subiti dal giocatore (portiere).
     * @param rigoriParati: rigori parati dal giocatore (portiere).
     * @param rigoriCalciati: rigori calciati dal giocatore.
     * @param rigoriFatti: rigori segnati dal giocatore.
     * @param rigoriSbagliati: rigori sbagliati dal giocatore.
     * @param golSegnatiInTotale: gol segnati in totale dal giocatore.
     * @param mediaGolFatti: media gol fatti dal giocatore.
     * @param mediaGolSubiti: media gol subiti dal giocatore (portiere).
     * @param assist: assist fatti dal giocatore.
     * @param mediaAssist: media assist del giocatore
     * @param ammonizioni: ammonizioni avute dal giocatore.
     * @param espulsioni: espulsioni avute dal giocatore.
     * @param autogol: autogol fatti dal giocatore
     */
	public Stats(int partiteGiocate, double mediaFantavoto, int golFattiNonSuRigore, int golSubiti, int rigoriParati,int rigoriCalciati, int rigoriFatti, 
			int rigoriSbagliati, GolSegnatiInTotale golSegnatiInTotale, MediaGolFatti mediaGolFatti, MediaGolSubiti mediaGolSubiti, int assist, MediaAssist mediaAssist, int ammonizioni, int espulsioni, int autogol) {
		super();
		this.partiteGiocate = partiteGiocate;
		this.mediaFantavoto = mediaFantavoto;
		this.golFattiNonSuRigore = golFattiNonSuRigore;
		this.golSubiti = golSubiti;
		this.rigoriParati = rigoriParati;
		this.rigoriCalciati = rigoriCalciati;
		this.rigoriFatti = rigoriFatti;
		this.rigoriSbagliati = rigoriSbagliati;
		this.golSegnatiInTotale = golSegnatiInTotale;
		this.mediaGolFatti = mediaGolFatti;
		this.mediaGolSubiti = mediaGolSubiti;
		this.assist = assist;
		this.mediaAssist = mediaAssist;
		this.ammonizioni = ammonizioni;
		this.espulsioni = espulsioni;
		this.autogol = autogol;
	}

	/**
     * Metodo che restituisce le partite giocate dal giocatore.
     * @return partiteGiocate
     */
	public int getpartiteGiocate() {
		return partiteGiocate;
	}
	
	/**
     * Metodo che setta le partite giocate dal giocatore.
     * @param int partiteGiocate.
     */
	public void setpartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}
	
	/**
     * Metodo che restituisce la media fantavoto del giocatore.
     * @return mediaFantavoto
     */
	public double getmediaFantavoto() {
		return mediaFantavoto;
	}
	
	/**
     * Metodo che setta la media fantavoto del giocatore.
     * @param double Mf.
     */
	public void setmediaFantavoto(double mediaFantavoto) {
		this.mediaFantavoto = mediaFantavoto;
	}
	
	/**
     * Metodo che restituisce i gol fatti non su rigore dal giocatore.
     * @return golFattiNonSuRigore
     */
	public int getgolFattiNonSuRigore() {
		return golFattiNonSuRigore;
	}
	
	/**
     * Metodo che setta i gol fatti non su rigore dal giocatore.
     * @param int golFattiNonSuRigore.
     */
	public void setgolFattiNonSuRigore(int golFattiNonSuRigore) {
		this.golFattiNonSuRigore = golFattiNonSuRigore;
	}
	
	/**
     * Metodo che restituisce i gol subiti dal giocatore (portiere).
     * @return golSubiti
     */
	public int getgolSubiti() {
		return golSubiti;
	}
	
	/**
     * Metodo che setta gol subiti dal giocatore (portiere).
     * @param int golSubiti.
     */
	public void setgolSubiti(int golSubiti) {
		this.golSubiti = golSubiti;
	}
	
	/**
     * Metodo che restituisce i rigori parati dal giocatore (portiere).
     * @return rigoriParati
     */
	public int getRigoriParati() {
		return rigoriParati;
	}

	/**
     * Metodo che setta i rigori parati dal giocatore (portiere).
     * @param int rigoriParati.
     */
	public void setRigoriParati(int rigoriParati) {
		this.rigoriParati = rigoriParati;
	}	
	
	/**
     * Metodo che restituisce i rigori calciati dal giocatore.
     * @return rigoriCalciati
     */
	public int getRigoriCalciati() {
		return rigoriCalciati;
	}

	/**
     * Metodo che setta i rigori calciati dal giocatore.
     * @param int rigoriCalciati.
     */
	public void setRigoriCalciati(int rigoriCalciati) {
		this.rigoriCalciati = rigoriCalciati;
	}
	
	/**
     * Metodo che restituisce i rigori segnati dal giocatore.
     * @return rigoriFatti
     */
	public int getRigoriFatti() {
		return rigoriFatti;
	}

	/**
     * Metodo che setta i rigori segnati dal giocatore.
     * @param int rigoriFatti.
     */
	public void setRigoriFatti(int rigoriFatti) {
		this.rigoriFatti = rigoriFatti;
	}
	
	/**
     * Metodo che restituisce i rigori sbagliati dal giocatore.
     * @return rigoriSbagliati
     */
	public int getRigoriSbagliati() {
		return rigoriSbagliati;
	}

	/**
     * Metodo che setta i rigori sbagliati dal giocatore.
     * @param int rigoriSbagliati.
     */
	public void setRigoriSbagliati(int rigoriSbagliati) {
		this.rigoriSbagliati = rigoriSbagliati;
	}
	
	/**
     * Metodo che restituisce i gol segnati in totale dal giocatore.
     * @return golSegnatiInTotale
     */
	public GolSegnatiInTotale getGolSegnatiInTotale() {
		return golSegnatiInTotale;
	}

	/**
     * Metodo che setta i gol segnati in totale dal giocatore.
     * @param int golSegnatiInTotale.
     */
	public void setGolSegnatiInTotale(GolSegnatiInTotale golSegnatiInTotale) {
		this.golSegnatiInTotale = golSegnatiInTotale;
	}
	
	/**
     * Metodo che restituisce la media gol del giocatore.
     * @return mediaGolFatti
     */
	public MediaGolFatti getMediaGolFatti() {
		return mediaGolFatti;
	}

	/**
     * Metodo che setta la media gol del giocatore.
     * @param int mediaGolFatti.
     */
	public void setMediaGolFatti(MediaGolFatti mediaGolFatti) {
		this.mediaGolFatti = mediaGolFatti;
	}
	
	/**
     * Metodo che restituisce la media gol subiti dal giocatore (portiere).
     * @return mediaGolSubiti
     */
	public MediaGolSubiti getMediaGolSubiti() {
		return mediaGolSubiti;
	}

	/**
     * Metodo che setta la media gol subiti dal giocatore (portiere).
     * @param int mediaGolSubiti.
     */
	public void setMediaGolSubiti(MediaGolSubiti mediaGolSubiti) {
		this.mediaGolSubiti = mediaGolSubiti;
	}
	
	/**
     * Metodo che restituisce gli assist fatti dal giocatore
     * @return assist
     */
	public int getassist() {
		return assist;
	}
	
	/**
     * Metodo che setta gli assist fatti dal giocatore.
     * @param int assist.
     */
	public void setassist(int assist) {
		this.assist = assist;
	}
	
	/**
     * Metodo che restituisce la media assist del giocatore.
     * @return mediaAssist
     */
	public MediaAssist getMediaAssist() {
		return mediaAssist;
	}

	/**
     * Metodo che setta la media assist del giocatore.
     * @param int mediaAssist.
     */
	public void setMediaAssist(MediaAssist mediaAssist) {
		this.mediaAssist = mediaAssist;
	}
	
	/**
     * Metodo che restituisce le ammonizioni avute dal giocatore.
     * @return ammonizioni
     */
	public int getammonizioni() {
		return ammonizioni;
	}
	
	/**
     * Metodo che setta le ammonizioni avute dal giocatore.
     * @param int ammonizioni.
     */
	public void setammonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}
	
	/**
     * Metodo che restituisce le epulsioni avute dal giocatore.
     * @return espulsioni
     */
	public int getespulsioni() {
		return espulsioni;
	}
	
	/**
     * Metodo che setta le espulsioni avute dal giocatore.
     * @param int espulsioni.
     */
	public void setespulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}
	
	/**
     * Metodo che restituisce gli autogol fatti dal giocatore.
     * @return autogol
     */
	public int getAutogol() {
		return autogol;
	}

	/**
     * Metodo che setta gli autogol dal giocatore.
     * @param int autogol.
     */
	public void setAutogol(int autogol) {
		this.autogol = autogol;
	}
	
	
	/**
	 * Override del metodo toString.
	 * @return String che rappresenta le statistiche del giocatore.
	 */
	@Override
	public String toString() {
		return "Partite giocate=" + partiteGiocate + ", Media fantavoto=" + mediaFantavoto + ", golFattiNonSuRigore=" + golFattiNonSuRigore + ", golSubiti=" + golSubiti +", rigoriParati=" + rigoriParati + ",rigoriCalciati = " + rigoriCalciati + ", rigoriFatti=" + rigoriFatti
				+ ", rigoriSbagliati = " + rigoriSbagliati + ", gol Segnati in totale=" + golSegnatiInTotale + ", mediaGolFatti=" + mediaGolFatti + ", mediaGolSubiti=" + mediaGolSubiti + ", assist="+ assist + ", mediaAssist=" + mediaAssist + ", ammonizioni=" + ammonizioni + ", espulsioni=" + espulsioni + ", autogol=" + autogol + "";
	}
}
