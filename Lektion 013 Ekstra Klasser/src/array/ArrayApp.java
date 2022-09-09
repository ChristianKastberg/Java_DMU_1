package array;

public class ArrayApp {

	public static void main(String[] args) {
		int[] tabel = new int[10];
		tabel[0] = 45;
		tabel[1] = 27;
		tabel[2] = -12;
		tabel[3] = 15;
		tabel[4] = -8;
		tabel[5] = -4;

		tabel[3] = 20;

		// move the elements one step to the right and insert 17 at tabel[2]
		for (int i = tabel.length - 1; i >= 3; i--) {
			tabel[i] = tabel[i - 1];
		}
		tabel[2] = 17;

		// slet element på index 1 de andre elementer rykker til venstre
		for (int i = 1; i < tabel.length - 1; i++) {
			tabel[i] = tabel[i + 1];
		}

		// tilføj 29 baggerst i arrayet 
		int i = 0;
		while (tabel[i] != 0) {
			i++;
		}
		tabel[i] = 29;

		// Alternativ intialisering og oprettelse
		// int[] tabel = {45, 27, -12, 15, -8, -4, 0, 0, 0, 0};

		// Giver ikke det ønskede
//		System.out.println(tabel);

		// Arrays klassen har en metode der hjælper
//		System.out.println(Arrays.toString(tabel));

		udskriv(tabel);
//		udskriv2(tabel);
//		System.out.println();
//		udskrivBagFra(tabel);
	}

	public static void udskriv(int[] liste) {
		for (int tal : liste) {
			System.out.println(tal);
		}
	}

	public static void udskriv2(int[] liste) {
		for (int i = 0; i < liste.length; i++) {
			int tal = liste[i];
			System.out.println(tal);
		}
	}

	public static void udskrivBagFra(int[] liste) {
		for (int i = liste.length - 1; i >= 0; i--) {
			int tal = liste[i];
			System.out.println(tal);
		}
	}

	/**
	 * Returns the sum of all numbers in the list. Returns 0 if the list is empty.
	 */
	public static int sum(int[] liste) {
		return -1;
	}

	/**
	 * Returns the minimum of all numbers in the list. Requires: The list is not
	 * empty.
	 */
	public static int minimum(int[] liste) {
		return -1;
	}

	/**
	 * Returns the maximum of all numbers in the list. Requires: The list is not
	 * empty.
	 */
	public static int maximum(int[] liste) {
		return -1;
	}

	/** Returns the number of negative numbers in the list. */
	public static int negative(int[] liste) {
		return -1;
	}

	/** Returns a new array containing the positive numbers in the list. */
	public static int[] positive(int[] liste) {
		return null;
	}

}
