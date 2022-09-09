package opg1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mekaniker extends Person {

	private LocalDate graduationYear;
	private int timeløn;

	public Mekaniker(String navn, String adresse, LocalDate graduationYear, int timeløn) {
		super(navn, adresse);
		this.graduationYear = graduationYear;
		this.timeløn = timeløn;
	}

	public LocalDate getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(LocalDate graduationYear) {
		this.graduationYear = graduationYear;
	}

	public int getTimeløn() {
		return timeløn;
	}

	public void setTimeløn(int timeløn) {
		this.timeløn = timeløn;
	}

	public void ugeLøn(int ugeløn) {

		System.out.println(ugeløn = timeløn * 37);
	}

	/**
	 * * Beregner summen af ugelønnen for alle i listen
	 **/
	public static double samletLoen(ArrayList<Mekaniker> list) {

		return 0;
	}

	@Override
	public String toString() {
		return "Mekaniker [graduationYear=" + graduationYear + ", timeløn=" + timeløn + "]";
	}

}
