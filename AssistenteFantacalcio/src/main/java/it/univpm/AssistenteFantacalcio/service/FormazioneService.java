package it.univpm.AssistenteFantacalcio.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import org.json.simple.parser.ParseException;

import it.univpm.AssistenteFantacalcio.model.Giocatore;

public interface FormazioneService {
	public abstract void aggiungiGiocatore(Giocatore giocatore) throws IOException, ParseException ;
/*	public abstract void updateGiocatore(int id, Giocatore giocatore);*/
	public abstract void deleteGiocatore(String Nome);
	public abstract Collection<Giocatore> getGiocatori();
	public abstract Collection<Giocatore> getDatabase();
}