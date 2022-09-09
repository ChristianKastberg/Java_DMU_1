package opg2;

import java.util.ArrayList;

import opg1.Rental;

public class Gift {

	private String description;
	private double price;
	private ArrayList<Person> persons = new ArrayList<>();

	public Gift(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void addPerson(Person person) {
		if (!persons.contains(person)) {
			persons.add(person);
			person.addGift(this);
		}
	}

}
