package interfaces;

public class X extends A {
	private int x;

	public X(int a, int x) {
		super(a);
		this.x = x;
	}
	
	public X(int x) {
		this(0, x);
	}

	public int getX() {
		return x;
	}

	@Override
	public int getSum() {
		return x;
	}
}
