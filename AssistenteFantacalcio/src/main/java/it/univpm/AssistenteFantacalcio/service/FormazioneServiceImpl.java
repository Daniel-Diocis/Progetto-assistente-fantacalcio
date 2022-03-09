package it.univpm.AssistenteFantacalcio.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.univpm.AssistenteFantacalcio.model.Giocatore;

@Service
public class FormazioneServiceImpl implements FormazioneService {
	private static Map<Integer, Giocatore> giocatoreRepo = new HashMap<>();
	//for auto id...
	private final AtomicLong counter = new AtomicLong();
	
	public FormazioneServiceImpl() {
		// loading data...
		Giocatore honey = new Giocatore();
		honey.setId((int)counter.incrementAndGet());
		honey.setCognome("Honey");
		giocatoreRepo.put(honey.getId(), honey);
		
		Giocatore almond = new Giocatore();
		almond.setId((int)counter.incrementAndGet());
		almond.setCognome("Almond");
		giocatoreRepo.put(almond.getId(), almond);
	}
	
	@Override
	public void createGiocatore(Giocatore giocatore) {
		if(giocatoreRepo.containsKey(giocatore.getId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Existing id...");
		}
		giocatoreRepo.put(giocatore.getId(), giocatore);
	}
	
	@Override
	public void updateGiocatore(Integer id, Giocatore giocatore) {
		giocatoreRepo.remove(id);
		giocatore.setId(id);
		giocatoreRepo.put(id, giocatore);
	}
	
	@Override
	public Collection<Giocatore> getGiocatori() {
		return giocatoreRepo.values();
	}
	
	@Override
	public void deleteGiocatore(Integer id) {
		giocatoreRepo.remove(id);
		// TODO Auto-generated method stub
		
	}
}