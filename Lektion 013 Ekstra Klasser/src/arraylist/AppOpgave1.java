package arraylist;

import java.util.ArrayList;

public class AppOpgave1 {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(45);
		liste.add(27);
		liste.add(-12);
		liste.add(15);
		liste.add(-8);
		liste.add(-4);
//		System.out.println(liste);
//		udskriv(liste);
//		udskriv2(liste);
//		System.out.println();
//		udskrivBagfra(liste);
		System.out.println(sum(liste));
		System.out.println(minimum(liste));
		System.out.println(maximum(liste));
		System.out.println(average(liste));
		System.out.println(negative(liste));
		System.out.println(positive(liste));
	}

	public static void udskriv(ArrayList<Integer> list) {
		for (int tal : list) {
			System.out.println(tal);
		}
	}

	public static void udskriv2(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int tal = list.get(i);
			System.out.println(tal);
		}
	}

	public static void udskrivBagfra(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			int tal = list.get(i);
			System.out.println(tal);
		}
	}

	/**
	 * Returns the sum of all numbers in the list. Returns 0 if the list is empty.
	 */
	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int tal : list) {
			sum += tal;
		}
		return sum;
	}

	public static int sum1(ArrayList<Integer> list) {
		int sum = 0;
		int tal = 0;
		for (int i = 0; i < list.size(); i++) {
			tal = list.get(i);
			sum += tal;
		}

		return sum;
	}

	public static int minimum(ArrayList<Integer> list) {
		int min = list.get(0);
		for (int tal : list) {
			if (tal < min) {
				min = tal;
			}
		}
		return min;
	}

	public static int minimum1(ArrayList<Integer> list) {
		int min = list.get(0);
		int tal = 0;
		for (int i = 0; i < list.size(); i++) {
			tal = list.get(i);
			if (tal < min) {
				min = tal;
			}
		}
		return min;
	}

	public static int maximum(ArrayList<Integer> list) {

		int max = list.get(0);
		for (int tal : list) {
			if (tal > max) {
				max = tal;
			}
		}
		return max;
	}

	public static double average(ArrayList<Integer> list) {
		double sum = 0;
		for (double tal : list) {
			sum += tal;

		}

		return sum / list.size();
	}

	public static int negative(ArrayList<Integer> list) {
		int count = 0;
		for (int tal : list) {
			if (tal < 0) {
				count++;
			}
		}
		return count;
	}

	public static ArrayList<Integer> positive(ArrayList<Integer> list) {
		ArrayList<Integer> pos = new ArrayList<Integer>();
		for (int tal : list) {
			if (tal >= 0) {
				pos.add(tal);

			}

		}

		return pos;
	}

}
