package it.univpm.AssistenteFantacalcio;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

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
		g = new Giocatore (256, "A", "VLAHOVIC", "Juventus");
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		assertEquals(256, g.getId());
		assertEquals("A", g.getRuolo());
		assertEquals("VLAHOVIC", g.getNome());
		assertEquals("Juventus", g.getSquadra());
	}

	@Test
	void test1() {
		assertThrows(InvalidIdException.class, ()->g.setId(-1));
	}

}
