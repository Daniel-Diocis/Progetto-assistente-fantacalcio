package it.univpm.AssistenteFantacalcio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.univpm.AssistenteFantacalcio.exception.InvalidIdException;
import it.univpm.AssistenteFantacalcio.model.Giocatore;

class GiocatoreTests {
	private Giocatore g = null;

	@BeforeEach
	void setUp() throws Exception {
		g = new Giocatore (125, "A", "VLAHOVIC", "Juventus");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertThrows(InvalidIdException.class, ()->g.setId(-1));
	}

}
