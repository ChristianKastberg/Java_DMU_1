package pigsgame;

import java.util.Scanner;
import pigsgame.DiceThrower;

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
				if (player1turn == true) {
					thrower1.roll();
					System.out.println("player1 rolled: " + thrower1.rollDescription());

					player1currentscore = player1currentscore + thrower1.methodEyes1();
				}

//player 1: face value = 1  	
				if (thrower1.methodEyes1() == 1 && player1turn == true) {
					player1currentscore = 0;
					System.out.println("");
					System.out.println("player 1's total score: " + player1totalscore);
					System.out.println("");
					System.out.println("");
					System.out.println("Player 2 is up. Press (Y)/Enter to start");
					player1turn = false;
					player2turn = true;
				}

//Player1 Win-condition #2  
				if (player1totalscore >= 100 && player1turn == true) {
					printGameWon();
					finished = true;
					break;
				}

				else if (player1currentscore >= 100 && player1turn == true) {
					printGameWon();
					finished = true;
					break;
				}

				else if ((player1totalscore + player1currentscore) >= 100 && player1turn == true) {
					printGameWon();
					finished = true;
					break;
				}

				if (player1turn == true) {
					System.out.println("player1's current round score = " + player1currentscore + "     you need ("
							+ (100 - (player1currentscore + player1totalscore)) + ") more points to win");
					System.out.println("player1's total score = " + player1totalscore);
					if (finished != true) {
						System.out.println("roll again (Y/n)?");
					}
				}

				if (answer.equalsIgnoreCase("n") && player1turn == true) {
					System.out.println("");
					player1totalscore = player1totalscore + player1currentscore;
					System.out.println("player 1's total score: " + player1totalscore);
					System.out.println("");
					System.out.println("");
					System.out.println("Player 2 is up. Press (Y)/Enter to start");
					System.out.println("player 2's current score: " + player2totalscore);
					player2currentscore = 0;
					player1turn = false;
					player2turn = true;
				}

				while (player2turn == true) {

//player2 turn loop
					if (player2turn == true) {
						player1turn = false;
						String answer2 = scanner.nextLine();
						if (answer2.equalsIgnoreCase("y")) {
							thrower2.getGenerator();
						}
					}

//player2 roll
					if (player2turn == true) {
						thrower2.roll();
						System.out.println("player2 rolled: " + thrower2.rollDescription());

						player2currentscore = player2currentscore + thrower2.methodEyes1();
						System.out.println("player2's round score = " + player2currentscore + "     you need ("
								+ (100 - (player2currentscore + player2totalscore)) + ") more points to win");
						System.out.println("player2's total score = " + player2totalscore);
					}

					// player 2: face value 1
					if (thrower2.methodEyes1() == 1 && player2turn == true) {
						player2currentscore = 0;
						player1turn = true;
						player2turn = false;
						System.out.println("");
						System.out.println("");
						System.out.println("Player 1 is up. Press (Y)/Enter to start");
						break;
					}

					// Player2 Win-condition #2
					if (player2totalscore >= 100 && player2turn == true) {
						printGameWon();
						finished = true;
						break;
					} else if (player2currentscore >= 100 && player2turn == true) {
						printGameWon();
						finished = true;
						break;
					} else if ((player2totalscore + player2currentscore) >= 100 && player2turn == true) {
						printGameWon();
						finished = true;
						break;
					}

					if (finished != true && player2turn == true) {
						System.out.println("roll again (Y/n)?");
					}

//end turn 
					String answer2 = scanner.nextLine();
					if (answer2.equalsIgnoreCase("n") && player2turn == true) {
						System.out.println("");
						player2totalscore = player2totalscore + player2currentscore;
						System.out.println("player 2's total score: " + player2totalscore);
						System.out.println("");
						System.out.println("");
						System.out.println("Player 1 is up. Press (Y)/Enter to start");
						System.out.println("player 1's round score: " + player1currentscore);
						player1turn = true;
						player2turn = false;
						player1currentscore = 0;
						break;
					}
				}
			}
		}

		scanner.close();
	}

	public void printGameWon() {
		System.out.println("congratulations, you win!");
	}

	public void printGameLost() {
		System.out.println("This is so sad, you lost :o(");
	}

	public void printRules() {
		System.out.println("indsæt regler");
	}
}
