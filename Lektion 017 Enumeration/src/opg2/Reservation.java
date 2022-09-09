package opg2;

import java.util.ArrayList;

public class Reservation {

	private String navn;
	private boolean offentlig;
	private Plads plads;
	private static Arrangement standardTimePris;

	public Reservation(String navn, boolean offentlig) {
		this.navn = navn;
		this.offentlig = offentlig;
	}

	public Arrangement getStandardTimePris() {
		return standardTimePris;
	}

	public void setStandardTimePris(Arrangement standardTimePris) {
		this.standardTimePris = standardTimePris;
	}

	public String getNavn() {
		return navn;
	}

	public boolean getOffentlig() {
		return offentlig;
	}

	public Plads getplads() {
		return plads;
	}

	public void setPlads(Plads plads) {
		if (this.plads != plads) {
			Plads oldplads = this.plads;
			if (oldplads != null) {
				oldplads.removeReservation(this);
			}
		}
	}

}
