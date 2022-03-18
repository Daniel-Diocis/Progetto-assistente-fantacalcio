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
		return ("Ciao utente,questo è il menù della nostra applicazione." + ((char) 10) + 
	"Hai bisogno dell'aiuto del Fanta-Assistente vedo, cosa vuoi fare? " + ((char) 10) + 
	"Scegli cosa puoi fare tra queste scelte: " + ((char) 10) + 
	"a) Scrivi /giocatori per inserire e modificare la tua formazione:"+ ((char) 10) +
	"con il comando POST puoi inserire il giocatore rispettando i seguenti caratteri (esempio: {"+((char) 34)+"nome"+((char) 34)+": "+((char) 34)+"VLAHOVIC"+((char) 34)+"}" + ((char) 10) +
	"con il comando GET avrai la lista dei giocatori da te inseriti con rispettivi dati e statistiche" + ((char) 10) +
	"con il comando DELETE potrai cancellare il giocatore che vuoi dalla lista scrivendo dopo /giocatori il nome del giocatore che si desidera cancellare (esempio http://localhost:8090/giocatori/BERARDI" + ((char) 10) +
	"b) Scrivi /database e con il comando GET avrai il database di tutti i giocatori della serie A") + ((char) 10) + 
	"c) Scrivi /squadre per inserire il nome di una o più squadre delle quali vuoi informazioni: "+ ((char) 10) +
	"con il comando POST puoi inserire la squadra rispettando i seguenti caratteri (esempio: {"+((char) 34)+"nomeSquadra"+((char) 34)+": "+((char) 34)+"Juventus"+((char) 34)+"}" + ((char) 10) +
	"con il comando GET avrai la lista delle squadra da te inserite e le loro statistiche" + ((char) 10) +
	"con il comando DELETE potrai cancellare la squadra che vuoi dalla lista scrivendo dopo /squadre il nome della squadra che si desidera cancellare (esempio http://localhost:8090/squadre/Roma";		
	}

}
