package opg1;

public class Excersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1, i2, a = 4, b = 11, c = 2;
		double d1, d2, r = 4.0, s = 11.0, t = 2.0;

		i1 = b / a;
		System.out.println(i1); // 11/4 = 2 double skal bruges for korrekt resultat
		c = (int) (s / r);
		System.out.println(c); // 11.0/4.0 = 2 (int) bruges i stedet for double
		d1 = b / a;
		System.out.println(d1); // 11/4 = 2.0 double bruges korrekt men der skal være en 11.0 eller 4.0
		d2 = s / r;
		System.out.println(d2); // 11.0/4.0 = 2.75 her bruges double korrekt
		d1 = b / r;
		System.out.println(d1); // 11/4.0 = 2.75 kun en behøves at vøre 4.0 for at double virker
		d2 = 11.0 / 4.0;
		System.out.println(d2); // 11.0/4.0 = 2.75 same same
		d1 = 11.0 / a * c;
		System.out.println(d1); // 11.0/4*2 = 2.75*2 = 5.5 det virker så længe en af tallene er 11.0
		i1++;
		System.out.println(i1); // 2+1=3
		i1 += 4;
		System.out.println(i1); // 3+4=7
		i1 = b % a;
		System.out.println(i1); // 11%3 = 3 % tager det sidste tal dunno hvordan % virker helt
		i1 = 3 + 7 * 2;
		System.out.println(i1); // 3+7*2 = 14+3 = 17
		i2 = (3 + 7) * 2;
		System.out.println(i2); // (3+7)*2 = 20

//		System.out.println(i2);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(r);
//		System.out.println(s);
//		System.out.println(t);

	}

}
