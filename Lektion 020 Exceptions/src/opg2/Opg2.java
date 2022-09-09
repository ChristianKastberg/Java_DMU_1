package opg2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Opg2 {
	public static void main(String[] args) {
		// insert the numbers in an ArrayList and print them in reverse order 285, 177
		// .... 34
		try {
			File f = new File("tal.txt");
			Scanner scan = new Scanner(f);
			ArrayList<Double> dd = new ArrayList<>();

			while (scan.hasNextDouble()) {
				double value = scan.nextDouble();
				dd.add(value);
			}
			scan.close();
			// reverses the ArrayList
			Collections.reverse(dd);

			System.out.println(dd);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}