package it.univpm.AssistenteFantacalcio.model;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

public class DifferenzaReti {

	private int differenzaReti;
	private int golSegnatiSquadra;
	private int golSubitiSquadra;
	
	/** Costruttore dell'oggetto.
     * @param 
     */
	public DifferenzaReti(int golSegnatiSquadra, int golSubitiSquadra) {
		this.golSegnatiSquadra = golSegnatiSquadra;
		this.golSubitiSquadra = golSubitiSquadra;
		this.differenzaReti = golSegnatiSquadra - golSubitiSquadra;
	}
	/**
	 * Metodo che restituisce la differenza reti della squadra.
	 * @return differenzaReti
	 */
	public int getDifferenzaReti() {
		return differenzaReti;
	}
	/**
	 * Metodo che setta la differenza reti.
	 * @param differenzaReti
	 */
	public void setDifferenzaReti(int differenzaReti) {
		this.differenzaReti = differenzaReti;
	}
	/**
	 * Metodo che restituisce i gol segnati dalla squadra.
	 * @return golSegnatiSquadra
	 */
	public int getGolSegnatiSquadra() {
		return golSegnatiSquadra;
	}
	/**
	 * Metodo che setta i gol segnati dalla squadra.
	 * @param golSegnatiSquadra
	 */
	public void setGolSegnatiSquadra(int golSegnatiSquadra) {
		this.golSegnatiSquadra = golSegnatiSquadra;
	}
	/**
	 * Metodo che restituisce i gol subiti dalla squadra.
	 * @return golSubitiSquadra
	 */
	public int getGolSubitiSquadra() {
		return golSubitiSquadra;
	}
	/**
	 * Metodo che setta i gol subiti dalla squadra.
	 * @param golSubitiSquadra
	 */
	public void setGolSubitiSquadra(int golSubitiSquadra) {
		this.golSubitiSquadra = golSubitiSquadra;
	}

	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la differenza reti.
	 */
	@Override
	public String toString() {
		return "differenzaReti = " + differenzaReti;
	}
}
