package it.univpm.AssistenteFantacalcio.model;

public class GolSegnati {
	
	private int golSegnati;
	private int golFatti;
	private int rigoriSegnati;
	
	/** Costruttore dell'oggetto.
     * @param golFatti: rappresenta i gol fatti su azione
     * @param rigoriSegnati: rappresenta i rigori segnati
     */
	public GolSegnati(int golFatti, int rigoriSegnati) {
		this.golFatti = golFatti;
		this.rigoriSegnati = rigoriSegnati;
		this.golSegnati = golFatti+golSegnati;
	}
	
	public int getGolSegnati() {
		return golSegnati;
	}

	public void setGolSegnati(int golSegnati) {
		this.golSegnati = golSegnati;
	}

	public int getGolFatti() {
		return golFatti;
	}

	public void setGolFatti(int golFatti) {
		this.golFatti = golFatti;
	}

	public int getRigoriSegnati() {
		return rigoriSegnati;
	}

	public void setRigoriSegnati(int rigoriSegnati) {
		this.rigoriSegnati = rigoriSegnati;
	}

	/**
	 * Override del metodo toString(),
	 * @return String che rappresenta le coordinate.
	 */
	@Override
	public String toString() {
		return "golSegnati = " + golSegnati;
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
