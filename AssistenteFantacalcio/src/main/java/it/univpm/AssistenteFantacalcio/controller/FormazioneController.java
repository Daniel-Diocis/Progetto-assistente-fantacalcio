package it.univpm.AssistenteFantacalcio.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.AssistenteFantacalcio.model.Giocatore;
import it.univpm.AssistenteFantacalcio.model.Squadra;
import it.univpm.AssistenteFantacalcio.service.FormazioneService;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

@RestController
public class FormazioneController {
	@Autowired
	FormazioneService formazioneService;
	
	@RequestMapping(value = "/database", method = RequestMethod.GET)
	public ResponseEntity<Object> getDatabase() {
		return new ResponseEntity<>(formazioneService.getDatabase(), HttpStatus.OK);
	}
	@RequestMapping(value = "/giocatori", method = RequestMethod.GET)
	public ResponseEntity<Object> getGiocatori() {
		return new ResponseEntity<>(formazioneService.getGiocatori(), HttpStatus.OK);
	}
	@RequestMapping(value = "/squadre", method = RequestMethod.GET)
	public ResponseEntity<Object> getSquadre() {
		return new ResponseEntity<>(formazioneService.getSquadre(), HttpStatus.OK);
	}
	@RequestMapping(value = "/giocatori/{Nome}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable ("Nome") String Nome) throws IOException, ParseException{
		formazioneService.deleteGiocatore(Nome);
		return new ResponseEntity<>("Player is deleted succesfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/squadre/{NomeSquadra}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete1(@PathVariable ("NomeSquadra") String NomeSquadra) throws IOException, ParseException {
		formazioneService.deleteSquadra(NomeSquadra);
		return new ResponseEntity<>("Team is deleted succesfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/giocatori", method = RequestMethod.POST)
	public ResponseEntity<Object> createGiocatore(@RequestBody Giocatore giocatore) throws IOException, ParseException {
		formazioneService.aggiungiGiocatore(giocatore);
		return new ResponseEntity<>("Player is created succesfully", HttpStatus.CREATED);
	}
	@RequestMapping(value = "/squadre", method = RequestMethod.POST)
	public ResponseEntity<Object> createSquadra(@RequestBody Squadra squadra) throws IOException, ParseException {
		formazioneService.aggiungiSquadra(squadra);
		return new ResponseEntity<>("Team is created succesfully", HttpStatus.CREATED);
	}
}