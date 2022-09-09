package opg3;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		Random rng = new Random();

		Car car1 = new Car("carone1", 2000);
		car1.setDayPrice(100);
		Car car2 = new Car("cartwo2", 2010);
		car2.setDayPrice(80);
		Car car3 = new Car("carthree3", 2002);
		car3.setDayPrice(120);
		Car car4 = new Car("carfour4", 2014);
		Car car5 = new Car("carfive5", 2019);

		Rental rent1 = new Rental(1, "20191028", 2);
		rent1.addCar(car1);
		System.out.printf("Price for renting %s car for %d days cost %.2f.%n", car1.getLicense(), 2, rent1.getPrice());

		Rental rent2 = new Rental(2, "20191024", 8);
		rent2.addCar(car2);
		rent2.addCar(car3);
		System.out.printf("Price for renting cars: %s and %s. For %d days cost %.2f.%n", car2.getLicense(),
				car3.getLicense(), 8, rent2.getPrice());
	}
}
