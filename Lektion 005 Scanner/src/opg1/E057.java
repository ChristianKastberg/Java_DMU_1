package opg1;

public class E057 {

	public static void main(String[] args) {

//		Write a program that reads three numbers and prints “increasing” if they are in increasing order,
//		“decreasing” if they are in decreasing order, and “neither” otherwise. Here, “increasing” means
//		“strictly increasing”, with each value larger than its predecessor.
//		The sequence 3 4 4 would not be considered increasing.

		int a = 3;
		int b = 2;
		int c = 1;

//		&& ||
		{
			if (a > b && b > c) {

				System.out.print("Decreasing order");

			} else if (a < b && b < c) {

				System.out.print("Increasing order");

			} else
				System.out.print("Neither");
			{

			}
		}
	}
}
