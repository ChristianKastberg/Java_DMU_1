package opg2;

public class TestBil {
	public static void main(String[] args) {
		Bil minBil;
		ElBil minElBil;
		minBil = new Bil();
		minBil.maerke = "Ford";
		minBil.vaegt = 1000;
//		minBil.farve = "Rød"; // farve er private man skal bruge en metode til at ændre den
		minElBil = new ElBil();
		minElBil.maerke = "Volvo";
		minElBil.vaegt = 1500;
//		minElBil.farve = "Sort"; // farve er private
//		minElBil = minBil; // objekter af klassen ElBil kan ikke konverteres til objekter af klassen bil
		minBil = new ElBil();
//		minBil.getOpladningsTid(); // getOpladningsTid() er en metode til Elbil som er en subKlasse af bil
		minBil.getFarve();
		if (minBil instanceof ElBil) {
			((ElBil) minBil).getOpladningsTid();
		}
	}
}