package pigsgame;

public class PigsApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the game of pigs.");

        // TODO
        PigsGame game = new PigsGame();
        game.printRules();
        System.out.println();

        game.play();

        System.out.printf("Thank you for playing pigs.");
    }
}
