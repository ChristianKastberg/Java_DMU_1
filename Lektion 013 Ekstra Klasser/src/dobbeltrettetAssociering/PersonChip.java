package dobbeltrettetAssociering;

import java.util.ArrayList;

public class PersonChip {

	private int nr;
	private String navn;
	private int maxSaldo;
	private int alder;
	private ArrayList<Facilitet> faciliteter = new ArrayList<>();

	public PersonChip(int nr, String navn, int maxSaldo, int alder) {
		this.nr = nr;
		this.navn = navn;
		this.maxSaldo = maxSaldo;
		this.alder = alder;
	}

// add og remove Facilitet

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getMaxSaldo() {
		return maxSaldo;
	}

	public void setMaxSaldo(int maxSaldo) {
		this.maxSaldo = maxSaldo;
	}

	public int getAlder() {
		return alder;
	}

	public void setAlder(int alder) {
		this.alder = alder;
	}
}
