package toDimArrays;

import java.util.Random;

public class Ex2 {
	private static String[] Correctlist = { "A", "A", "A", "A", "A", "B", "B", "B", "B", "B" };

	public static void main(String[] args) {

		String[][] list = { { "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 0
				{ "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 1
				{ "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 2
				{ "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 3
				{ "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 4
				{ "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 5
				{ "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 6
				{ "A", "B", "C", "D", "A", "B", "C", "D", "A", "A" }, // Student 7
		};

//		for (int i = 0; i < list.length; i++) {
//			for (int j = 0; j < list[i].length; j++) {
//				list[i][j]; 
//			}
//		}

		System.out.println(getResult(list, 0, 0));
	}

	public static Random getRandom(String[][] number, int row, int col) {
		Random getgenerator = new Random();
		for (row = 0; row < number.length; row++) {
			for (col = 0; col < number[row].length; col++) {
//				getgenerator = number[row][col];
			}
		}
		return null;

	}

	public static int getResult(String[][] number, int row, int col) {
		int result = 0;
		for (row = 0; row < number.length; row++) {
			for (col = 0; col < number[row].length; col++) {
				if (number[row][col] == Correctlist[col]) {
					result++;
				}

			}
		}
		return result;

	}
}
