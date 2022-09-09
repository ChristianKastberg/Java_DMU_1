package model;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1 = new Employee("Hans", "Jensen", 21);
		e1.printEmployee();

		Employee e2 = new Employee("Lisbeth", "Den tredje", 43);

		e2.birthday();
		e2.printEmployee();
		e2.setLastName("Den Fjerde");
		e2.printEmployee();
//		e1.setAge(21);
//		e1.printEmployee();
//		int age = e1.getAge();
//		System.out.println(age);
//		e1.setAge(21);
//		age = e1.getAge();
//		System.out.println(age);
//		e1.setName("Viggo");
//		e1.printEmployee();

	}

}
