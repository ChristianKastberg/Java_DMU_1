package ex2ex3ex4student;

public class PersonTest {

	public static void main(String[] args) {

		Person Harry = new Person("Øv", 2400, 9, 14);

		System.out.println(Harry.calcAge(2014, 5, 14));
		System.out.println(Harry.LeapYear());
	}

}
