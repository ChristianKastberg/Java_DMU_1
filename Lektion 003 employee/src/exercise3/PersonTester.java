package exercise3;

public class PersonTester {

	public static void main(String[] args) {

		Person person = new Person("John", "Nottingham", 20000);

		person.setMonthlysalary(1000);
		person.setName("Mark");
		person.setAdress("London");

		person.yearlysalary();
		person.printPerson();
	}

}
