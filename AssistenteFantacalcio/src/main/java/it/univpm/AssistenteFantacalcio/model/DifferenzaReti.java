package it.univpm.AssistenteFantacalcio.model;

public class DifferenzaReti {

	private int differenzaReti;
	private int golSegnatiSquadra;
	private int golSubitiSquadra;
	
	/** Costruttore dell'oggetto.
     * @param 
     */
	public DifferenzaReti(int golSegnatiSquadra, int golSubitiSquadra) {
		this.golSegnatiSquadra = golSegnatiSquadra;
		this.golSubitiSquadra = golSubitiSquadra;
		this.differenzaReti = golSegnatiSquadra - golSubitiSquadra;
	}
	
	public int getDifferenzaReti() {
		return differenzaReti;
	}

	public void setDifferenzaReti(int differenzaReti) {
		this.differenzaReti = differenzaReti;
	}

	public int getGolSegnatiSquadra() {
		return golSegnatiSquadra;
	}

	public void setGolSegnatiSquadra(int golSegnatiSquadra) {
		this.golSegnatiSquadra = golSegnatiSquadra;
	}

	public int getGolSubitiSquadra() {
		return golSubitiSquadra;
	}

	public void setGolSubitiSquadra(int golSubitiSquadra) {
		this.golSubitiSquadra = golSubitiSquadra;
	}

	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta la differenza reti.
	 */
	@Override
	public String toString() {
		return "differenzaReti = " + differenzaReti;
	}
}
