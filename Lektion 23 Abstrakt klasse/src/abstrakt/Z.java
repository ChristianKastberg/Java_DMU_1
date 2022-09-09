package abstrakt;

public class Z extends A{
	private int z;
	
	public Z(int z) {
		super(0);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	@Override
	public int getSum() {
		return z * 2;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + "z: " + z;
	}
}
