package it.univpm.AssistenteFantacalcio.model;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

public class GolSegnatiInTotale {
	
	private int golSegnatiInTotale;
	private int golFattiNonSuRigore;
	private int rigoriFatti;
	
	/** Costruttore dell'oggetto.
     * @param golFattiNonSuRigore: rappresenta i gol fatti non su rigore dal giocatore
     * @param rigoriFatti: rappresenta i rigori segnati dal giocatore
     */
	public GolSegnatiInTotale(int golFattiNonSuRigore, int rigoriFatti) {
		this.golFattiNonSuRigore = golFattiNonSuRigore;
		this.rigoriFatti = rigoriFatti;
		this.golSegnatiInTotale = golFattiNonSuRigore+rigoriFatti;
	}
	
	/**
     * Metodo che restituisce i gol segnati in totale dal giocatore.
     * @return golSegnatiInTotale
     */
	public int getGolSegnatiInTotale() {
		return golSegnatiInTotale;
	}

	/**
     * Metodo che setta i gol segnati in totale dal giocatore.
     * @param int golSegnatiInTotale.
     */
	public void setGolSegnatiInTotale(int golSegnatiInTotale) {
		this.golSegnatiInTotale = golSegnatiInTotale;
	}

	/**
     * Metodo che restituisce i gol fatti non su rigore dal giocatore.
     * @return golFattiNonSuRigore
     */
	public int getGolFattiNonSuRigore() {
		return golFattiNonSuRigore;
	}

	/**
     * Metodo che setta i gol fatti non su rigore dal giocatore.
     * @param int golFattiNonSuRigore.
     */
	public void setGolFattiNonSuRigore(int golFattiNonSuRigore) {
		this.golFattiNonSuRigore = golFattiNonSuRigore;
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
	public void setRigoriSegnati(int rigoriFatti) {
		this.rigoriFatti = rigoriFatti;
	}

	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta i gol segnati in totale dal giocatore.
	 */
	@Override
	public String toString() {
		return "gol Segnati in totale = " + golSegnatiInTotale;
	}
}
