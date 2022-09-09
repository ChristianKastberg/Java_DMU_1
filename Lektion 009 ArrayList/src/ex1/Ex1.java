package ex1;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {

		// ArrayList tests add, remove, set etc

		ArrayList<String> names = new ArrayList<>();

		names.add("Hans");
		names.add("Viggo");
		names.add("Jens");
		names.add("Bente");
		names.add("Bent");

//		System.out.println(names);

		names.add(1, "Jane");

//		System.out.println(names);

		names.remove(0);

		names.add(0, "pia");

		names.add(6, "ib");

//		System.out.println(names);

		names.set(1, "Hansi");

//		System.out.println(names.size());

//		System.out.println(names);

		// for statement ArrayList
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
//			System.out.println(name);

		}
		// for-each Statement ArrayList
		for (String s : names) {
			System.out.println(s);
		}

	}

}
