package opg4;

public class Rektangel extends Figur {
	private int x;
	private int y;

	public Rektangel(int sideLængde, int diameter, int x, int y) {
		super(sideLængde, diameter);
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
