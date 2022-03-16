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

import it.univpm.AssistenteFantacalcio.model.Giocatore;
import it.univpm.AssistenteFantacalcio.model.GolSegnati;
import it.univpm.AssistenteFantacalcio.model.Stats;

@Service
public class FormazioneServiceImpl implements FormazioneService {
	private static Map<String, Giocatore> giocatoreRepo = new HashMap<>();
	//for auto id...
//	private final AtomicLong counter = new AtomicLong();
	
	public FormazioneServiceImpl() throws IOException, ParseException {
		// loading data...
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
			giocatoreTemp.setId(l.intValue());
			giocatoreTemp.setNome((String) giocatoreJson.get("Nome"));
			giocatoreTemp.setR((String) giocatoreJson.get("R"));
			giocatoreTemp.setSquadra((String) giocatoreJson.get("Squadra"));
			//finire di caricare tutte le proprietà di stats
			Stats statsTemp = new Stats();
			statsTemp.setassist(((Long) giocatoreJson.get("Ass")).intValue());
			
			giocatoreTemp.setStats(statsTemp);
			giocatoreRepo.put(giocatoreTemp.getNome(), giocatoreTemp);
			
		}
		
		
	}
	
/*	@Override
	public void createGiocatore(Giocatore giocatore) {
		if(giocatoreRepo.containsKey(giocatore.getId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Existing id...");
		}
		giocatoreRepo.put(giocatore.getNome(), giocatore);
	}
	
	@Override
	public void updateGiocatore(int id, Giocatore giocatore) {
		giocatoreRepo.remove(id);
		giocatore.setId(id);
//		giocatoreRepo.put(id, giocatore);
	}*/
	
	@Override
	public Collection<Giocatore> getGiocatori() {
		return giocatoreRepo.values();
	}
	/*
	@Override
	public void deleteGiocatore(int id) {
		giocatoreRepo.remove(id);
		// TODO Auto-generated method stub
		
	}*/
}