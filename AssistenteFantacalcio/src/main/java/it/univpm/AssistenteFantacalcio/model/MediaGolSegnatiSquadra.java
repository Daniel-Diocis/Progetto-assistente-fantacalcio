package it.univpm.AssistenteFantacalcio.model;

public class MediaGolSegnatiSquadra {

	private double MediaGolSegnatiSquadra;
	private int partiteGiocateSquadra;
	private int golSegnatiSquadra;
	
	/** Costruttore dell'oggetto.
     * @param partiteGiocateSquadra: rappresenta le partite giocate dalla squadra
     * @param golSegnatiSquadra: rappresenta i golSegnatiSquadra
     * @param rigoriFatti: rappresenta i rigori segnati dal giocatore
     */
	public MediaGolSegnatiSquadra(int partiteGiocateSquadra, int golSegnatiSquadra) {
		this.partiteGiocateSquadra = partiteGiocateSquadra;
		this.golSegnatiSquadra = golSegnatiSquadra;
		this.MediaGolSegnatiSquadra = (double) golSegnatiSquadra / partiteGiocateSquadra;
	}
	
	/**
	 * @return the MediaGolSegnatiSquadra
	 */
	public double getMediaGolSegnatiSquadra() {
		return MediaGolSegnatiSquadra;
	}

	/**
	 * @param MediaGolSegnatiSquadra the MediaGolSegnatiSquadra to set
	 */
	public void setMediaGolSegnatiSquadra(double MediaGolSegnatiSquadra) {
		this.MediaGolSegnatiSquadra = MediaGolSegnatiSquadra;
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
	 * @return the golSegnatiSquadra
	 */
	public int getGolSegnatiSquadra() {
		return golSegnatiSquadra;
	}

	/**
	 * @param golSegnatiSquadra the golSegnatiSquadra to set
	 */
	public void setGolSegnatiSquadra(int golSegnatiSquadra) {
		this.golSegnatiSquadra = golSegnatiSquadra;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media gol segnati della squdra.
	 */
	@Override
	public String toString() {
		return "media gol segnati squadra = " + MediaGolSegnatiSquadra;
	}
}
