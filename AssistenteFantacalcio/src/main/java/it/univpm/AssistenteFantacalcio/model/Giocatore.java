package it.univpm.AssistenteFantacalcio.model;

import java.util.Vector;

public class Giocatore {
	private int Id;
	private String R;
	private String Nome;
	private String Squadra;
	private Vector<Stats> vector = new Vector<Stats>();
	
	// Costruttore dell'oggetto.
	public Giocatore() {
		super();
	}
	
	/** Costruttore dell'oggetto.
	   @param Id: Id del giocatore
     */
	public Giocatore(int Id) {
		this.Id=Id;
		this.R=null;
		this.Nome=null;
		this.Squadra=null;
	}
	
	/** Costruttore dell'oggetto.
       @param Nome: Nome del giocatore
     */
	public Giocatore(String Nome) {
		this.Id=0;
		this.R=null;
		this.Nome=Nome;
		this.Squadra=null;
	}
	
	/** Costruttore dell'oggetto.
     * @param Nome: Nome del giocatore
     * @param Squadra: Squadra del giocatore
     */
	public Giocatore(String Nome, String Squadra) {
		this.Id=0;
		this.R=null;
		this.Nome=Nome;
		this.Squadra=Squadra;
	}

	/** Costruttore completo.
     * @param Nome: Nome del giocatore
     * @param Squadra: Squadra del giocaotre
     * @param Id: Id del giocatore
     * @param R: Ruolo del giocatore
     */
	public Giocatore(int Id, String R, String Nome, String Squadra) {
		this.Id = Id;
		this.R = R;
		this.Nome = Nome;
		this.Squadra = Squadra;
	}

	
	/**
     * Metodo che restituisce l'Id del giocatore.
     * @return Id
     */
	public int getId() {
		return Id;
	}
	
	/**
     * Metodo che setta l'Id del giocatore.
     * @param int Id.
     */
	public void setId(int Id) {
		this.Id = Id;
	}

	/**
     * Metodo che restituisce il ruolo del giocatore.
     * @return R
     */
	public String getR() {
		return R;
	}
	
	/**
     * Metodo che setta il ruolo del giocatore.
     * @param String R.
     */
	public void setR(String R) {
		this.R = R;
	}
	

	/**
     * Metodo che restituisce il nome del giocatore.
     * @return Nome.
     */
	public String getNome() {
		return Nome;
	}
	
	/**
     * Metodo che setta il nome del giocatore.
     * @param String Nome.
     */
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	/**
     * Metodo che restituisce la squadra del giocatore.
     * @return Squadra
     */
	public String getSquadra() {
		return Squadra;
	}
	
	/**
     * Metodo che setta la squadra del giocatore.
     * @param String Squadra.
     */
	public void setSquadra(String Squadra) {
		this.Squadra = Squadra;
	}
	
	/**
     * Metodo che restituisce il vettore di statistiche del giocatore.
     * @return vector.
     */
	public Vector<Stats> getVector() {
		return vector;
	}

	/**
     * Metodo che setta il vettore di statistiche del giocatore.
     * @param vettore di stats.
     */
	public void setVector(Vector<Stats> vector) {
		this.vector = vector;
	}
	
	/**
     * Metodo che scrive il vettore come una stringa.
     * @return String toReturn che rappresenta le stats del giocatore.
     */
	public String toStringVector() {
		String toReturn="";
		for (int i=0; i<vector.size(); i++)
			toReturn += vector.get(i).toString();
		return toReturn;
	}

	/**
	 * Override del metodo toString.
	 * @return String che rappresenta il giocatore.
	 */
	@Override
	public String toString() {
		return "Id=" + Id + ", R=" + R + ", Nome=" + Nome + ", Squadra=" + Squadra
				+ ", StatsArray=" + toStringVector() + "";
	}

	public static Object get(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
