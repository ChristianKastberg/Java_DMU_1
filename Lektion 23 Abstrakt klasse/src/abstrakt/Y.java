package abstrakt;

public class Y extends X {
	int y;
	
	public Y(int a, int x, int y) {
		super(a, x);
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	@Override
	public int getSum() {
		return super.getSum() + y;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + "y: " + y;
	}
}
