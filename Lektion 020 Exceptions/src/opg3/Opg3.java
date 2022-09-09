package opg3;

import java.io.File;
import java.util.Scanner;

public class Opg3 {

	public static void main(String[] args) {
		// Print all positive and negative numbers > 100

		try {
			File f = new File("tal.txt");
			Scanner scan = new Scanner(f);

			while (scan.hasNextDouble()) {
				double value = scan.nextDouble();
				double print = 0;
				if (value < 100) {
					print = value;
					System.out.printf("%15.2f%n", print);
				}
			}
			scan.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
