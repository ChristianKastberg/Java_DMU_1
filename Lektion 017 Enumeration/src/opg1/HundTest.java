package opg1;

import java.util.ArrayList;

public class HundTest {

	public static void main(String[] args) {

		Hund h1 = new Hund("Fiddo", true, 100, Race.BOKSER);
		Hund h2 = new Hund("Weedo", true, 200, Race.PUDDEL);
		Hund h3 = new Hund("Winchester", false, 600, Race.BOKSER);
		Hund h4 = new Hund("Gun", false, 500, Race.TERRIER);
		Hund h5 = new Hund("Beauty", true, 3333, Race.TERRIER);

		ArrayList<Hund> hunde = new ArrayList<>();

		System.out.println(samletPris(hunde, Race.BOKSER));

	}

	public static int samletPris(ArrayList<Hund> hunde, Race race) {
		int result = 0;
		int number = 0;
		for (Hund hund : hunde) {
			number = hund.getPris();
			result += number;
		}
		return result;

	}

}
