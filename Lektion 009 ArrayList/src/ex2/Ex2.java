package ex2;

import java.util.ArrayList;

public class Ex2 {

	// Use for-each loops in all the methods

	/**
	 * Tests all the methods.
	 */
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(12);
		ints.add(0);
		ints.add(45);
		ints.add(7);
		ints.add(-16);
		ints.add(0);
		ints.add(23);
		ints.add(-10);
//        ints.addAll(Arrays.asList(12, 0, 45, 7, -16, 0, 23, -10));
		System.out.println("ints: " + ints);
		System.out.println("sum: " + sum(ints));
		System.out.println("minimum: " + minimum(ints));
		System.out.println("maximum: " + maximum(ints));
		System.out.println("average: " + average(ints));
		System.out.println("Num of Zeroes: " + zeroes(ints));
	}

	// Test of sum() method: correct sum is 61.
	public static int sum(ArrayList<Integer> list) {
		int sum = list.get(0);
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

	// Test of minimum() method: correct minimum is -16.
	public static int minimum(ArrayList<Integer> list) {
		int minimum = list.get(0);
		for (int i : list) {
			if (i < minimum) {
				minimum = i;
			}

		}
		return minimum;

	}

	// Test of maximum() method: correct maximum is 45.
	public static int maximum(ArrayList<Integer> list) {
		int maximum = list.get(0);
		for (int i : list) {
			if (i > maximum) {
				maximum = i;
			}

		}
		return maximum;
	}

	// Test of average() method: correct average is 7.625.
	public static double average(ArrayList<Integer> list) {
		double sum = 0;
		double average = 0;
		double count = 0;
		for (double i : list) {
			sum += i;
			count++;
		}
		average = sum / count;
		return average;
	}

	// Test of zeroes() method: correct number of zeroes is 2.
	public static int zeroes(ArrayList<Integer> list) {
		int zeroes = 0;
		for (int i : list) {
			if (i == 0) {
				zeroes++;
			}
		}
		return zeroes;
	}

	// Test of evens() method: correct result is [12, 0, -16, 0, -10].
	public static ArrayList<Integer> evens(ArrayList<Integer> list) {
		for (int i : list) {
			if (i % 2 != 0) {
			}

		}
		return null;

	}

	// sum made with for statement
	public static int sum1(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			int number = list.get(i);
			sum = sum + number;
		}
		return sum;
	}

}
