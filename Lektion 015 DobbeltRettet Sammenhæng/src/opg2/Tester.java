package opg2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("Gabe", 69);
		Gift g1 = new Gift("TeddyBear", 100);
		g1.setPrice(70 - .31);
		p1.addGift(g1);
		System.out.println(p1.giftValue());
		System.out.println(p1.toString());
	}

}
