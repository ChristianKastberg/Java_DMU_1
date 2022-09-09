package interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		X x = new X(1, 2);
		Y y = new Y(3, 4, 5);
		Z z = new Z(6);
		ArrayList<I> ier = new ArrayList<>();
		ier.add(x);
		ier.add(y);
		ier.add(z);
		System.out.println(sum(ier));
		
		ArrayList<X> xer = new ArrayList<>();
		xer.add(new Y(2, 3, 7));
		xer.add(x);
		xer.add(y);
		System.out.println(xer);
		Collections.sort(xer);
		System.out.println(xer);
		Collections.sort(xer, new C());
		System.out.println(xer);
	}
	
	private static int sum(ArrayList<I> ier) {
		int sum = 0;
		for (I i: ier) {
			sum += i.getSum();
			System.out.println(i);
		}
		return sum;
	}

}
