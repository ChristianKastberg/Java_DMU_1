package opg2;

import java.util.ArrayList;

public class Plads {
	private int nr;
	private Område område;
	private final ArrayList<Reservation> reservations = new ArrayList<>();

	public Plads(int nr, Område område) {
		this.nr = nr;
		this.område = område;
	}

	public int getNr() {
		return nr;
	}

	public Område getOmråde() {
		return område;
	}

	public ArrayList<Reservation> getReservation() {
		return new ArrayList<>(reservations);
	}

	public void addReservation(Reservation reservation) {
		if (!reservations.contains(reservation)) {
			reservations.add(reservation);
			reservation.setPlads(this);
		}
	}

	public void removeReservation(Reservation reservation) {
		if (reservations.contains(reservation)) {
			reservations.remove(reservation);
			reservation.setPlads(null);
		}
	}

}
