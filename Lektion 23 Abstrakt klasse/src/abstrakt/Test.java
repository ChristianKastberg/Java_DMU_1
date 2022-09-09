package abstrakt;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
//		A a = new A(0);
		X x = new X(1, 2);
//		X x = new X(2);
		Y y = new Y(3, 4, 5);
		Z z = new Z(6);
		ArrayList<A> aer = new ArrayList<>();
		aer.add(x);
		aer.add(y);
		aer.add(z);
		int sum = sum(aer);
		System.out.println(sum);
	}
	
	private static int sum(ArrayList<A> aer) {
		int sum = 0;
		for (A a: aer) {
			sum += a.getSum();
			System.out.println(a);
		}
		return sum;
	}

}
