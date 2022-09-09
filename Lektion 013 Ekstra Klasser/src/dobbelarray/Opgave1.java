package dobbelarray;

import java.util.Arrays;

public class Opgave1 {

	// values indeholder 11 på alle pladser
	public static void alle11(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				values[i][j] = 11;
			}
		}
	}

	// values indeholder værdierne 1-n*m.
	// 1..m i første række
	// (m+1) til 2*m i 2. række osv alle n rækker
	public static void alleTal(int[][] values) {
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				values[i][j] = count;
				count++;
			}
		}
	}

	// values opdateres så alle elementerne i row har værdien value
	public static void opdaterRække(int[][] values, int row, int value) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				values[row][j] = 8;

			}
		}
	}

	// values opdateres så alle elementerne i col har værdien value
	public static void opdaterColumn(int[][] values, int col, int value) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				values[i][col] = value;

			}
		}
	}

	// values opdateres så alle elementerne i kanterne har værdien value
	public static void opdaterKant(int[][] values, int value) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {

				values[0][j] = value;
				values[i][0] = value;
				values[i][7] = value;
				values[5][j] = value;
			}
		}
	}

	public static void udskrivArray(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print("Række: " + i + ": ");
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		final int ROW = 6;
		final int COL = 8;
		int[][] values = new int[ROW][COL];

		// Udskriv values på tabel form
		udskrivArray(values);

		System.out.println();

		alle11(values);
		System.out.println("Nedenfor skulle der stå  11 på alle pladser ");
		System.out.println();
		udskrivArray(values);

		alleTal(values);
		System.out.println();
		System.out.println("Nedenfor skulle der stå  1.2.3 osv ");
		System.out.println();
		udskrivArray(values);

		opdaterRække(values, 3, 8);
		System.out.println();
		System.out.println("Nedenfor skulle der stå 8 på række 3");
		System.out.println();
		udskrivArray(values);

		opdaterColumn(values, 3, 8);
		System.out.println();
		System.out.println("Nedenfor skulle der stå 8 på søjle 3");
		System.out.println();
		udskrivArray(values);

		opdaterKant(values, 5);
		System.out.println();
		System.out.println("Nedenfor skulle der stå 5 i kanten");
		System.out.println();
		udskrivArray(values);

	}

}
