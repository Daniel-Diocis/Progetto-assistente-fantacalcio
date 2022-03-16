package it.univpm.AssistenteFantacalcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.AssistenteFantacalcio.model.Giocatore;
import it.univpm.AssistenteFantacalcio.service.FormazioneService;

@RestController
public class FormazioneController {
	@Autowired
	FormazioneService formazioneService;
	
	@RequestMapping(value = "/giocatori", method = RequestMethod.GET)
	public ResponseEntity<Object> getGiocatore() {
		return new ResponseEntity<>(formazioneService.getGiocatori(), HttpStatus.OK);
	}
/*	@RequestMapping(value= "/giocatori/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object>
		updateProduct(@PathVariable("id") int id, @RequestBody Giocatore giocatore) {
		
		formazioneService.updateGiocatore(id, giocatore);
		return new ResponseEntity<>("Player is updated succesfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/giocatori/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable("id") Integer id) {
		formazioneService.deleteGiocatore(id);
		return new ResponseEntity<>("Player is deleted succesfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/giocatori", method = RequestMethod.POST)
	public ResponseEntity<Object> createGiocatore(@RequestBody Giocatore giocatore) {
		formazioneService.createGiocatore(giocatore);
		return new ResponseEntity<>("Player is created succesfully", HttpStatus.CREATED);
	}*/
}