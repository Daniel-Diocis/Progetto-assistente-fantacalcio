package it.univpm.AssistenteFantacalcio.model;

public class Stats {


	private int partiteGiocate;
	private double Mf;
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
		this.Mf = 0;
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
     * @param Mf: Media fantavoto.
     */
	public Stats(int partiteGiocate, double Mf) {
		super();
		this.partiteGiocate = partiteGiocate;
		this.Mf = Mf;
	}
	

	/** Costruttore dell'oggetto.
     * @param Pg: Partite giocate.
     * @param Mf: Media fantavoto.
     * @param golFatti: gol segnati 
     * @param golSubiti: gol subiti
     * @param assist: assist
     */
	public Stats(int partiteGiocate, double Mf, int golFattiNonSuRigore, int golSubiti, int assist) {
		super();
		this.partiteGiocate = partiteGiocate;
		this.Mf = Mf;
		this.golFattiNonSuRigore = golFattiNonSuRigore;
		this.golSubiti = golSubiti;
		this.assist = assist;
	}

	
	/** Costruttore dell'oggetto.
     * @param Pg: Partite giocate.
     * @param Mf: Media fantavoto.
     * @param golFattiNonSuRigore: golFattiNonSuRigore
     * @param golSubiti: gol subiti
     * @param assist: assist
     * @param ammonizioni: ammonizioni
     * @param espulsioni: espulsioni
     */
	public Stats(int partiteGiocate, double Mf, int golFattiNonSuRigore, int golSubiti, int rigoriParati,int rigoriCalciati, int rigoriFatti, 
			int rigoriSbagliati, GolSegnatiInTotale golSegnatiInTotale, MediaGolFatti mediaGolFatti, MediaGolSubiti mediaGolSubiti, int assist, MediaAssist mediaAssist, int ammonizioni, int espulsioni, int autogol) {
		super();
		this.partiteGiocate = partiteGiocate;
		this.Mf = Mf;
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
     * Metodo che restituisce le Pg.
     * @return main
     */
	public int getpartiteGiocate() {
		return partiteGiocate;
	}
	
	/**
     * Metodo che setta le partite giocate.
     * @param String main.
     */
	public void setpartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}
	
	/**
     * Metodo che restituisce la Mf.
     * @return Mf
     */
	public double getMf() {
		return Mf;
	}
	
	/**
     * Metodo che setta la media fantavoto.
     * @param String Mf.
     */
	public void setMf(double Mf) {
		this.Mf = Mf;
	}
	
	/**
     * Metodo che restituisce i gol fatti.
     * @return golFatti
     */
	public int getgolFattiNonSuRigore() {
		return golFattiNonSuRigore;
	}
	
	/**
     * Metodo che setta i gol fatti.
     * @param int golFatti.
     */
	public void setgolFattiNonSuRigore(int golFattiNonSuRigore) {
		this.golFattiNonSuRigore = golFattiNonSuRigore;
	}
	
	/**
     * Metodo che restituisce golSubiti.
     * @return golSubiti
     */
	public int getgolSubiti() {
		return golSubiti;
	}
	
	/**
     * Metodo che setta golSubiti.
     * @param int golSubiti.
     */
	public void setgolSubiti(int golSubiti) {
		this.golSubiti = golSubiti;
	}
	
	public int getRigoriParati() {
		return rigoriParati;
	}


	public void setRigoriParati(int rigoriParati) {
		this.rigoriParati = rigoriParati;
	}	
	
	public int getRigoriCalciati() {
		return rigoriCalciati;
	}


	public void setRigoriCalciati(int rigoriCalciati) {
		this.rigoriCalciati = rigoriCalciati;
	}
	
	public int getRigoriFatti() {
		return rigoriFatti;
	}


	public void setRigoriFatti(int rigoriFatti) {
		this.rigoriFatti = rigoriFatti;
	}
	
	public int getRigoriSbagliati() {
		return rigoriSbagliati;
	}


	public void setRigoriSbagliati(int rigoriSbagliati) {
		this.rigoriSbagliati = rigoriSbagliati;
	}
	
	public GolSegnatiInTotale getGolSegnatiInTotale() {
		return golSegnatiInTotale;
	}


	public void setGolSegnatiInTotale(GolSegnatiInTotale golSegnatiInTotale) {
		this.golSegnatiInTotale = golSegnatiInTotale;
	}
	
	public MediaGolFatti getMediaGolFatti() {
		return mediaGolFatti;
	}


	public void setMediaGolFatti(MediaGolFatti mediaGolFatti) {
		this.mediaGolFatti = mediaGolFatti;
	}
	
	public MediaGolSubiti getMediaGolSubiti() {
		return mediaGolSubiti;
	}


	public void setMediaGolSubiti(MediaGolSubiti mediaGolSubiti) {
		this.mediaGolSubiti = mediaGolSubiti;
	}
	
	/**
     * Metodo che restituisce gli assist
     * @return assist
     */
	public int getassist() {
		return assist;
	}
	
	/**
     * Metodo che setta gli assist.
     * @param int assist.
     */
	public void setassist(int assist) {
		this.assist = assist;
	}
	
	public MediaAssist getMediaAssist() {
		return mediaAssist;
	}


	public void setMediaAssist(MediaAssist mediaAssist) {
		this.mediaAssist = mediaAssist;
	}
	
	/**
     * Metodo che restituisce le ammonizioni.
     * @return ammonizioni
     */
	public int getammonizioni() {
		return ammonizioni;
	}
	
	/**
     * Metodo che setta le ammonizioni.
     * @param int ammonizioni.
     */
	public void setammonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}
	
	/**
     * Metodo che restituisce epulsioni.
     * @return espulsioni
     */
	public int getespulsioni() {
		return espulsioni;
	}
	
	/**
     * Metodo che setta espulsioni.
     * @param int espulsioni.
     */
	public void setespulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}
	
	public int getAutogol() {
		return autogol;
	}


	public void setAutogol(int autogol) {
		this.autogol = autogol;
	}
	
	
	/**
	 * Override del metodo toString.
	 * @return String che rappresenta le stats.
	 */
	@Override
	public String toString() {
		return "Partite giocate=" + partiteGiocate + ", Media fantavoto=" + Mf + ", golFattiNonSuRigore=" + golFattiNonSuRigore + ", golSubiti=" + golSubiti +", rigoriParati=" + rigoriParati + ",rigoriCalciati = " + rigoriCalciati + ", rigoriFatti=" + rigoriFatti
				+ ", rigoriSbagliati = " + rigoriSbagliati + ", gol Segnati in totale=" + golSegnatiInTotale + ", mediaGolFatti=" + mediaGolFatti + ", mediaGolSubiti=" + mediaGolSubiti + ", assist="+ assist + ", mediaAssist=" + mediaAssist + ", ammonizioni=" + ammonizioni + ", espulsioni=" + espulsioni + ", autogol=" + autogol + "";
	}
}
