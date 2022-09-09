package opg1;

public class ArrangementApp {

	public static void main(String[] args) {

		Arrangement a1 = new Arrangement("Roskilde", true, 2000, 1000);

		Arrangement a2 = new Arrangement("Grøn Dag", false, 999, 50);

		Arrangement a3 = new Arrangement("Tivoli", true, 0, 50000);

		a1.addDeltager("John");
		a1.addDeltager("Nina");

		a2.addDeltager("MiniMe");
		a2.addDeltager("Wowo");
		a2.addDeltager("heyHeyHEY");

		a3.addDeltager("Stalin");

		System.out.println(a1.numOfAntendees());

		System.out.println(a2.numOfAntendees());

		System.out.println(a3.numOfAntendees());

	}

}
