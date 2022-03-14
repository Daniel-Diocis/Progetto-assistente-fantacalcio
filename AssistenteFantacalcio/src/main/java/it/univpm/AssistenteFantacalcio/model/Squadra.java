package it.univpm.AssistenteFantacalcio.model;

public class Squadra {
	private String nomeSquadra;
	private int partiteGiocate;
	private int golSegnatiSquadra;
	private int golSubitiSquadra;
	private double mediaGolSegnatiSquadra;
	private double mediaGolSubitiSquadra;
	
	public Squadra() {
		super();
	}
	
	public Squadra(String nomeSquadra) {
		this.nomeSquadra= nomeSquadra;
		this.partiteGiocate=0;
		this.golSegnatiSquadra=0;
		this.golSubitiSquadra=0;
		this.mediaGolSegnatiSquadra=0;
		this.mediaGolSubitiSquadra=0;
	}
	
	public String getNomeSquadra() {
		return nomeSquadra;
	}
	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}
	public int getPartiteGiocate() {
		return partiteGiocate;
	}
	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
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
	public double getMediaGolSegnatiSquadra() {
		return mediaGolSegnatiSquadra;
	}
	public void setMediaGolSegnatiSquadra(double mediaGolSegnatiSquadra) {
		this.mediaGolSegnatiSquadra = mediaGolSegnatiSquadra;
	}
	public double getMediaGolSubitiSquadra() {
		return mediaGolSubitiSquadra;
	}
	public void setMediaGolSubitiSquadra(double mediaGolSubitiSquadra) {
		this.mediaGolSubitiSquadra = mediaGolSubitiSquadra;
	}
}
