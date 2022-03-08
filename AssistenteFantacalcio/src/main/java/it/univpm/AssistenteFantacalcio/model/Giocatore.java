package it.univpm.AssistenteFantacalcio.model;

public class Giocatore {
	private int id;
	private char ruolo;
	private String cognome;
	private String squadra;
	private int partiteGiocate;
	private double mediaVoto;
	private double mediaFantavoto;
	private int golFatti;
	private int golSubiti;
	private int rigoriParati;
	private int rigoriCalciati;
	private int rigoriSegnati;
	private int rigoriSbagliati;
	private int assist;
	private int ammonizioni;
	private int espulsioni;
	private int autogol;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getRuolo() {
		return ruolo;
	}
	public void setRuolo(char ruolo) {
		this.ruolo = ruolo;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getSquadra() {
		return squadra;
	}
	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}
	public int getPartiteGiocate() {
		return partiteGiocate;
	}
	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}
	public double getMediaVoto() {
		return mediaVoto;
	}
	public void setMediaVoto(double mediaVoto) {
		this.mediaVoto = mediaVoto;
	}
	public double getMediaFantavoto() {
		return mediaFantavoto;
	}
	public void setMediaFantavoto(double mediaFantavoto) {
		this.mediaFantavoto = mediaFantavoto;
	}
	public int getGolFatti() {
		return golFatti;
	}
	public void setGolFatti(int golFatti) {
		this.golFatti = golFatti;
	}
	public int getGolSubiti() {
		return golSubiti;
	}
	public void setGolSubiti(int golSubiti) {
		this.golSubiti = golSubiti;
	}
	public int getRigoriParati() {
		return rigoriParati;
	}
	public void setRigoriParati(int rigoriParati) {
		this.rigoriParati = rigoriParati;
	}
	public int getRigoriCalciati() {
		return rigoriCalciati;
	}
	public void setRigoriCalciati(int rigoriCalciati) {
		this.rigoriCalciati = rigoriCalciati;
	}
	public int getRigoriSegnati() {
		return rigoriSegnati;
	}
	public void setRigoriSegnati(int rigoriSegnati) {
		this.rigoriSegnati = rigoriSegnati;
	}
	public int getRigoriSbagliati() {
		return rigoriSbagliati;
	}
	public void setRigoriSbagliati(int rigoriSbagliati) {
		this.rigoriSbagliati = rigoriSbagliati;
	}
	public int getAssist() {
		return assist;
	}
	public void setAssist(int assist) {
		this.assist = assist;
	}
	public int getAmmonizioni() {
		return ammonizioni;
	}
	public void setAmmonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}
	public int getEspulsioni() {
		return espulsioni;
	}
	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}
	public int getAutogol() {
		return autogol;
	}
	public void setAutogol(int autogol) {
		this.autogol = autogol;
	}
}
