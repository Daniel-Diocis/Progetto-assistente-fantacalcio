package it.univpm.AssistenteFantacalcio.model;

public class GolSegnatiInTotale {
	
	private int golSegnatiInTotale;
	private int golFattiNonSuRigore;
	private int rigoriFatti;
	
	/** Costruttore dell'oggetto.
     * @param golFatti: rappresenta i gol fatti su azione
     * @param rigoriSegnati: rappresenta i rigori segnati
     */
	public GolSegnatiInTotale(int golFattiNonSuRigore, int rigoriFatti) {
		this.golFattiNonSuRigore = golFattiNonSuRigore;
		this.rigoriFatti = rigoriFatti;
		this.golSegnatiInTotale = golFattiNonSuRigore+rigoriFatti;
	}
	
	public int getGolSegnatiInTotale() {
		return golSegnatiInTotale;
	}

	public void setGolSegnatiInTotale(int golSegnatiInTotale) {
		this.golSegnatiInTotale = golSegnatiInTotale;
	}

	public int getGolFattiNonSuRigore() {
		return golFattiNonSuRigore;
	}

	public void setGolFattiNonSuRigore(int golFattiNonSuRigore) {
		this.golFattiNonSuRigore = golFattiNonSuRigore;
	}

	public int getRigoriFatti() {
		return rigoriFatti;
	}

	public void setRigoriSegnati(int rigoriFatti) {
		this.rigoriFatti = rigoriFatti;
	}

	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta le coordinate.
	 */
	@Override
	public String toString() {
		return "gol Segnati in totale = " + golSegnatiInTotale;
	}

	/**
	 * Override del metodo equals()
	 *  @param oggetto da confrontare,
	 *  @return true se i due oggetti sono uguali, false altrimenti.
	 */
/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinates other = (Coordinates) obj;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		return true;
	}*/
}
