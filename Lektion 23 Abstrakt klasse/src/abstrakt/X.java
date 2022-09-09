package abstrakt;

//public final class X extends A {
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
//	public final int getSum() {
	public int getSum() {
		return x;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + "x: " + x;
	}
}
