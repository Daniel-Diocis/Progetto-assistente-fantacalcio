package it.univpm.AssistenteFantacalcio.service;

import java.util.Collection;

import it.univpm.AssistenteFantacalcio.model.Giocatore;

public interface FormazioneService {
/*	public abstract void createGiocatore(Giocatore giocatore);
	public abstract void updateGiocatore(int id, Giocatore giocatore);
	public abstract void deleteGiocatore(int id);*/
	public abstract Collection<Giocatore> getGiocatori();
}