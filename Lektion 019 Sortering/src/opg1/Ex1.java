package opg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex1 {

	// ex1 bubbleSort that can sort Strings compareTo
	public static void bubbleSort(String[] str) {

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[j].compareTo(str[i]) < 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

	// ex 2 Selection sort
	public static void selectionSort(String[] str) {
		for (int i = 0; i < str.length - 1; i++) {
			int indexOfMin = i;
			for (int j = i + 1; j < str.length; j++) {
				if (str[j].compareTo(str[indexOfMin]) < 0) {
					indexOfMin = j;
				}
			}
			if (indexOfMin != i) {
				String temp = str[i];
				str[i] = str[indexOfMin];
				str[indexOfMin] = temp;
			}
		}
	}

	// ex 2 pt 2 Same gimmick but with a Customer class
	public static void selectionSortCus(Customer[] str) {
		for (int i = 0; i < str.length - 1; i++) {
			int indexOfMin = i;
			for (int j = i + 1; j < str.length; j++) {
				if (str[j].customerCompare(str[indexOfMin]) < 0) {
					indexOfMin = j;
				}
			}
			if (indexOfMin != i) {
				Customer temp = str[i];
				str[i] = str[indexOfMin];
				str[indexOfMin] = temp;
			}
		}
	}

	// ex 3 Insertion sort with String
	public static void insertionSort(String[] str) {

		for (int i = 1; i < str.length; i++) {
			String temp = str[i];

			int j = i - 1;
			while (j >= 0 && temp.compareTo(str[j]) < 0) {
				str[j + 1] = str[j];
				j--;
			}
			str[j + 1] = temp;
		}
	}

	// ex 3 pt 2 Insertion sort with Customer
	public static void insertionSortCus(Customer[] str) {

		for (int i = 1; i < str.length; i++) {
			Customer temp = str[i];

			int j = i - 1;
			while (j >= 0 && temp.customerCompare(str[j]) < 0) {
				str[j + 1] = str[j];
				j--;
			}
			str[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		String[] s = { "c", "b", "a", "k", "x", "y", "a", "h", "z", "b", "g", "c", "i" };
		String[] s0 = { "c", "b", "a" };
		String[] s1 = { "c", "b", "a" };
		String[] s2 = { "c", "b", "a" };

		Customer c1 = new Customer("gary", 5000);
		Customer c2 = new Customer("gary1", 4999);
		Customer c3 = new Customer("gary2", 4998);
		Customer[] cus = { c1, c2, c3 };
		Customer[] cus1 = { c1, c2, c3 };

		// BubbleSort
		System.out.println("UNSORTED");
		System.out.println(Arrays.toString(s));
		System.out.println();

		bubbleSort(s);

		System.out.println("SORTED bubble");
		System.out.println(Arrays.toString(s));
		System.out.println();
//		// SelectionSort
//		System.out.println("UNSORTED");
//		System.out.println(Arrays.toString(s0));
//		System.out.println();
//
//		selectionSort(s0);
//
//		System.out.println("SORTED selectionSort");
//		System.out.println(Arrays.toString(s0));
//		System.out.println();
//		// SelectionSortCus
//		System.out.println("UNSORTED");
//		System.out.println(Arrays.toString(cus));
//		System.out.println();
//
//		selectionSortCus(cus);
//
//		System.out.println("SORTED selectionSortCus");
//		System.out.println(Arrays.toString(cus));
//		System.out.println();
//		// InsertionSort
//		System.out.println("UNSORTED");
//		System.out.println(Arrays.toString(s2));
//		System.out.println();
//
//		insertionSort(s2);
//
//		System.out.println("SORTED insertionSort");
//		System.out.println(Arrays.toString(s2));
//		System.out.println();
//		// InsertionSortCus
//		System.out.println("UNSORTED");
//		System.out.println(Arrays.toString(cus1));
//		System.out.println();
//
//		insertionSortCus(cus1);
//
//		System.out.println("SORTED insertionSortCus");
//		System.out.println(Arrays.toString(cus1));
//		System.out.println();

		// everything works yay :D except for that darn excercise 4 of course >_<

		Random r = new Random();
		int[] ints = r.ints(1000, 1, 10000).toArray();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int e : ints) {
			numbers.add(e);
		}
		// ex 4
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		bubbleSort(s);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
	}
}
