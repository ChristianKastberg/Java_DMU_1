package opg1;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1;
		char ch1, ch2;
		ch1 = 'A';
		System.out.println(ch1);
		ch2 = '3';
		System.out.println(3); // tester lige om alt virker - det gør det
		i1 = ch1;
		System.out.println(i1); // A er 65 i ASCII unicode og vi prøver at printe "A" som int variabel
		i1 = 66;
		System.out.println(i1); // her printes 66 fordi vi ændrer værdien fra 65-66
		ch2 = (char) i1;
		System.out.println(ch2); // her går vi tilbage til at printe et nr til char og 66 svarer til "B" i ASCII

	}

}
