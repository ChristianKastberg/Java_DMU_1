package toDimArrays;

public class Ex1 {

	public static void main(String[] args) {

		int[][] list = { { 0, 4, 3, 9 }, { 6, 1, 3, 5 }, { 2, 2, 3, 3 }, { 1, 0, 1, 0 }, { 0, 9, 7, 1 } };

//		print(list);
		setValueAt(list, 1, 1, 53);
		System.out.println(getValueAt(list, 1, 1));
		System.out.println(sumRow(list, 4));
		System.out.println(sumColumn(list, 3));
		System.out.println(sum(list));
	}

	public static void print(int[][] numbers) {

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");

			}
			System.out.println();
		}
	}

	public static int getValueAt(int[][] numbers, int row, int col) {

		return numbers[row][col];

	}

	public static void setValueAt(int[][] numbers, int row, int col, int value) {

		numbers[row][col] = value;
	}

	public static int sumRow(int[][] numbers, int row) {
		int sum = 0;
		for (int col = 0; col < numbers[row].length; col++) {
			sum += numbers[row][col];
		}
		return sum;

	}

	public static int sumColumn(int[][] numbers, int col) {
		int sum = 0;
		for (int row = 0; row < numbers[col].length; row++) {
			sum += numbers[row][col];
		}
		return sum;
	}

	public static int sum(int[][] numbers) {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				total = total + numbers[i][j];
			}
		}
		return total;
	}
}
