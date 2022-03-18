package it.univpm.AssistenteFantacalcio.model;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

public class MediaGolSubitiSquadra {

	private double MediaGolSubitiSquadra;
	private int partiteGiocateSquadra;
	private int golSubitiSquadra;
	
	/** Costruttore dell'oggetto.
     * @param partiteGiocateSquadra: rappresenta le partite giocate dalla squadra
     * @param golSubitiSquadra: rappresenta i golSubitiSquadra
     */
	public MediaGolSubitiSquadra(int partiteGiocateSquadra, int golSubitiSquadra) {
		this.partiteGiocateSquadra = partiteGiocateSquadra;
		this.golSubitiSquadra = golSubitiSquadra;
		this.MediaGolSubitiSquadra = (double) golSubitiSquadra / partiteGiocateSquadra;
	}
	/**
	 * Metodo che restituisce la media dei gol subiti dalla squadra.
	 * @return mediaGolSubitiSquadra
	 */
	public double getMediaGolSubitiSquadra() {
		return MediaGolSubitiSquadra;
	}

	/**
	 * Metodo che setta i gol subiti dalla squadra.
	 * @param double mediaGolSubitiSquadra
	 */
	public void setMediaGolSubitiSquadra(double mediaGolSubitiSquadra) {
		MediaGolSubitiSquadra = mediaGolSubitiSquadra;
	}

	/**
	 * Metodo che restituisce le partite giocate dalla squadra.
	 * @return partiteGiocateSquadra
	 */
	public int getPartiteGiocateSquadra() {
		return partiteGiocateSquadra;
	}

	/**
	 * Metodo che setta le partite giocate dalla squadra
	 * @param int partiteGiocateSquadra
	 */
	public void setPartiteGiocateSquadra(int partiteGiocateSquadra) {
		this.partiteGiocateSquadra = partiteGiocateSquadra;
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
	 * @param int golSubitiSquadra
	 */
	public void setGolSubitiSquadra(int golSubitiSquadra) {
		this.golSubitiSquadra = golSubitiSquadra;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media dei gol subiti della squdra.
	 */
	@Override
	public String toString() {
		return "media gol subiti squadra = " + MediaGolSubitiSquadra;
	}

}
