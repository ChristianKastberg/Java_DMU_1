package opg1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		System.out.println(Arrays.toString(numbers));

//		// changing each number in the array and printing it
		numbers[0] = 2;
		numbers[1] = 44;
		numbers[2] = -23;
		numbers[3] = 99;
		numbers[4] = 8;
		numbers[5] = -5;
		numbers[6] = 7;
		numbers[7] = 10;
		numbers[8] = 20;
		numbers[9] = 30;

		System.out.println("0 =" + numbers[0]);
		System.out.println("1 =" + numbers[1]);
		System.out.println("2 =" + numbers[2]);
		System.out.println("3 =" + numbers[3]);
		System.out.println("4 =" + numbers[4]);
		System.out.println("5 =" + numbers[5]);
		System.out.println("6 =" + numbers[6]);
		System.out.println("7 =" + numbers[7]);
		System.out.println("8 =" + numbers[8]);
		System.out.println("9 =" + numbers[9]);

		// creating and printing an array that goes from 0-9

		int[] numbers2 = new int[10];

		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = i;

//			System.out.println(numbers2[i]);
		}
		System.out.println(Arrays.toString(numbers2));

		int[] numbers3 = new int[10];
		for (int i = 0; i < numbers3.length; i++) {
			numbers3[i] = i + i;

		}
		System.out.println(Arrays.toString(numbers3));

		int[] numbers4 = new int[10];
		// 1 4 9 16 25 36...
		for (int i = 0; i < numbers4.length; i++) {

			numbers4[i] = (i + 1) * (i + 1);

		}
		System.out.println(Arrays.toString(numbers4));

		int[] numbers5 = new int[10];
		int count = 0;
		// 0 1 0 1 0 1...
		for (int i = 0; count < numbers5.length; count++) {
			numbers5[count] = i;

			if (i == 0) {
				i = 1;
			} else
				i = 0;
		}
		System.out.println(Arrays.toString(numbers5));

		int[] numbers6 = new int[10];
		// 0 1 2 3 4 0 1 2 3 4
		int i = 0;
		for (int count2 = 0; count2 < numbers6.length; count2++) {

			numbers6[count2] = i;
			i++;
			if (i == 5) {
				i = 0;
			}
		}
		System.out.println(Arrays.toString(numbers6));

		int[] numbers7 = new int[10];
		// 0 3 4 7 8 11 12 15 16 19
		// +3 then +1 then +3 then +1 etc
		int i2 = 0;
		for (int count3 = 0; count3 < numbers7.length; count3++) {

			numbers7[count3] = i2;
			if (i2 == 3 || i2 == 7 || i2 == 11 || i2 == 15) {
				i2++;
			} else
				i2 = i2 + 3;
		}
		System.out.println(Arrays.toString(numbers7));
	}

}
