package array;

import java.util.ArrayList;

public class Arrangement {
	private String navn;
	private boolean offentlig;
	private int pris;
	private ArrayList<String> deltagere;
	private int maxAntal;

	public Arrangement(String navn, boolean offentlig, int pris, int maxAntal) {
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

	public ArrayList<String> getDeltagere() {
		return deltagere;
	}

	public int getMaxAntal() {
		return maxAntal;
	}

	public boolean addDeltager(String navn) {
		boolean ok = true;
		if (deltagere.size() < maxAntal) {
			deltagere.add(navn);
		} else {
			ok = false;
		}
		return ok;
	}

	public int antalTilmeldte() {
		return deltagere.size();
	}
	
	public int antalTilmeldte(String navn) {
		int antal = 0;
		for (String n : deltagere) {
			if (navn.equals(n)) {
				antal++;
			}
		}
		return antal;
	}

	public String typeAfArrangement1(double pris) {
		String result = "";
		if (offentlig && this.pris==0) {
			result = "Alle er velkomne til dette gratis arrangement";
		} else if (offentlig && this.pris <= pris) {
			result = "Alle er velkomne til dette billige arrangement, prisen er " + this.pris;
		} else if (offentlig) {
			result = "Alle er velkomne til dette lidt dyre arrangement, prisen er " + this.pris;
		}
		else {
			result = "Arrangementet er lukket du er ikke vekommen";
		}
		return result;
	}

	public String typeAfArrangement2(double pris) {
		String result = "";
		if (deltagere.size() == maxAntal) {
			result = "Arrangementet er fuldt booket";
		} else if (this.pris <= pris) {
			result = "Billigt arrangement med ledige pladser";
		} else {
			result = "Luksus arrangement med ledige pladser";
		}
		return result;
	}

	public String toString() {
		return "navn: " +navn +"\noffentlig: " + offentlig + "\npris: " +pris + "\nMax antal: "+ maxAntal;
	}
}
