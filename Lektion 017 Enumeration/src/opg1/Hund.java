package opg1;

public class Hund {
	private String navn;
	private boolean stamtavle;
	private int pris;
	private Race race;

	public Hund(String navn, boolean stamtavle, int pris, Race race) {
		this.navn = navn;
		this.stamtavle = stamtavle;
		this.pris = pris;
		this.race = race;
	}

	public int getPris() {
		return pris;
	}

	@Override
	public String toString() {
		String str = "Navn:  " + navn + "\nStamtavle: " + stamtavle + "\nPris: " + pris + "\nRace: " + race;

		return str;
	}

}
