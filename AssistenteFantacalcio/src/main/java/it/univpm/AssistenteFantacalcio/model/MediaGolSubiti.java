package it.univpm.AssistenteFantacalcio.model;

public class MediaGolSubiti {

	private double mediaGolSubiti;
	private int partiteGiocate;
	private int golSubiti;
	
	public MediaGolSubiti(int partiteGiocate, int golSubiti) {
		this.partiteGiocate = partiteGiocate;
		this.golSubiti = golSubiti;
		this.mediaGolSubiti = (double) golSubiti / partiteGiocate;
	}
	
	public double getMediaGolSubiti() {
		return mediaGolSubiti;
	}

	public void setMediaGolSubiti(double mediaGolSubiti) {
		this.mediaGolSubiti = mediaGolSubiti;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public int getGolSubiti() {
		return golSubiti;
	}

	public void setGolSubiti(int golSubiti) {
		this.golSubiti = golSubiti;
	}
	
	@Override
	public String toString() {
		return "media gol subiti = " + mediaGolSubiti;
	}
	
}
