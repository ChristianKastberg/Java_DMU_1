
package sep10ex2;

public class Child {
	private int age;
	private boolean male;

	public Child(int age, boolean male) {
		this.age = age;
		this.male = male;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String institution() {
		// OR || metoden tester om en af parameterne gælder
		{
			if (age == 0) {
				return ("home");
			} else if (age >= 1 && age <= 2) {
				return ("Nursery");
			} else if (age >= 3 && age <= 5) {
				return ("Kindergarden");
			} else if (age >= 6 && age <= 16) {
				return ("School");
			} else
				return ("Out of School");
		}
	}

	public String gender() {
		{
			if (male) {
				return "Male";
			} else
				return "Girl";

		}

	}

	public String team() {
		{
			if (age < 8 && !male) {
				return "Tumbling Girls";
			} else if (age >= 8 && !male) {
				return "Springy Girls";
			} else if (age < 8 && male) {
				return "Young Boys";
			} else
				return "Cool Boys";
		}

	}
//	 den her er der ikke behov for bare put selve metoden
//	 ind i System.out.printl(variabel.metode());
//	public void PrintChild() {
//
//		System.out.println("Age" + age);
//		System.out.println("Male" + male);
//		System.out.println();

}
