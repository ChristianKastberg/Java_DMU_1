package opg1;

import java.io.File;
import java.util.Scanner;

public class Opg1 {

	public static boolean linFileSearch(String fileName, int target) {

		try {
			File f = new File("tal.txt");
			Scanner scan = new Scanner(f);

			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// add if statements to find out what to return
		return false;

	}

}
