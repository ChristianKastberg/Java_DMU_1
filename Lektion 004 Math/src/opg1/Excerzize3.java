package opg1;

public class Excerzize3 {

	public static void main(String[] arg) {

		String ord1 = "DATAMATIKER";

		String ord2 = "uddannelsen";

		System.out.println(ord1); // a
		System.out.println(ord2); // b
		System.out.println(ord1 + " " + ord2); // c'

		String ord3 = ord1 + " " + ord2;

		System.out.println(ord3); // d

		int Length = ord3.length();

		System.out.println(Length); // e

		String syv = ord1.substring(0, 7);

		System.out.println(syv); // f

		String middle = ord2.substring(2, 7);

		System.out.println(middle); // g

		String last = ord3.substring(7);

		System.out.println(last); // h

	}

}