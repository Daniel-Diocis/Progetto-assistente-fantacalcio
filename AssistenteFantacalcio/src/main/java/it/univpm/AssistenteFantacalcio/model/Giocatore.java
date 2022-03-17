package it.univpm.AssistenteFantacalcio.model;

import java.util.Vector;

/**
 @author Enrico Maria Flati
 @author Daniel Diocis Calero
 */


public class Giocatore {

	private int Id;
	private String Ruolo;
	private String Nome;
	private String Squadra;
	private Stats stats;
	
	// Costruttore dell'oggetto.
	public Giocatore() {
		super();
	}
	
	/** Costruttore dell'oggetto.
	   @param Id: Id del giocatore
     */
	public Giocatore(int Id) {
		this.Id=Id;
		this.Ruolo=null;
		this.Nome=null;
		this.Squadra=null;
	}
	
	/** Costruttore dell'oggetto.
       @param Nome: Nome del giocatore
     */
	public Giocatore(String Nome) {
		this.Id=0;
		this.Ruolo=null;
		this.Nome=Nome;
		this.Squadra=null;
	}
	
	/** Costruttore dell'oggetto.
     * @param Nome: Nome del giocatore
     * @param Squadra: Squadra del giocatore
     */
	public Giocatore(String Nome, String Squadra) {
		this.Id=0;
		this.Ruolo=null;
		this.Nome=Nome;
		this.Squadra=Squadra;
	}

	/** Costruttore completo.
	 * @param Id: Id del giocatore
     * @param R: Ruolo del giocatore
     * @param Nome: Nome del giocatore
     * @param Squadra: Squadra del giocaotre
     */
	public Giocatore(int Id, String Ruolo, String Nome, String Squadra) {
		this.Id = Id;
		this.Ruolo = Ruolo;
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
	public String getRuolo() {
		return Ruolo;
	}
	
	/**
     * Metodo che setta il ruolo del giocatore.
     * @param String R.
     */
	public void setRuolo(String Ruolo) {
		this.Ruolo = Ruolo;
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
     * Metodo che restituisce le statistiche del giocatore.
     * @return stats
     */
	public Stats getStats() {
		return stats;
	}

	/**
     * Metodo che setta le statistiche del giocatore.
     * @param Stats stats.
     */
	public void setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Override del metodo toString.
	 * @return String che rappresenta i dati del giocatore.
	 */
	@Override
	public String toString() {
		return "Id=" + Id + ", Ruolo=" + Ruolo + ", Nome=" + Nome + ", Squadra=" + Squadra
				+ ", Stats=" + stats + "";
	}
}
