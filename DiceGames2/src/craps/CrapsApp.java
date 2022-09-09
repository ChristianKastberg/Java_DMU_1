package craps;

import craps.CrapsGame;

public class CrapsApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Craps.");

        // TODO
        CrapsGame game = new CrapsGame();
        game.printRules();
        System.out.println();

        game.play();

        System.out.printf("Thank you for playing craps.");
    }
}
