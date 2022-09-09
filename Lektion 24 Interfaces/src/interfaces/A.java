package interfaces;

public abstract class A implements I, Comparable<A> {
	private int a;
	
	protected A(int a) { // protected
		this.a = a;
	}
	
	public int getA() {
		return a;
	}

	@Override
	public int compareTo(A enA) {
		return getSum() - enA.getSum();
	}

	@Override
	public String toString() {
		return "a: " + a + ", sum: " + getSum();
	}
}
