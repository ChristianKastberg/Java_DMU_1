package searching;

import java.util.ArrayList;

public class SearchTest {

	public static void main(String[] args) {
		Player p1 = new Player("Dave", 180, 82, 7);
		Player p2 = new Player("Bob", 190, 87, 6);
		Player p3 = new Player("Marty", 172, 55, 5);
		Player p4 = new Player("Rick", 190, 88, 4);
		Player p5 = new Player("Whax", 100, 62, 3);
		Player p6 = new Player("Gurblotron", 140, 32, 2);
		Player p7 = new Player("Nickiii", 170, 87, 11);
		Player p8 = new Player("Coaca chum chum", 220, 40, 29);

		Player[] p = { p1, p2, p3, p4, p5, p6, p7, p8 };

		int[] i = { 2, 4, 6, 8, 10, 12, 14 };
		int[] j = { 1, 3, 5, 7, 9, 10, 16 };
		// must return 14
		int[] k = { 7, 56, 34, 3, 7, 14, 13, 4 };
		int[] h = { 7, 56, 34, 3, 7, 14, 14, 4 };

//		System.out.println(linearSearchArray(j));
//		System.out.println(linearSearch15(k));
		System.out.println(linearSearchAdj(i));
	}

	// ex 1 return true if an uneven number exsists in an array
	public static boolean linearSearchArray(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int k = arr[i];
			if (k % 2 != 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	// ex 2 finds the first sequence of [10 - 15] in an array return true if found
	public static int linearSearch15(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int k = arr[i];
			if (k == 10 || k == 11 || k == 12 || k == 13 || k == 14 || k == 15) {
				return k;
			}
			i++;
		}
		return -1;
	}

	// ex 3 returns true if two adjacent numbers are the same
	// this method always returns true if 0 is a part of the tested array...
	public static boolean linearSearchAdj(int[] arr) {
		int i = 0;
		int j = 0;
		while (i < arr.length) {
			int k = arr[i];

			if (k == j) {
				return true;
			}
			i++;
			j = arr[i - 1];
		}

		return false;

	}

	// ex 4 search through the Player class with a given number of goals scored
	public static boolean linearSearchPlayers(Player[] arr) {
		int i = 0;
		while (i < arr.length) {
			Player k = arr[i];
		}
		return true;
	}
}
