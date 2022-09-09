package opg3;

import java.util.ArrayList;

public class Rental {
	private int number;
	private int days;
	private String date;
	private ArrayList<Car> cars = new ArrayList<>();

	public Rental(int number, String date, int days) {
		this.number = number;
		this.date = date;
		this.days = days;
	}

	public double getPrice() {
		double price = 0;
		for (Car car : cars) {
			price += car.getDayPrice() * days;
		}
		return price;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void addCar(Car car) {
		cars.add(car);
	}
}
