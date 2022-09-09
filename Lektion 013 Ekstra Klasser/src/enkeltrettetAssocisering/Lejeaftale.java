package enkeltrettetAssocisering;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lejeaftale {

	private LocalDate fraDato;
	private LocalDate tilDato;
	private Lejer[] lejer = new Lejer[1];

	private ArrayList<Bolig> bolig = new ArrayList<>();

	public Lejeaftale(LocalDate fraDato) {
		this.fraDato = fraDato;
		this.tilDato = null;
		// tilDato er null fra start
	}

	public ArrayList<Bolig> createBolig() {
		ArrayList<Bolig> bolig = new ArrayList<Bolig>();
		return bolig;
	}

	public Lejer[] getLejer() {
		return this.lejer;
	}

	public void addLejer(Lejer lejer) {
//		this.lejer.add(lejer);
	}

	public void removeLejer(Lejer lejer) {
//		this.lejer.remove(lejer);
	}

	public void setLejer(Lejer[] lejer) {
		this.lejer = lejer;
	}

	public LocalDate getFraDato() {
		return fraDato;
	}

	public void setFraDato(LocalDate fraDato) {
		this.fraDato = fraDato;
	}

	public LocalDate getTilDato() {
		return tilDato;
	}

	public void setTilDato(LocalDate tilDato) {
		this.tilDato = tilDato;
	}

}
