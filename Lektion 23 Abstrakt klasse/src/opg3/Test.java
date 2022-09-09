package opg3;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {

		Mekaniker m1 = new Mekaniker("Bob", "fjordvej", null, 200);
		System.out.println(m1);
		m1.ugeLøn(165);

		Værkfører v1 = new Værkfører("Margo", "gråvej", null, 200, null, 1000);
		System.out.println(v1);
		v1.ugeLøn(165);
	}

}
