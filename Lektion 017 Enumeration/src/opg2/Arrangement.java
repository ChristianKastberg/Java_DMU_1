package opg2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Arrangement {
	private LocalDateTime localtimeStart;
	private LocalDateTime localtimeSlut;
	private final ArrayList<Plads> pladser = new ArrayList<>();

	public Arrangement(LocalDateTime localtimeStart, LocalDateTime localtimeSlut) {
		this.localtimeStart = localtimeStart;
		this.localtimeSlut = localtimeSlut;
	}

	public LocalDateTime getTimeStart() {
		return localtimeStart;
	}

	public LocalDateTime getTimeSlut() {
		return localtimeSlut;
	}

	public ArrayList<Plads> getPladser() {
		return new ArrayList<>(pladser);
	}

	public void addPlads(Plads plads) {
		if (!pladser.contains(plads)) {
			pladser.add(plads);
		}
	}

	public ArrayList<Plads> antalReserveredePladser() {

		return pladser;

	}

}
