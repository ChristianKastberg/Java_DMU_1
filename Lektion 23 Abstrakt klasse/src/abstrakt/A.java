package abstrakt;

public abstract class A {
	private int a;
	
	protected A(int a) { // protected
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public abstract int getSum();
	
	@Override
	public String toString() {
		return "a: " + a;
	}
}
