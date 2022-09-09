package opg1;

public class Excersize402 {

	public static void main(String[] args) {

		Person p1 = new Person("Mateusz", "Pawel", "Dziurdz");

		Person p2 = new Person("Piotr", " ", "Suski");

		p2.printPerson();
//		p2.setUsername("Piotr", "Suski");

		p1.getUsername();

		System.out.println(p1.getUsername());
		System.out.println(p1.getIntis());
		System.out.println(p1.getCryptointis(5));

//		p1.printPerson();
//		p2.printPerson();

	}

}
