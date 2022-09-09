package opg1;

import java.util.ArrayList;

import group01_0mperson.Person;

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

//	public void addRental(Rental r) {
//		rentals.add(r);
//	}

	public void addRental(Rental r) {
		if (!rentals.contains(r)) {
			rentals.add(r);
			r.addCar(this);
		}
	}

	/**
	 * Removes the person from this group, if they are connected.
	 */
	public void removeRental(Rental r) {
		if (rentals.contains(r)) {
			rentals.remove(r);
			r.removeCar(null);
		}
	}

	// Highest number of days the car has been rented out

	public int rentalDays() {
		int result = 0;
		for (int i = 0; i < rentals.size(); i++) {
			int rentalDays = rentals.get(i).getDays();
			if (result < rentalDays) {
				result = rentalDays;

			}
		}

		return result;

	}

}
