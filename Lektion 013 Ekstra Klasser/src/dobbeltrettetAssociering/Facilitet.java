package dobbeltrettetAssociering;

import java.util.ArrayList;

public class Facilitet {

	private String navn;
	private int minimumsAlder;
	private int pris;
	private ArrayList<PersonChip> personChipper = new ArrayList<>();

	public Facilitet(String navn, int minimumsAlder, int pris) {
		this.navn = navn;
		this.minimumsAlder = minimumsAlder;
		this.pris = pris;
	}

	public PersonChip createPersonChip(int nr, String navn, int maxSaldo, int alder) {
		PersonChip personChip = new PersonChip(nr, navn, maxSaldo, alder);
		personChipper.add(personChip);
		return personChip;
	}

	public void addPersonChip(PersonChip personChip) {
		if (!personChipper.contains(personChip)) {
			personChipper.add(personChip);
//			personChipper.addFacilitet(this);

		}
	}

	public void removePersonChip(PersonChip personChip) {
		if (personChipper.contains(personChip)) {
			personChipper.remove(personChip);
//			personChipper.removeFacilitet(this);
		}
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getMinimumsAlder() {
		return minimumsAlder;
	}

	public void setMinimumsAlder(int minimumsAlder) {
		this.minimumsAlder = minimumsAlder;
	}

	public int getPris() {
		return pris;
	}

	public void setPris(int pris) {
		this.pris = pris;
	}

}
