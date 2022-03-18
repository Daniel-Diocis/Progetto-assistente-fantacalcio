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
	 * @return the nomeSquadra
	 */
	public String getNomeSquadra() {
		return nomeSquadra;
	}

	/**
	 * @param nomeSquadra the nomeSquadra to set
	 */
	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	/**
	 * @return the posizione
	 */
	public int getPosizione() {
		return posizione;
	}

	/**
	 * @param posizione the posizione to set
	 */
	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	/**
	 * @return the puntiSquadra
	 */
	public int getPuntiSquadra() {
		return puntiSquadra;
	}

	/**
	 * @param puntiSquadra the puntiSquadra to set
	 */
	public void setPuntiSquadra(int puntiSquadra) {
		this.puntiSquadra = puntiSquadra;
	}

	/**
	 * @return the qualificazioneAttuale
	 */
	public String getQualificazioneAttuale() {
		return qualificazioneAttuale;
	}

	/**
	 * @param qualificazioneAttuale the qualificazioneAttuale to set
	 */
	public void setQualificazioneAttuale(String qualificazioneAttuale) {
		this.qualificazioneAttuale = qualificazioneAttuale;
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
	 * @return the partiteVinte
	 */
	public int getPartiteVinte() {
		return partiteVinte;
	}

	/**
	 * @param partiteVinte the partiteVinte to set
	 */
	public void setPartiteVinte(int partiteVinte) {
		this.partiteVinte = partiteVinte;
	}

	/**
	 * @return the partitePareggiate
	 */
	public int getPartitePareggiate() {
		return partitePareggiate;
	}

	/**
	 * @param partitePareggiate the partitePareggiate to set
	 */
	public void setPartitePareggiate(int partitePareggiate) {
		this.partitePareggiate = partitePareggiate;
	}

	/**
	 * @return the partitePerse
	 */
	public int getPartitePerse() {
		return partitePerse;
	}

	/**
	 * @param partitePerse the partitePerse to set
	 */
	public void setPartitePerse(int partitePerse) {
		this.partitePerse = partitePerse;
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
	 * @return the differenzaReti
	 */
	public DifferenzaReti getDifferenzaReti() {
		return differenzaReti;
	}

	/**
	 * @param differenzaReti the differenzaReti to set
	 */
	public void setDifferenzaReti(DifferenzaReti differenzaReti) {
		this.differenzaReti = differenzaReti;
	}

	/**
	 * @return the mediaGolSegnatiSquadra
	 */
	public MediaGolSegnatiSquadra getMediaGolSegnatiSquadra() {
		return mediaGolSegnatiSquadra;
	}

	/**
	 * @param mediaGolSegnatiSquadra the mediaGolSegnatiSquadra to set
	 */
	public void setMediaGolSegnatiSquadra(MediaGolSegnatiSquadra mediaGolSegnatiSquadra) {
		this.mediaGolSegnatiSquadra = mediaGolSegnatiSquadra;
	}

	/**
	 * @return the mediaGolSubitiSquadra
	 */
	public MediaGolSubitiSquadra getMediaGolSubitiSquadra() {
		return mediaGolSubitiSquadra;
	}

	/**
	 * @param mediaGolSubitiSquadra the mediaGolSubitiSquadra to set
	 */
	public void setMediaGolSubitiSquadra(MediaGolSubitiSquadra mediaGolSubitiSquadra) {
		this.mediaGolSubitiSquadra = mediaGolSubitiSquadra;
	}
	
	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la media gol subiti della squdra.
	 */
	@Override
	public String toString() {
		return "NomeSquadra = " + nomeSquadra + ", posizione = " + posizione + ",puntiSquadra = " + puntiSquadra
		+ ", qualificazioneAttuale= " + qualificazioneAttuale + ", partiteGiocateSquadra= "+ partiteGiocateSquadra + ", partiteVinte= " + partiteVinte
		+ ", partitePareggiate= " + partitePareggiate + ", partitePerse= " + partitePerse + ", golSegnatiSquadra= " + golSegnatiSquadra + ", golSubitiSquadra= " + golSubitiSquadra
		+ ", differenzaReti= " + differenzaReti + ", mediaGolSegnatiSquadra= " + mediaGolSegnatiSquadra + ", mediaGolSubitiSquadra= " + mediaGolSubitiSquadra + " ";
	}
	
}
