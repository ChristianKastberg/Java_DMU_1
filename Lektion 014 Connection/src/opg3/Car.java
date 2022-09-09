package opg3;

import java.util.ArrayList;

public class Car {
	private String license;
	private double pricePerDay;
	private int purchaseYear;
	private ArrayList<Rental> rentals = new ArrayList<>();

	public Car(String license, int year) {
		this.license = license;
		purchaseYear = year;
	}

	public void setDayPrice(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public double getDayPrice() {
		return pricePerDay;
	}

	public String getLicense() {
		return license;
	}

	public int getPurchaseYear() {
		return purchaseYear;
	}

	/**
	 * PRE: rental period doesn't overlap with another for given car (double
	 * booking).
	 * 
	 * @param r
	 */
	public void addRental(Rental r) {
		rentals.add(r);
	}
}
