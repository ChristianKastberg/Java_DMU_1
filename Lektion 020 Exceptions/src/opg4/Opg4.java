package opg4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opg4 {

	public static void ReadFile(String fileName) {
		// Lav en applikation der i main-metoden indlæser en række tal fra tastaturet
		// (sluttende med -1), de indlæste tal skrives til en tekstfil.
		// Tallet -1 skal ikke skrives i filen. De øvrige tal skal være positive.
		// Tallene skal skrives i filen efterhånden, som de indlæses
		// (de skal altså ikke gemmes i en ArrayList).
		BufferedWriter writer = null;
		Scanner scan = new Scanner(System.in);
		try {
			// create a temporary file
			File f = new File("test.txt");
			System.out.println(f.getCanonicalPath());
			writer = new BufferedWriter(new FileWriter(f));
			// husk if sætning
			writer.write("Hello world!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
				scan.close();
			} catch (Exception e) {
			}
		}
	}
}