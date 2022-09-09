package opg4;

public abstract class Figur {
	public int sideLængde;
	private int diameter;

	protected Figur(int sideLængde, int diameter) {
		this.sideLængde = sideLængde;
		this.diameter = diameter;
	}

	public int getSideLængde() {
		return sideLængde;
	}

	public void setSideLængde(int sideLængde) {
		this.sideLængde = sideLængde;
	}

	public int getdiameter() {
		return diameter;
	}

	public void setdiameter(int diameter) {
		this.diameter = diameter;
	}

	public int calcRadius(int diamter) {
		return diameter / 2;
	}

// Måske skal den ligge under Kvadrat klassen i stedet?
//	public void Areal() {
//		System.out.println(sideLængde * sideLængde);
//
//	}

}
