package exercise3;

// uh ha tid til at se om jeg kan det her gøgl kig i de 2 Employee.java for inspiration
public class Person {

	private String name;

	private String adress;

	private double monthlysalary;

	// felt variabler ^^

	public Person(String name, String adress, int monthlysalary) {
		this.name = name;
		this.adress = adress;
		this.monthlysalary = monthlysalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}

	public void setMonthlysalary(int monthlysalary) {
		this.monthlysalary = monthlysalary;
	}

	public double getMonthlysalary() {
		return monthlysalary;
	}

//	ikke korrekt måde at gøre det på ganger med 12 for et år og ganger derefter med -
//	2.5 en gang. skal finde en måde at gange hver måned med 2.5
	public void yearlysalary() {
		monthlysalary = monthlysalary * 12 * 2.5;

	}

	public void printPerson() {
		System.out.println("******************");
		System.out.println("Name: " + name);
		System.out.println("Adress: " + adress);
		System.out.println("Yearlysalary: " + monthlysalary);
		System.out.println("******************");
		System.out.println();

	}

}

//
//	@Overide
//	public string toString() {
//		
