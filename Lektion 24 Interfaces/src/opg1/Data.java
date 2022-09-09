package opg1;

import java.util.ArrayList;

public class Data {

	public static double max(Measurable[] objects) {
		double max = 0;
		for (Measurable obj : objects) {
			if (max < obj.getMeasure()) {
				max = obj.getMeasure();

			}
		}
		return max;
	}

	public static double avg(Measurable[] objects) {
		double sum = 0;

		for (Measurable obj : objects) {
			sum = sum + obj.getMeasure();
		}
		if (objects.length > 0) {
			return sum / objects.length;
		} else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chilli c1 = new Chilli("peper", 200);
		Chilli c2 = new Chilli("peper", 400);
		Chilli c3 = new Chilli("peper", 500);
		Chilli c4 = new Chilli("peper", 700);
		Chilli c5 = new Chilli("peper", 900);
		Measurable[] listy = new Measurable[4];
		listy[0] = c1;
		listy[1] = c2;
		listy[2] = c3;
		listy[3] = c4;

		System.out.println(Data.avg(listy));
		System.out.println(Data.max(listy));

		// IT FUCKING WORKS YESSSSSSS

	}

}
