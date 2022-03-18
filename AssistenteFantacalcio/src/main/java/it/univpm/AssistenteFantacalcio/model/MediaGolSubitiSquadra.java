package it.univpm.AssistenteFantacalcio.model;

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
	 * @return the mediaGolSubitiSquadra
	 */
	public double getMediaGolSubitiSquadra() {
		return MediaGolSubitiSquadra;
	}

	/**
	 * @param mediaGolSubitiSquadra the mediaGolSubitiSquadra to set
	 */
	public void setMediaGolSubitiSquadra(double mediaGolSubitiSquadra) {
		MediaGolSubitiSquadra = mediaGolSubitiSquadra;
	}

	/**
	 * @return the partiteGiocateSquadra
	 */
	public int getPartiteGiocateSquadra() {
		return partiteGiocateSquadra;
	}

	/**
	 * @param partiteGiocateSquadra the partiteGiocateSquadra to set
	 */
	public void setPartiteGiocateSquadra(int partiteGiocateSquadra) {
		this.partiteGiocateSquadra = partiteGiocateSquadra;
	}

	/**
	 * @return the golSubitiSquadra
	 */
	public int getGolSubitiSquadra() {
		return golSubitiSquadra;
	}

	/**
	 * @param golSubitiSquadra the golSubitiSquadra to set
	 */
	public void setGolSubitiSquadra(int golSubitiSquadra) {
		this.golSubitiSquadra = golSubitiSquadra;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media gol subiti della squdra.
	 */
	@Override
	public String toString() {
		return "media gol subiti squadra = " + MediaGolSubitiSquadra;
	}

}
