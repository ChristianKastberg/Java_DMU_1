package dobbelarray;

import java.util.Arrays;

public class Opgave2 {

	public static int højesteAntalBenbrud(int[][] values) {
		// TODO
		return -1;
	}

	public static int[] samledeAntalBenbrudPrÅr(int[][] values) {
		// TODO
		return null;
	}

	public static int[] samledeAntalBenbrudPrMåned(int[][] values) {
		// TODO
		return null;
	}

	public static int månedMedHøjstAntalBenbrud(int[][] values) {
		// TODO
		return -1;
	}

	public static void udskrivArray(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print("År " + (2015 + i) + ": ");
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] benbrud = { { 98, 117, 120, 80, 98, 56, 66, 45, 78, 86, 89, 99 },
				{ 101, 99, 75, 67, 79, 56, 50, 57, 88, 77, 75, 96 },
				{ 112, 95, 110, 97, 89, 65, 44, 56, 88, 67, 45, 80 },
				{ 89, 92, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89 } };
		udskrivArray(benbrud);
		System.out.println(højesteAntalBenbrud(benbrud));
		System.out.println(Arrays.toString(samledeAntalBenbrudPrÅr(benbrud)));
		System.out.println(Arrays.toString(samledeAntalBenbrudPrMåned(benbrud)));
		System.out.println(månedMedHøjstAntalBenbrud(benbrud));
	}

}
