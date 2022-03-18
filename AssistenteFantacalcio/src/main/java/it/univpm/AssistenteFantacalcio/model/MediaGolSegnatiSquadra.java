package it.univpm.AssistenteFantacalcio.model;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

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
	 * Metodo che restituisce la media dei gol segnati dalla squadra.
	 * @return MediaGolSegnatiSquadra
	 */
	public double getMediaGolSegnatiSquadra() {
		return MediaGolSegnatiSquadra;
	}

	/**
	 * Metodo che setta la media dei gol segnati dalla squadra
	 * @param double MediaGolSegnatiSquadra
	 */
	public void setMediaGolSegnatiSquadra(double MediaGolSegnatiSquadra) {
		this.MediaGolSegnatiSquadra = MediaGolSegnatiSquadra;
	}

	/**
	 * Metodo che restituisce le partite giocate dalla squadra.
	 * @return partiteGiocateSquadra
	 */
	public int getPartiteGiocateSquadra() {
		return partiteGiocateSquadra;
	}

	/**
	 * Metodo che setta le partite giocate dalla squadra.
	 * @param int partiteGiocateSquadra
	 */
	public void setPartiteGiocateSquadra(int partiteGiocateSquadra) {
		this.partiteGiocateSquadra = partiteGiocateSquadra;
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
	 * @param int golSegnatiSquadra
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
