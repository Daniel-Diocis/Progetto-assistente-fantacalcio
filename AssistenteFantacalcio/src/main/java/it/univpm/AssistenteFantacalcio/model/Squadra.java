package it.univpm.AssistenteFantacalcio.model;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

public class Squadra {

	private String nomeSquadra;
	private int posizione;
	private int puntiSquadra;
	private String qualificazioneAttuale;
	private int partiteGiocateSquadra;
	private int partiteVinte;
	private int partitePareggiate;
	private int partitePerse;
	private int golSegnatiSquadra;
	private int golSubitiSquadra;
	private DifferenzaReti differenzaReti;
	private MediaGolSegnatiSquadra mediaGolSegnatiSquadra;
	private MediaGolSubitiSquadra mediaGolSubitiSquadra;
	
	public Squadra() {
		super();
	}
	
	public Squadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
		this.posizione = 0;
		this.puntiSquadra = 0;
		this.qualificazioneAttuale = null;
		this.partiteGiocateSquadra = 0;
		this.partiteVinte = 0;
		this.partitePareggiate = 0;
		this.partitePerse = 0;
		this.golSegnatiSquadra = 0;
		this.golSubitiSquadra = 0;
		this.differenzaReti = null;
		this.mediaGolSegnatiSquadra = null;
		this.mediaGolSubitiSquadra = null;
	}
	
	public Squadra(String nomeSquadra, int posizione, int puntiSquadra, String qualificazioneAttuale,
			int partiteGiocateSquadra, int partiteVinte, int partitePareggiate, int partitePerse, int golSegnatiSquadra,
			int golSubitiSquadra, DifferenzaReti differenzaReti, MediaGolSegnatiSquadra mediaGolSegnatiSquadra,
			MediaGolSubitiSquadra mediaGolSubitiSquadra) {
		super();
		this.nomeSquadra = nomeSquadra;
		this.posizione = posizione;
		this.puntiSquadra = puntiSquadra;
		this.qualificazioneAttuale = qualificazioneAttuale;
		this.partiteGiocateSquadra = partiteGiocateSquadra;
		this.partiteVinte = partiteVinte;
		this.partitePareggiate = partitePareggiate;
		this.partitePerse = partitePerse;
		this.golSegnatiSquadra = golSegnatiSquadra;
		this.golSubitiSquadra = golSubitiSquadra;
		this.differenzaReti = differenzaReti;
		this.mediaGolSegnatiSquadra = mediaGolSegnatiSquadra;
		this.mediaGolSubitiSquadra = mediaGolSubitiSquadra;
	}
	/**
	 * Metodo che restituisce il nome della squadra.
	 * @return nomeSquadra
	 */
	public String getNomeSquadra() {
		return nomeSquadra;
	}

	/**
	 * Metodo che setta il nome della squadra.
	 * @param String nomeSquadra
	 */
	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	/**
	 * Metodo che restituisce la posizione in campionato della squadra.
	 * @return posizione
	 */
	public int getPosizione() {
		return posizione;
	}

	/**
	 * Metodo che setta la posizione in classifica della squadra.
	 * @param int posizione
	 */
	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	/**
	 * Metodo che restituisce i punti totali della squadra.
	 * @return puntiSquadra
	 */
	public int getPuntiSquadra() {
		return puntiSquadra;
	}

	/**
	 * Metodo che setta i punti totali della squadra.
	 * @param int puntiSquadra
	 */
	public void setPuntiSquadra(int puntiSquadra) {
		this.puntiSquadra = puntiSquadra;
	}

	/**
	 * Metodo che restituisce la qualificazione attuale della squadra.
	 * @return qualificazioneAttuale
	 */
	public String getQualificazioneAttuale() {
		return qualificazioneAttuale;
	}

	/**
	 * Metodo che setta la qualificazione attuale della squadra.
	 * @param String qualificazioneAttuale
	 */
	public void setQualificazioneAttuale(String qualificazioneAttuale) {
		this.qualificazioneAttuale = qualificazioneAttuale;
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
	 * Metodo che restituisce le partite vinte dalla squadra.
	 * @return partiteVinte
	 */
	public int getPartiteVinte() {
		return partiteVinte;
	}

	/**
	 * Metodo che setta le partite vinte dalla squadra.
	 * @param int partiteVinte
	 */
	public void setPartiteVinte(int partiteVinte) {
		this.partiteVinte = partiteVinte;
	}

	/**
	 * Metodo che restituisce le partite pareggiate dalla squadra.
	 * @return partitePareggiate
	 */
	public int getPartitePareggiate() {
		return partitePareggiate;
	}

	/**
	 * Metodo che setta le partite pareggiate dalla squadra.
	 * @param int partitePareggiate
	 */
	public void setPartitePareggiate(int partitePareggiate) {
		this.partitePareggiate = partitePareggiate;
	}

	/**
	 * Metodo che restituisce le partite perse dalla squadra.
	 * @return partitePerse
	 */
	public int getPartitePerse() {
		return partitePerse;
	}

	/**
	 * Metodo che setta le partite perse dalla squadra.
	 * @param int partitePerse
	 */
	public void setPartitePerse(int partitePerse) {
		this.partitePerse = partitePerse;
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
	 * Metodo che restituisce i gol subiti dalla squadra.
	 * @return the golSubitiSquadra
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
	 * Metodo che restituisce la differenza reti della squadra.
	 * @return differenzaReti
	 */
	public DifferenzaReti getDifferenzaReti() {
		return differenzaReti;
	}

	/**
	 * Metodo che setta la differenza reti della squadra.
	 * @param DifferenzaReti differenzaReti
	 */
	public void setDifferenzaReti(DifferenzaReti differenzaReti) {
		this.differenzaReti = differenzaReti;
	}

	/**
	 * Metodo che restituisce la media dei gol segnati dalla squadra.
	 * @return mediaGolSegnatiSquadra
	 */
	public MediaGolSegnatiSquadra getMediaGolSegnatiSquadra() {
		return mediaGolSegnatiSquadra;
	}

	/**
	 * Metodo che setta la media dei gol segnati dalla squadra.
	 * @param MediagolSegnatiSquadra mediaGolSegnatiSquadra
	 */
	public void setMediaGolSegnatiSquadra(MediaGolSegnatiSquadra mediaGolSegnatiSquadra) {
		this.mediaGolSegnatiSquadra = mediaGolSegnatiSquadra;
	}

	/**
	 * Metodo che restituisce la media dei gol subiti dalla squadra.
	 * @return mediaGolSubitiSquadra
	 */
	public MediaGolSubitiSquadra getMediaGolSubitiSquadra() {
		return mediaGolSubitiSquadra;
	}

	/**
	 * Metodo che setta la media dei gol subiti dalla squadra.
	 * @param MediaGolSubitiSquadra mediaGolSubitiSquadra
	 */
	public void setMediaGolSubitiSquadra(MediaGolSubitiSquadra mediaGolSubitiSquadra) {
		this.mediaGolSubitiSquadra = mediaGolSubitiSquadra;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media gol subiti della squadra.
	 */
	@Override
	public String toString() {
		return "NomeSquadra = " + nomeSquadra + ", posizione = " + posizione + ",puntiSquadra = " + puntiSquadra
		+ ", qualificazioneAttuale= " + qualificazioneAttuale + ", partiteGiocateSquadra= "+ partiteGiocateSquadra + ", partiteVinte= " + partiteVinte
		+ ", partitePareggiate= " + partitePareggiate + ", partitePerse= " + partitePerse + ", golSegnatiSquadra= " + golSegnatiSquadra + ", golSubitiSquadra= " + golSubitiSquadra
		+ ", differenzaReti= " + differenzaReti + ", mediaGolSegnatiSquadra= " + mediaGolSegnatiSquadra + ", mediaGolSubitiSquadra= " + mediaGolSubitiSquadra + " ";
	}
	
}
