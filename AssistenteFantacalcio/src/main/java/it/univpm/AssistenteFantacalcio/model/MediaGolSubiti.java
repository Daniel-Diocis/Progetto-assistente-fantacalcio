package it.univpm.AssistenteFantacalcio.model;

public class MediaGolSubiti {

	private double mediaGolSubiti;
	private int partiteGiocate;
	private int golSubiti;
	
	/** Costruttore dell'oggetto.
     * @param partiteGiocate: rappresenta le partite giocate dal giocatore
     * @param golSubiti: rappresenta i gol subiti dal giocatore (portiere)
     */
	public MediaGolSubiti(int partiteGiocate, int golSubiti) {
		this.partiteGiocate = partiteGiocate;
		this.golSubiti = golSubiti;
		this.mediaGolSubiti = (double) golSubiti / partiteGiocate;
	}
	
	/**
     * Metodo che restituisce la media gol subiti del giocatore (portiere).
     * @return mediaGolSubiti
     */
	public double getMediaGolSubiti() {
		return mediaGolSubiti;
	}

	/**
     * Metodo che setta la media gol subiti del giocatore (portiere).
     * @param double mediaGolSubiti.
     */
	public void setMediaGolSubiti(double mediaGolSubiti) {
		this.mediaGolSubiti = mediaGolSubiti;
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
     * Metodo che restituisce i gol subiti dal giocatore (portiere).
     * @return golSubiti
     */
	public int getGolSubiti() {
		return golSubiti;
	}

	/**
     * Metodo che setta i gol subiti dal giocatore (portiere).
     * @param int golSubiti.
     */
	public void setGolSubiti(int golSubiti) {
		this.golSubiti = golSubiti;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media gol subiti del giocatore (portiere).
	 */
	@Override
	public String toString() {
		return "media gol subiti = " + mediaGolSubiti;
	}
	
}
