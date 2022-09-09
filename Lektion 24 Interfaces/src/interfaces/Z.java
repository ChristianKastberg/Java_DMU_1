package interfaces;

public class Z implements I {
	private int z;
	
	public Z(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	@Override
	public int getSum() {
		return z;
	}

	@Override
	public String toString() {
		return "z: " + z + ", sum: " + getSum();
	}
}
