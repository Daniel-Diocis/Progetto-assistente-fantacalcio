package it.univpm.AssistenteFantacalcio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AssistenteFantacalcioController {
	
	@RequestMapping("/assistente")
	public @ResponseBody String assistente() {
		return "Ciao utente, scrivi /giocatori per inserire la tua formazione";
	}

}
