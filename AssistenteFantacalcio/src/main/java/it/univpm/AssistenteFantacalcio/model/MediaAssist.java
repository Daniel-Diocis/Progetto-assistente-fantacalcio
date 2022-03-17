package it.univpm.AssistenteFantacalcio.model;

public class MediaAssist {

	private double mediaAssist;
	private int partiteGiocate;
	private int assist;
	
	public MediaAssist(int partiteGiocate, int assist) {
		this.partiteGiocate = partiteGiocate;
		this.assist = assist;
		this.mediaAssist = (double) assist / partiteGiocate;
	}
	
	public double getMediaAssist() {
		return mediaAssist;
	}

	public void setMediaAssist(double mediaAssist) {
		this.mediaAssist = mediaAssist;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}
	
	@Override
	public String toString() {
		return "media assist = " + mediaAssist;
	}

}
