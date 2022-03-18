package it.univpm.AssistenteFantacalcio.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import org.json.simple.parser.ParseException;

import it.univpm.AssistenteFantacalcio.model.Giocatore;
import it.univpm.AssistenteFantacalcio.model.Squadra;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

public interface FormazioneService {
	public abstract void aggiungiGiocatore(Giocatore giocatore) throws IOException, ParseException ;
	public abstract void aggiungiSquadra(Squadra squadra) throws IOException, ParseException ;
	public abstract void deleteGiocatore(String Nome);
	public abstract void deleteSquadra(String NomeSquadra);
	public abstract Collection<Giocatore> getGiocatori();
	public abstract Collection<Giocatore> getDatabase();
	public abstract Collection<Squadra> getSquadre();
}