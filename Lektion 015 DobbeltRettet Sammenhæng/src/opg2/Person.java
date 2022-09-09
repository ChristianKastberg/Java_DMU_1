package opg2;

import java.util.ArrayList;

import opg1.Rental;

public class Person {

	private String name;
	private int age;
	private ArrayList<Gift> gifts = new ArrayList<>();

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;

		// no get methods? weird to string...

	}

	public void addGift(Gift gift) {
		if (!gifts.contains(gift)) {
			gifts.add(gift);
			gift.addPerson(this);
		}
	}

	// calculates the total value of gifts recieved

	public double giftValue() {
		double result = 0;
		double firstValue = 0;

		for (int i = 0; i < gifts.size(); i++) {
			firstValue = gifts.get(i).getPrice();
			result += firstValue;
		}
		return result;

	}

}
