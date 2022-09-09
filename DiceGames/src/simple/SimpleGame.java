package simple;

import java.util.Scanner;

public class SimpleGame {

	/**
	 * Simulates playing one game of Simple.
	 */
	public void play() {
		Scanner scanner = new Scanner(System.in);
		DiceThrower thrower = new DiceThrower();
		int count = 0;
		int facevalue = 0;
		int countofacevalue6 = 0;
		int pairsvalue = 0;
		int maxsum = 0;
		int currentsum = 0;

		boolean finished = false;
		while (!finished) {
			// TODO: Roll dice, print roll description.

			thrower.roll();
			System.out.println(thrower.rollDescription());

			// countofacevalue

			int eyesvalue1 = thrower.DiceMethod1();
			int eyesvalue2 = thrower.DiceMethod2();
			if (eyesvalue1 == 6) {
				countofacevalue6++;
			}
			if (eyesvalue2 == 6) {
				countofacevalue6++;
			}

			// pairs

			if (eyesvalue1 == eyesvalue2) {
				pairsvalue++;
			}

			// maxsum
			currentsum = eyesvalue1 + eyesvalue2;
			if (currentsum >= maxsum) {
				maxsum = currentsum;
			}

			count++;
			facevalue = facevalue + thrower.sum();

			System.out.println("Roll again? (Y/n) ");

			String answer = scanner.nextLine();
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Y")) {
				thrower.getGenerator();

			}
			String answer2 = scanner.nextLine();
			if (answer2.equalsIgnoreCase("n")) {
				finished = true;
			}
		}
		scanner.close();

		System.out.printf("\nResults:\n");
		System.out.printf("---------\n");
		System.out.printf("number of times rolled:" + count);
		System.out.printf("\n");
		System.out.printf("sum = " + facevalue);
		System.out.printf("\n");
		System.out.printf("Average = " + (facevalue / count));
		System.out.printf("\n");
		System.out.printf("Number of 6's = " + countofacevalue6);
		System.out.printf("\n");
		System.out.printf("Number of Pairs = " + pairsvalue);
		System.out.printf("\n");
		System.out.printf("Maxsum = " + maxsum);
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("Thank you for playing Simple.");

//		System.out.printf(format, args);
//		System.out.printf(format, args);

		// TODO: Print all the results:
		// roll count, total of all face values, average sum in one roll,
		// count of face value 6, count of same face value on both dice,
		// max sum in one roll.
		// Use the method: System.out.printf().

	}

	/**
	 * Prints the rules of Simple.
	 */
	public void printRules() {
		System.out.println("=====================================================");
		System.out.println("Rules of Simple:");
		System.out.println("The player throws the 2 dice as long as he/she wants.");
		System.out.println("=====================================================");
	}

}
