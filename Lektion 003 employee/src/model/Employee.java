package model;

/**
 * This class models an employee.
 */
public class Employee {
	// The name of the employee.
	private String name;
	// Whether the employee is a trainee or not.
	private boolean trainee;
	// the age of the employee
	private int age;
	// sets the lastname of the employee
	private String lastname;

	/**
	 * Creates an employee as a trainee with the given name.
	 */
	public Employee(String name, String lastname, int age) {
		this.name = name;
		this.trainee = true;
		this.age = age;
		this.lastname = lastname;
	}

	/**
	 * Sets the name of the employee.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the name of the employee.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the trainee state of the employee.
	 */
	public void setTrainee(boolean trainee) {
		this.trainee = trainee;
	}

	/**
	 * Returns the trainee state of the employee.
	 */
	public boolean isTrainee() {
		return trainee;
	}

	/**
	 * Returns a description of the employee (for test purposes).
	 */
	@Override
	public String toString() {
		return name + " (trainee: " + trainee + ")";
	}
// tester om alders gølget virker 

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void birthday() {
		age = age + 1;

	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Prints a description of the employee.
	 */
	public void printEmployee() {
		System.out.println("*******************");
		System.out.println("Name: " + name);
//		Prøver at putte Lastname ind i employee
		System.out.println("Lastname: " + lastname);
		System.out.println("Trainee: " + trainee);
//		Prøver at putte age ind it employee 
		System.out.println("Age: " + age);

		System.out.println("*******************");
		System.out.println();
	}
}
