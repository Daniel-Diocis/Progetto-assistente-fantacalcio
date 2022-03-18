package it.univpm.AssistenteFantacalcio.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.univpm.AssistenteFantacalcio.exception.InvalidIdException;
import it.univpm.AssistenteFantacalcio.model.DifferenzaReti;
import it.univpm.AssistenteFantacalcio.model.Giocatore;
import it.univpm.AssistenteFantacalcio.model.GolSegnatiInTotale;
import it.univpm.AssistenteFantacalcio.model.MediaAssist;
import it.univpm.AssistenteFantacalcio.model.MediaGolFatti;
import it.univpm.AssistenteFantacalcio.model.MediaGolSegnatiSquadra;
import it.univpm.AssistenteFantacalcio.model.MediaGolSubiti;
import it.univpm.AssistenteFantacalcio.model.MediaGolSubitiSquadra;
import it.univpm.AssistenteFantacalcio.model.Squadra;
import it.univpm.AssistenteFantacalcio.model.Stats;


/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

/**La classe FormazioneServiceImpl contiene l'implementazione dell'interfaccia FormazioneService.
 * Contiene i metodi che vengono utilizzati dal controller.
 */

@Service
public class FormazioneServiceImpl implements FormazioneService {
	private static Map<String, Giocatore> giocatoreRepo = new HashMap<>();
	private static Map<String, Giocatore> databaseRepo = new HashMap<>();
	private static Map<String, Squadra> squadraRepo = new HashMap<>();
	
	public FormazioneServiceImpl() throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonfiles\\giocatori.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject empjsonobj = (JSONObject)obj;
		
		JSONArray array = (JSONArray)empjsonobj.get("statistica");
		for (int i=0; i<array.size(); i++)
		{
			JSONObject giocatoreJson = (JSONObject)array.get(i);
			Giocatore giocatoreTemp = new Giocatore();
			Long l = (Long) giocatoreJson.get("Id");
			try {
				giocatoreTemp.setId(l.intValue());
			} catch (InvalidIdException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			giocatoreTemp.setNome((String) giocatoreJson.get("Nome"));
			giocatoreTemp.setRuolo((String) giocatoreJson.get("R"));
			giocatoreTemp.setSquadra((String) giocatoreJson.get("Squadra"));
			Stats statsTemp = new Stats();
			statsTemp.setpartiteGiocate(((Long) giocatoreJson.get("Pg")).intValue());
			statsTemp.setmediaFantavoto(((Number) giocatoreJson.get("Mf")).doubleValue());
			statsTemp.setgolFattiNonSuRigore(((Long) giocatoreJson.get("Gf")).intValue());
			statsTemp.setgolSubiti(((Long) giocatoreJson.get("Gs")).intValue());
			statsTemp.setRigoriParati(((Long) giocatoreJson.get("Rp")).intValue());
			statsTemp.setRigoriCalciati(((Long) giocatoreJson.get("Rc")).intValue());
			statsTemp.setRigoriFatti(((Long) giocatoreJson.get("R+")).intValue());
			statsTemp.setRigoriSbagliati(((Long) giocatoreJson.get("R-")).intValue());
			GolSegnatiInTotale golSegnatiInTotale = new GolSegnatiInTotale(statsTemp.getgolFattiNonSuRigore(), statsTemp.getRigoriFatti());
			statsTemp.setGolSegnatiInTotale(golSegnatiInTotale);
			MediaGolFatti mediaGolFatti = new MediaGolFatti(statsTemp.getpartiteGiocate(), statsTemp.getgolFattiNonSuRigore(), statsTemp.getRigoriFatti());
			statsTemp.setMediaGolFatti(mediaGolFatti);
			MediaGolSubiti mediaGolSubiti = new MediaGolSubiti(statsTemp.getpartiteGiocate(), statsTemp.getgolSubiti());
			statsTemp.setMediaGolSubiti(mediaGolSubiti);
			statsTemp.setassist(((Long) giocatoreJson.get("Ass")).intValue());
			MediaAssist mediaAssist = new MediaAssist(statsTemp.getpartiteGiocate(), statsTemp.getassist());
			statsTemp.setMediaAssist(mediaAssist);
			statsTemp.setammonizioni(((Long) giocatoreJson.get("Amm")).intValue());
			statsTemp.setespulsioni(((Long) giocatoreJson.get("Esp")).intValue());
			statsTemp.setAutogol(((Long) giocatoreJson.get("Au")).intValue());
			
			giocatoreTemp.setStats(statsTemp);
			databaseRepo.put(giocatoreTemp.getNome(), giocatoreTemp);
			
		}
	}
	
	/**
	 * Questo metodo va a prendere da un file json tutte le statistiche del giocatore il cui nome 
	 * coincide con lo stesso immesso dall'utente utilizzando aggiungiGiocatore
	 * @param il nome del giocatore che si vuole aggiungere.
	 * @param giocatoreRepo: dove si vanno a immettere tutti i dati del giocatore
	 */
	@Override
	public void aggiungiGiocatore(Giocatore giocatore) throws IOException, ParseException {
		if(giocatoreRepo.containsKey(giocatore.getNome())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Giocatore già esistente..");
		}
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonfiles\\giocatori.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject empjsonobj = (JSONObject)obj;
		
		JSONArray array = (JSONArray)empjsonobj.get("statistica");
		for (int i=0; i<array.size(); i++)
		{
			giocatoreRepo.put(giocatore.getNome(), giocatore);
			
			JSONObject giocatoreJson = (JSONObject)array.get(i);
			Giocatore giocatoreSceltoTemp = new Giocatore();
			
			giocatoreSceltoTemp.setNome((String) giocatoreJson.get("Nome"));
			if ((giocatore.getNome()).compareTo(giocatoreSceltoTemp.getNome()) == 0)
			{
				JSONObject giocatore1Json = (JSONObject)array.get(i);
				Giocatore giocatoreTemp = new Giocatore();
				Long l = (Long) giocatore1Json.get("Id");
				try {
					giocatoreTemp.setId(l.intValue());
				} catch (InvalidIdException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				giocatoreTemp.setNome((String) giocatore1Json.get("Nome"));
				giocatoreTemp.setRuolo((String) giocatore1Json.get("R"));
				giocatoreTemp.setSquadra((String) giocatore1Json.get("Squadra"));
				Stats statsTemp = new Stats();
				statsTemp.setpartiteGiocate(((Long) giocatore1Json.get("Pg")).intValue());
				statsTemp.setmediaFantavoto(((Number) giocatore1Json.get("Mf")).doubleValue());
				statsTemp.setgolFattiNonSuRigore(((Long) giocatore1Json.get("Gf")).intValue());
				statsTemp.setgolSubiti(((Long) giocatore1Json.get("Gs")).intValue());
				statsTemp.setRigoriParati(((Long) giocatore1Json.get("Rp")).intValue());
				statsTemp.setRigoriCalciati(((Long) giocatore1Json.get("Rc")).intValue());
				statsTemp.setRigoriFatti(((Long) giocatore1Json.get("R+")).intValue());
				statsTemp.setRigoriSbagliati(((Long) giocatore1Json.get("R-")).intValue());
				GolSegnatiInTotale golSegnatiInTotale = new GolSegnatiInTotale(statsTemp.getgolFattiNonSuRigore(), statsTemp.getRigoriFatti());
				statsTemp.setGolSegnatiInTotale(golSegnatiInTotale);
				MediaGolFatti mediaGolFatti = new MediaGolFatti(statsTemp.getpartiteGiocate(), statsTemp.getgolFattiNonSuRigore(), statsTemp.getRigoriFatti());
				statsTemp.setMediaGolFatti(mediaGolFatti);
				MediaGolSubiti mediaGolSubiti = new MediaGolSubiti(statsTemp.getpartiteGiocate(), statsTemp.getgolSubiti());
				statsTemp.setMediaGolSubiti(mediaGolSubiti);
				statsTemp.setassist(((Long) giocatore1Json.get("Ass")).intValue());
				MediaAssist mediaAssist = new MediaAssist(statsTemp.getpartiteGiocate(), statsTemp.getassist());
				statsTemp.setMediaAssist(mediaAssist);
				statsTemp.setammonizioni(((Long) giocatore1Json.get("Amm")).intValue());
				statsTemp.setespulsioni(((Long) giocatore1Json.get("Esp")).intValue());
				statsTemp.setAutogol(((Long) giocatore1Json.get("Au")).intValue());
				
				giocatoreTemp.setStats(statsTemp);
				giocatore=giocatoreTemp;
				giocatoreRepo.put(giocatoreTemp.getNome(), giocatoreTemp);

			}
			
		}
		
		
	}	
	
	@Override
	public Collection<Giocatore> getDatabase() {
		return databaseRepo.values();
	}
	
	@Override
	public Collection<Giocatore> getGiocatori() {
		return giocatoreRepo.values();
	}
	
	/**
	 * Questo metodo va a riconoscere ed eliminare il giocatore da giocatoreRepo usando il Nome 
	 * dato in delete per riconoscerlo nella lista di giocatori.
	 * @param il nome del giocatore che si vuole eliminare.
	 * @param giocatoreRepo: da qua si va a rimuovere il giocatore con il nome immesso
	 */
	@Override
	public void deleteGiocatore(String Nome) {
		giocatoreRepo.remove(Nome);
		// TODO Auto-generated method stub
		
	}

	/**
	 * Questo metodo va a prendere da un file json tutte le statistiche delle squadre il cui nome 
	 * coincide con lo stesso immesso dall'utente utilizzando aggiungiSquadra
	 * @param nomeSquadra : il nome della squadra che si vuole inserire
	 * @param squadraRepo: dove si vanno a immettere tutti i dati della squadra/squadre
	 */
	@Override
	public void aggiungiSquadra(Squadra squadra) throws IOException, ParseException {
		if(squadraRepo.containsKey(squadra.getNomeSquadra())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Squadra già esistente..");
		}
		
		
		JSONParser jsonparser1 = new JSONParser();
		
		FileReader reader1 = new FileReader(".\\jsonfiles\\squadre.json");
		
		Object obj1 = jsonparser1.parse(reader1);
		
		JSONObject empjsonobj1 = (JSONObject)obj1;
		
		JSONArray array1 = (JSONArray)empjsonobj1.get("statsquadre");
		for (int i=0; i<array1.size(); i++)
		{
			squadraRepo.put(squadra.getNomeSquadra(), squadra);
			
			JSONObject squadra1Json = (JSONObject)array1.get(i);
			Squadra squadraSceltaTemp = new Squadra();
			
			squadraSceltaTemp.setNomeSquadra((String) squadra1Json.get("teamName"));
			if ((squadra.getNomeSquadra()).compareTo(squadraSceltaTemp.getNomeSquadra()) == 0)
			{
				JSONObject squadraJson = (JSONObject)array1.get(i);
				Squadra squadraTemp = new Squadra();
				squadraTemp.setNomeSquadra((String) squadraJson.get("teamName"));
				squadraTemp.setPosizione(((Long) squadraJson.get("position")).intValue());
				squadraTemp.setPuntiSquadra(((Long) squadraJson.get("points")).intValue());
				squadraTemp.setQualificazioneAttuale((String) squadraJson.get("qualification"));
				squadraTemp.setPartiteGiocateSquadra(((Number) squadraJson.get("games")).intValue());
				squadraTemp.setPartiteVinte(((Long) squadraJson.get("gamesWon")).intValue());
				squadraTemp.setPartitePareggiate(((Long) squadraJson.get("gamesDraw")).intValue());
				squadraTemp.setPartitePerse(((Long) squadraJson.get("gamesLost")).intValue());
				squadraTemp.setGolSegnatiSquadra(((Long) squadraJson.get("goalsScored")).intValue());
				squadraTemp.setGolSubitiSquadra(((Long) squadraJson.get("goalsConceded")).intValue());
				DifferenzaReti differenzaReti = new DifferenzaReti(squadraTemp.getGolSegnatiSquadra(), squadraTemp.getGolSubitiSquadra());
				squadraTemp.setDifferenzaReti(differenzaReti);
				MediaGolSegnatiSquadra mediaGolSegnatiSquadra = new MediaGolSegnatiSquadra(squadraTemp.getPartiteGiocateSquadra(), squadraTemp.getGolSegnatiSquadra());
				squadraTemp.setMediaGolSegnatiSquadra(mediaGolSegnatiSquadra);
				MediaGolSubitiSquadra mediaGolSubitiSquadra = new MediaGolSubitiSquadra(squadraTemp.getPartiteGiocateSquadra(), squadraTemp.getGolSubitiSquadra());
				squadraTemp.setMediaGolSubitiSquadra(mediaGolSubitiSquadra);
				
				squadra=squadraTemp;
				squadraRepo.put(squadraTemp.getNomeSquadra(), squadraTemp);

			}
			
		}
		
	}

	@Override
	public Collection<Squadra> getSquadre() {
		return squadraRepo.values();
	}

	/**
	 * Questo metodo va a riconoscere ed eliminare la squadra da squadraRepo usando il NomeSquadra
	 * dato in delete per riconoscerlo nella lista di squadre.
	 * @param NomeSquadra : nome della squadra che si vuole eliminare.
	 * @param squadraRepo: da qua si va a rimuovere la squadra con il nome immesso
	 */
	@Override
	public void deleteSquadra(String NomeSquadra) {
		squadraRepo.remove(NomeSquadra);
		// TODO Auto-generated method stub
		
	}


}