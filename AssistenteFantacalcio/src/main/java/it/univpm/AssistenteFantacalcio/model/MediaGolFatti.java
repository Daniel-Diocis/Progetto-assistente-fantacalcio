package it.univpm.AssistenteFantacalcio.model;

public class MediaGolFatti {

	private double mediaGolFatti;
	private int partiteGiocate;
	private int golFattiNonSuRigore;
	private int rigoriFatti;
	
	public MediaGolFatti(int partiteGiocate, int golFattiNonSuRigore, int rigoriFatti) {
		this.partiteGiocate = partiteGiocate;
		this.golFattiNonSuRigore = golFattiNonSuRigore;
		this.rigoriFatti = rigoriFatti;
		this.mediaGolFatti = (double) (golFattiNonSuRigore+rigoriFatti) / partiteGiocate;
	}
	
	public double getMediaGolFatti() {
		return mediaGolFatti;
	}

	public void setMediaGolFatti(double mediaGolFatti) {
		this.mediaGolFatti = mediaGolFatti;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public int getgolFattiNonSuRigore() {
		return golFattiNonSuRigore;
	}

	public void setgolFatti(int golFattiNonSuRigore) {
		this.golFattiNonSuRigore = golFattiNonSuRigore;
	}
	
	public int getRigoriFatti() {
		return rigoriFatti;
	}

	public void setRigoriFatti(int rigoriFatti) {
		this.rigoriFatti = rigoriFatti;
	}
	
	@Override
	public String toString() {
		return "media gol fatti = " + mediaGolFatti;
	}

}
