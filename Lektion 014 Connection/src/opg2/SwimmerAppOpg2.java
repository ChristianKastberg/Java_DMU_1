package opg2;

import java.util.ArrayList;

/*
 * Opgave 2 
	her går ud på at vende navigeringen i opgave 1 om, så det nu er træningsplanen der kender 

	a. Implementer associeringen, givet at der kun er brug for at finde de tilknyttede svømmere ud 
		fra træningsplanen – ikke den anden vej! Hent inspiration i noten afsnit 2. 
	b. Lav en ny SwimmerApp klasse, som opretter to svømmere og en træningsplan og sætter 
		svømmerne som svømmere på planen. 
	c. Udvid SwimmingApp-klassen, så du ud fra træningsplanen finder de svømmere, som er 
		tilknyttet planen, og udskriver informationer om hver svømmer på skærmen.
	
 */

public class SwimmerAppOpg2 {

	public static void main(String[] args) {

		ArrayList<Double> lapTimes = new ArrayList<>();
		lapTimes.add(1.02);
		lapTimes.add(1.01);
		lapTimes.add(0.99);
		lapTimes.add(0.98);
		lapTimes.add(1.02);
		lapTimes.add(1.04);
		lapTimes.add(0.99);
		SwimmerOpg2 s1 = new SwimmerOpg2("Jan", 1994, lapTimes, "AGF");

		lapTimes = new ArrayList<>();
		lapTimes.add(1.05);
		lapTimes.add(1.01);
		lapTimes.add(1.04);
		lapTimes.add(1.06);
		lapTimes.add(1.08);
		lapTimes.add(1.04);
		lapTimes.add(1.02);
		SwimmerOpg2 s2 = new SwimmerOpg2("Bo", 1995, lapTimes, "Lyseng");

		lapTimes = new ArrayList<>();
		lapTimes.add(1.03);
		lapTimes.add(1.01);
		SwimmerOpg2 s3 = new SwimmerOpg2("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");

		TrainingPlanOpg2 planA = new TrainingPlanOpg2('A', 16, 10);
		TrainingPlanOpg2 planB = new TrainingPlanOpg2('B', 10, 6);
		TrainingPlanOpg2 planC = new TrainingPlanOpg2('C', 8, 2);

		planA.addSwimmer(s1);
		planA.addSwimmer(s3);
		planB.addSwimmer(s2);

		System.out.println(planA);
		System.out.println(planB);
		System.out.println(planC);
	}

}
