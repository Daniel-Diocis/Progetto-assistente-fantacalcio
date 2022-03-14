package it.univpm.AssistenteFantacalcio.model;

public class Stats {
	private int Pg;
	private double Mf;
	private int golFatti;
	private int golSubiti;
	private int assist;
	private int ammonizioni;
	private int espulsioni;
	
	/** Costruttore dell'oggetto.
	 * 
     */
	public Stats() {
		this.Pg = 0;
		this.Mf = 0;
		this.golFatti = 0;
		this.golSubiti = 0;
		this.assist = 0;
		this.ammonizioni = 0;
		this.espulsioni = 0;
	}
	
	
	/** Costruttore dell'oggetto.
     * @param Pg: Partite giocate.
     * @param Mf: Media fantavoto.
     */
	public Stats(int Pg, double Mf) {
		super();
		this.Pg = Pg;
		this.Mf = Mf;
	}
	

	/** Costruttore dell'oggetto.
     * @param Pg: Partite giocate.
     * @param Mf: Media fantavoto.
     * @param golFatti: gol segnati 
     * @param golSubiti: gol subiti
     * @param assist: assist
     */
	public Stats(int Pg, double Mf, int golFatti, int golSubiti, int assist) {
		super();
		this.Pg = Pg;
		this.Mf = Mf;
		this.golFatti = golFatti;
		this.golSubiti = golSubiti;
		this.assist = assist;
	}

	
	/** Costruttore dell'oggetto.
     * @param Pg: Partite giocate.
     * @param Mf: Media fantavoto.
     * @param golFatti: gol segnati 
     * @param golSubiti: gol subiti
     * @param assist: assist
     * @param ammonizioni: ammonizioni
     * @param espulsioni: espulsioni
     */
	public Stats(int Pg, double Mf, int golFatti, int golSubiti, int assist, int ammonizioni,
			int espulsioni) {
		super();
		this.Pg = Pg;
		this.Mf = Mf;
		this.golFatti = golFatti;
		this.golSubiti = golSubiti;
		this.assist = assist;
		this.ammonizioni = ammonizioni;
		this.espulsioni = espulsioni;
	}

	/**
     * Metodo che restituisce le Pg.
     * @return main
     */
	public int getPg() {
		return Pg;
	}
	
	/**
     * Metodo che setta le partite giocate.
     * @param String main.
     */
	public void setMain(int Pg) {
		this.Pg = Pg;
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
	public int getgolFatti() {
		return golFatti;
	}
	
	/**
     * Metodo che setta i gol fatti.
     * @param int golFatti.
     */
	public void setgolFatti(int golFatti) {
		this.golFatti = golFatti;
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
	
	
	/**
	 * Override del metodo toString.
	 * @return String che rappresenta le stats.
	 */
	@Override
	public String toString() {
		return "Partite giocate=" + Pg + "Media fantavoto=" + Mf + ", golFatti=" + golFatti + ", golSubiti=" + golSubiti + ", assist="
				+ assist + ", ammonizioni=" + ammonizioni + ", espulsioni=" + espulsioni + "";
	}
}
