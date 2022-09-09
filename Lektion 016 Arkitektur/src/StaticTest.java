
public class StaticTest {
	private int attribut = 123;

	public static void main(String[] args) {
		Klasse klasse = new Klasse();
		Klasse.statisk("på klassen");
		klasse.statisk("på et objekt af klassen");
//		Klasse.instans("på klassen");
		klasse.instans("på et objekt af klassen");
//		attribut += 1;
	}

}
