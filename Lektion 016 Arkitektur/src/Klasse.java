
public class Klasse {
	private int attribut = 123;
	private static int statiskAttribut = 456;

	public static void statisk(String tekst) {
		System.out.println("statisk() kaldt " + tekst);
//		instans("fra en static metode på klassen);
//		attribut +=1;
		statiskAttribut +=1;
	}
	public void instans(String tekst) {
		System.out.println("instans() kaldt " + tekst);
		statisk("fra en instans metode på klassen");
		attribut +=1;
		statiskAttribut +=1;
	}
}
