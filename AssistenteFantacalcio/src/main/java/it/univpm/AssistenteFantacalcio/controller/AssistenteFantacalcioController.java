package it.univpm.AssistenteFantacalcio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AssistenteFantacalcioController {
	
	@RequestMapping("/assistente")
	public @ResponseBody String assistente() {
		return "Ciao utente,questo è il menù della nostra applicazione." + \n + "Hai bisgno dell'aiuto del Fanta-Assistente vedo, cosa vuoi fare? " + \n + " Scegli cosa puoi fare tra queste scelte: " + \n + "scrivi /giocatori per inserire la tua formazione" + \n + "scrivi /database per avere il database di tutti i giocatori della serie A";			
	}

}
