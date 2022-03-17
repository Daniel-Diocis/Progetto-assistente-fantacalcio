package it.univpm.AssistenteFantacalcio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

@Controller
public class AssistenteFantacalcioController {
	
	@RequestMapping("/assistente")
	public @ResponseBody String assistente() {
		return ("Ciao utente,questo è il menù della nostra applicazione."+ ((char) 10) + "Hai bisogno dell'aiuto del Fanta-Assistente vedo, cosa vuoi fare? " + ((char) 10) + "Scegli cosa puoi fare tra queste scelte: " + ((char) 10) + "a) Scrivi /giocatori per inserire la tua formazione" + ((char) 10) + "b) Scrivi /database per avere il database di tutti i giocatori della serie A");			
	}

}
