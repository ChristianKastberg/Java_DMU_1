package interfaces;

import java.util.Comparator;

public class C implements Comparator<X> {
	
	@Override
	public int compare(X enX1, X enX2) {
		return enX1.getA() -enX2.getA();
	}
}
