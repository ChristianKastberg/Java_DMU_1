package arraylist;

import java.util.ArrayList;

public class Opg2 {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();

		liste.add("Ford");
		liste.add("VW");
		liste.add("Fiat");
		liste.add("Opel");
		liste.add("Peugot");

		System.out.println(antal4(liste));
		System.out.println(forantal4(liste));
		upperCase(liste);
	}

	public static int antal4(ArrayList<String> biler) {

		int count = 0;

		for (String s : biler) {
			if (s.length() <= 4) {
				count++;

			}
		}

		return count;
	}

	public static int forantal4(ArrayList<String> biler) {
		int count = 0;
		String s = "";
		for (int i = 0; i < biler.size(); i++) {
			s = biler.get(i);
			if (s.length() <= 4) {
				count++;
			}
		}

		return count;

	}

	public static void skub(ArrayList<String> list) {
		String old = list.get(0);
		list.remove(0);
		list.add(old);
	}

	public static void upperCase(ArrayList<String> list) {
		for (String s : list) {
			System.out.println(s.toUpperCase());
		}
	}

}
