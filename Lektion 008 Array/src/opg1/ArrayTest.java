package opg1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 7, 2, 3 };
		System.out.println("Sum1 = " + sum(arr));

		double[] arr1 = { 0.4, 0.3, 7.7, 8.9, 12.4 };
		System.out.println("Sum2 = " + summ(arr1));

		int[] arr2 = { 4, 6, 7, 2, 3 };
		int[] arr3 = { 4, 6, 8, 2, 6 };
		System.out.println("Sum3 = " + Arrays.toString(summm(arr2, arr3)));

		int[] arr4 = { 1, 2, 3 };
		int[] arr5 = { 1, 2, 3, 4 };
		System.out.println("Sum4 = " + Arrays.toString(summmm(arr4, arr5)));

		int[] even = { 2, 4, 6, 8 };
		int[] evens = { 3, 5, 5, 9 };
		int[] event = { 7, 15, 17, 2, 6 };

		// Testing hasUneven
		System.out.println("Uneven1 = " + hasUneven(even));
		System.out.println("Uneven2 = " + hasUneven(evens));
		System.out.println("Uneven3 = " + hasUneven(event));

		// ting fra bogen hvorfor er a ikke [x, z] og b [x, y]??!?
		ArrayList<String> a = new ArrayList<String>();
		a.add("x");
		ArrayList<String> b = a;
		b.add("y");
		a.add("z");
		System.out.println(a + " " + b);

	}

// Method for finding the sum of an array += is shorthand for sum = sum + t[i]
	public static int sum(int[] t) {
		int sum = 0;
		for (int i = 0; i < t.length; i++) {
			sum += t[i];
		}
		return sum;
	}

	// Method for finding the double sum of an array
	public static double summ(double[] t) {
		double summ = 0;
		for (int i = 0; i < t.length; i++) {
			summ += t[i];
		}
		return summ;

	}

	// Method for adding two arrays together
	public static int[] summm(int[] a, int[] b) {
		int[] summm = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			summm[i] = a[i] + b[i];
		}

		return summm;

	}

	// Method That works for arrays of different lengths
	// Math.max returner the greater of two int values - from docs.oracle
	public static int[] summmm(int[] a, int[] b) {
		int[] summmm = new int[Math.max(a.length, b.length)];
		for (int i = 0; i < a.length; i++) {
			if (a.length > i && b.length > i) {
				summmm[i] = a[i] + b[i];
			} else if (a.length > b.length) {
				summmm[i] = a[i];
			} else if (a.length < b.length) {
				summmm[i] = b[i];
			}

		}
		return summmm;

	}

	// Method for testing if the array is even or uneven
	// % 2 !=0 is key all even numbers divided by 2 = 0
	public static boolean hasUneven(int[] t) {

		boolean hasUneven = false;
		for (int i = 0; i < t.length; i++) {
			if (t[i] % 2 != 0) {
				hasUneven = true;
			}

		}
		return hasUneven;
	}
}
