package pigs;

import java.util.Scanner;
import pigs.DiceThrower;

public class PigsGame {

	public void play() {

		Scanner scanner = new Scanner(System.in);
		DiceThrower thrower1 = new DiceThrower();
		DiceThrower thrower2 = new DiceThrower();

//variables
		int player1currentscore = 0;
		int player1totalscore = 0;
		int player2currentscore = 0;
		int player2totalscore = 0;
		boolean player1turn = true;
		boolean player2turn = false;

//Loop
		boolean finished = false;
		while (!finished) {

//player1 turn loop
			if (player1turn == true) {

				player2turn = false;
				String answer = scanner.nextLine();
				if (answer.equalsIgnoreCase("y")) {
					thrower1.getGenerator();
				}

//player1 roll
				thrower1.roll();
				System.out.println("player1 rolled: " + thrower1.rollDescription());

				player1currentscore = player1currentscore + thrower1.DiceMethod1();

//face value = 1  	
				if (thrower1.DiceMethod1() == 1) {
					player1currentscore = 0;
					System.out.println("");
					System.out.println("player 1's total score: " + player1totalscore);
					System.out.println("");
					System.out.println("");
					System.out.println("Player 2 is up. Press (Y)/Enter to start");
				}

				System.out.println("player1's current round score = " + player1currentscore);
				System.out.println("roll again (Y/n)?");

				if (answer.equalsIgnoreCase("n")) {
					System.out.println("");
					player1totalscore = player1totalscore + player1currentscore;
					System.out.println("player 1's total score: " + player1totalscore);
					System.out.println("");
					System.out.println("");
					System.out.println("Player 2 is up. Press (Y)/Enter to start");
					player1turn = false;
					player2turn = true;

					while (player2turn == true) {

//player2 turn loop

						player1turn = false;
						String answer2 = scanner.nextLine();
						if (answer2.equalsIgnoreCase("y")) {
							thrower2.getGenerator();
						}

//player2 roll
						thrower2.roll();
						System.out.println("player2 rolled: " + thrower2.rollDescription());

						player2currentscore = player2currentscore + thrower2.DiceMethod1();
						System.out.println("player2's current round score = " + player2currentscore);

						System.out.println("roll again (Y/n)?");

						if (thrower2.DiceMethod1() == 1) {
							player2currentscore = 0;
							player1turn = true;
							player2turn = false;
							System.out.println("player 2's total score: " + player2totalscore);
							System.out.println("");
							System.out.println("");
							System.out.println("Player 1 is up. Press (Y)/Enter to start");
						}

//end turn  	
						if (answer2.equalsIgnoreCase("n")) {
							System.out.println("");
							player2totalscore = player2totalscore + player2currentscore;
							System.out.println("player 2's total score: " + player2totalscore);
							System.out.println("");
							System.out.println("");
							System.out.println("Player 1 is up. Press (Y)/Enter to start");
							player1turn = true;
							player2turn = false;
						}

						System.out.println("test");

					}
				}

			}

		}

		scanner.close();
	}

	public void printGameWon() {
		System.out.println("Wow you actually did it");
	}

	public void printGameLost() {
		System.out.println("GG EZ lulwut");
	}

	public void printrules() {
		System.out.println("End my suffering pls");
	}
}
