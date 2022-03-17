package it.univpm.AssistenteFantacalcio.exception;

/**
 * @author Daniel Diocis Calero
 * @author Enrico Maria Flati
 */

public class InvalidIdException extends Exception {
	public InvalidIdException() {
		super();
		System.out.println("Id non valido, perchè non esiste id minore di 0");
	}
	public InvalidIdException(String msg) {
		super(msg);
		System.out.println("Id non valido, perchè non esiste id minore di 0" + msg);
	}

}
