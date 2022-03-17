package it.univpm.AssistenteFantacalcio.model;

public class MediaGolFatti {

	private double mediaGolFatti;
	private int partiteGiocate;
	private int golFattiNonSuRigore;
	private int rigoriFatti;
	
	/** Costruttore dell'oggetto.
     * @param partiteGiocate: rappresenta le partite giocate dal giocatore
     * @param golFattiNonSuRigore: rappresenta i gol fatti non su rigore dal giocatore
     * @param rigoriFatti: rappresenta i rigori segnati dal giocatore
     */
	public MediaGolFatti(int partiteGiocate, int golFattiNonSuRigore, int rigoriFatti) {
		this.partiteGiocate = partiteGiocate;
		this.golFattiNonSuRigore = golFattiNonSuRigore;
		this.rigoriFatti = rigoriFatti;
		this.mediaGolFatti = (double) (golFattiNonSuRigore+rigoriFatti) / partiteGiocate;
	}
	
	/**
     * Metodo che restituisce la media gol del giocatore.
     * @return mediaGolFatti
     */
	public double getMediaGolFatti() {
		return mediaGolFatti;
	}

	/**
     * Metodo che setta la media gol del giocatore.
     * @param double mediaGolFatti.
     */
	public void setMediaGolFatti(double mediaGolFatti) {
		this.mediaGolFatti = mediaGolFatti;
	}

	/**
     * Metodo che restituisce le partite giocate dal giocatore.
     * @return partiteGiocate
     */
	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	/**
     * Metodo che setta le partite giocate dal giocatore.
     * @param int partiteGiocate.
     */
	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
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
	public void setgolFatti(int golFattiNonSuRigore) {
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
	public void setRigoriFatti(int rigoriFatti) {
		this.rigoriFatti = rigoriFatti;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media gol del giocatore.
	 */
	@Override
	public String toString() {
		return "media gol fatti = " + mediaGolFatti;
	}

}
