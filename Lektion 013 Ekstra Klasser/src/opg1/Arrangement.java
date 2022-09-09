package opg1;

import java.util.ArrayList;

public class Arrangement {

	private String navn;
	private Boolean offentlig;
	private int pris;
	private int maxAntal;
	private ArrayList<String> deltagere;

	Arrangement(String navn, Boolean offentlig, int pris, int maxAntal) {
		this.navn = navn;
		this.offentlig = offentlig;
		this.pris = pris;
		this.maxAntal = maxAntal;
		this.deltagere = new ArrayList<String>();
	}

	public String getNavn() {
		return navn;

	}

	public boolean isOffentlig() {
		return offentlig;

	}

	public int getPris() {
		return pris;
	}

	public int getMaxAntal() {
		return maxAntal;

	}

	public String toString(String string) {

		return toString(getNavn() + isOffentlig() + getPris() + getMaxAntal());

	}

	public boolean addDeltager(String navn) {

		if (maxAntal < deltagere.size()) {
			return false;
		} else

			deltagere.add(navn);
		return true;

	}

	public int numOfAntendees() {

		return deltagere.size();

	}

	public int antalTilmeldte(String name) {

		int count = 0;
		for (int i = 0; i < deltagere.size(); i++) {

			if (deltagere.get(i).equals(name)) {
				count++;

			}

		}

		return count;

	}

	public String typeOfArrangement1(int inputPris) {

		if (!offentlig) {

			return "we dont take kindly to your kind round these parts";
		} else if (inputPris == 0) {

			return "It's free for errybody";
		} else if (inputPris < 200) {

			return "You should join us it's pretty darn cheap";
		} else
			return "hmm you might need to save up for a bit, this showings pretty exspensive";

	}

	// Hvis der ikke er flere pladser ledige returneres en passende tekst med at alt
	// er booket.
	// Hvis der er ledige pladser og prisen på arrangementet er mindre end prisen i
	// parameteren
	// returneres en passendetekst om, at der er ledige pladser til et billigt
	// arrangement.
	// Hvis der er ledige pladser og prisen på arrangementet er større end prisen
	// i parameterenreturneres en passende tekst om, at der er ledige pladser til et
	// luksusarrangement.

	public String typeOfArrangement2(int inputPris) {

		for (int i = 0; i < deltagere.size(); i++) {

			if (i < inputPris) {

			}
		}

		return "hello world";

	}

}
