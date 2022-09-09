package opg3;

import java.time.LocalDate;

public class Værkfører extends Mekaniker {

	private LocalDate promoYear;
	private int bonus;

	public Værkfører(String navn, String adresse, LocalDate graduationYear, int timeløn, LocalDate promoYear,
			int bonus) {
		super(navn, adresse, graduationYear, timeløn);
		this.promoYear = promoYear;
		this.bonus = bonus;
	}

	public LocalDate getPromoYear() {
		return promoYear;
	}

	public void setPromoYear(LocalDate promoYear) {
		this.promoYear = promoYear;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void ugeLøn(int ugeløn) {

		System.out.println(ugeløn = getTimeløn() * 37 + bonus);

	}

	@Override
	public String toString() {
		return "Værkfører [promoYear=" + promoYear + ", bonus=" + bonus + "]";
	}

}
