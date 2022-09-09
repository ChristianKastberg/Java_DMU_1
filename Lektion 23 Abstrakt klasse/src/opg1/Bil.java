package opg1;

public class Bil {
	public String maerke;
	protected int vaegt;
	private String farve;

	private Bil(String maerke, int vaegt, String farve) {
		this.maerke = maerke;
		this.vaegt = vaegt;
		this.farve = farve;
	}

	public Bil() {
		this("Ukendt", -1, "Hvid"); // Kalder constructor
		// med parameter
	}
}
