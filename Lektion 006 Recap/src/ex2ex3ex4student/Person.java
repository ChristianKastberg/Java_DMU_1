package ex2ex3ex4student;

public class Person {
	private String name;
	private int dayOfBirth; // 1..31
	private int monthOfBirth; // 1..12
	private int yearOfBirth; // 1900..2010

	public Person(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
	}

	public void printPerson() {
		System.out.println(name + ", born " + yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth);
	}

	public int calcAge(int dayOfBirth, int monthOfBirth, int yearOfBirth) {

		int BirthDay = this.dayOfBirth;
		int ThisDay = (16);
		int BirthMonth = this.monthOfBirth;
		int ThisMonth = (9);
		int ThisYear = (2019);
		int BirthYear = this.yearOfBirth;
		if (ThisYear + ThisMonth + ThisDay == BirthYear + BirthMonth + BirthDay) {
			return 0;
		} else if (ThisYear > BirthYear)

			return ThisYear - BirthYear;
		return BirthYear;
	}
	// WRONG WRONG WRONG finder svaret en anden god gang ^^

	public String LeapYear() {
//			Leap years er år der kan divideres med 400 og 4 men ikke 4 og 100
		if (yearOfBirth % 400 == 0) {
			return ("Leap year");
		} else if (yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0) {
			return ("Leap year");
		} else {
			return ("Not a leap Year");
		}

	}

}
