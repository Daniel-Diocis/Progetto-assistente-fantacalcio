package it.univpm.AssistenteFantacalcio.model;

public class MediaAssist {

	private double mediaAssist;
	private int partiteGiocate;
	private int assist;
	
	/** Costruttore dell'oggetto.
     * @param partiteGiocate: rappresenta le partite giocate dal giocatore
     * @param assist: rappresenta gli assist fatti dal giocatore
     */
	public MediaAssist(int partiteGiocate, int assist) {
		this.partiteGiocate = partiteGiocate;
		this.assist = assist;
		this.mediaAssist = (double) assist / partiteGiocate;
	}
	
	/**
     * Metodo che restituisce la media assist del giocatore.
     * @return mediaAssist
     */
	public double getMediaAssist() {
		return mediaAssist;
	}

	/**
     * Metodo che setta la media assist del giocatore.
     * @param double mediaAssist.
     */
	public void setMediaAssist(double mediaAssist) {
		this.mediaAssist = mediaAssist;
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
     * Metodo che restituisce gli assist fatti dal giocatore.
     * @return assist
     */
	public int getAssist() {
		return assist;
	}

	/**
     * Metodo che setta gli assist fatti dal giocatore.
     * @param int assist.
     */
	public void setAssist(int assist) {
		this.assist = assist;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media assist del giocatore.
	 */
	@Override
	public String toString() {
		return "media assist = " + mediaAssist;
	}

}
