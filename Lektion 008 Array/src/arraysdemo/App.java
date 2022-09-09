package arraysdemo;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// create an array to contain 10 integers
		// all integers are initialized to 0
		int[] numbers = new int[10];

		// print the values in the array
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		// fill the array with new values
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		// read value at index 5
		int x = numbers[5];
		System.out.println("5: " + x);
		System.out.println();

		// set value at index 5
		numbers[5] = 55;
		System.out.println("5: " + numbers[5]);
		System.out.println();

		// print the indices
		System.out.print("Index:  ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%5d", i);
		}
		System.out.println();

		// print the values
		System.out.print("Values: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%5d", numbers[i]);
		}
		System.out.println();
		System.out.println();

		// add 5 to each value
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * numbers[i];
		}

		// print the values
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		// easy initialization of an array with given values
		int[] evens = { 2, 4, 6, 8, 10 };
		System.out.println(Arrays.toString(evens));
		System.out.println();

		// ---------------------------------------------------------------------
		System.out.println("-----------------");

		// create an array to contain 6 strings
		// all strings are initialized to null
		String[] names = new String[6];
		System.out.println(Arrays.toString(names));
		System.out.println();

		// fill the array and print
		names[0] = "John";
		names[1] = "Poul";
		names[2] = "Georg";
		names[3] = "Ringo";
		System.out.println(Arrays.toString(names));
		System.out.println();

		// print only the used entries
		int nextFree = 4;
		for (int i = 0; i < nextFree; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		System.out.println();

		// add a new value at the of the used entries
		names[nextFree] = "Epstein";
		nextFree++;
		System.out.println(Arrays.toString(names));
	}
}
