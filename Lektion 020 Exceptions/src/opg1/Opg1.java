package opg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opg1 {
// read a file with a list of numbers and print them *2 in the console window
	public static void main(String[] args) {

		try {
			File f = new File("tal.txt");
			Scanner scan = new Scanner(f);

			while (scan.hasNextDouble()) {
				double value = scan.nextDouble();
				double total = 2;
				total = total * value;
				System.out.printf("%15.2f%n", total);
			}
			scan.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}