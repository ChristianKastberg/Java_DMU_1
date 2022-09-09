package craps;

import java.util.Scanner;

import simple.DiceThrower;

public class CrapsGame {

    /**
     * Simulates playing one game of craps.
     */
    public void play() {
        // TODO
        	 
  	Scanner scanner = new Scanner(System.in);     
  	DiceThrower thrower = new DiceThrower();  
 
	//variables
	 boolean comeoutroll = true;
	 int currentroll = 0;
	 int point = 0;
  	
  	//Loop
  	boolean finished = false;
  	while (!finished) {
  		
  		
  	if  (comeoutroll == true) {
  	    System.out.println("Press Enter/(Y) to start the game");
  	
  	String answer2 = scanner.nextLine();
  	if (answer2.equalsIgnoreCase("y")) {
    thrower.getGenerator();

    }     
  	}
      	        
  		
  		 //comeoutroll
  			if (comeoutroll == true) {
  	 	  	System.out.println("comeoutroll: ");
  	 	    }
  	 	     
  	 	 //thrower
  	 	  	thrower.roll();
  	 	    System.out.println("you rolled: " + thrower.rollDescription() + "   " + "(" + thrower.sum() + ")"); 
  	 	    
  	 	 //come out roll win
  	 	    if (comeoutroll == true && thrower.sum() == 7) {
  	 	  	printGameWon();
  	 	  	comeoutroll = false;
  	 	  	finished = true;
  	 	    }
  	 	  	if (comeoutroll == true && thrower.sum() == 11) {
  	 	  	printGameWon();
  	 	 	comeoutroll = false;	
  	 	 	finished = true;
  	 	    }
  	 	  	
  	 	//come out roll loose
  	 	  	if (comeoutroll == true && thrower.sum() == 2) {
  	 	  		printGameLost();
  	 	  		finished = true;
  	 	  	}		
  	 	  	if (comeoutroll == true && thrower.sum() == 3) {
  	 	  		printGameLost();
  	 	  		finished = true;
  	 	  	}
  	 	  	if (comeoutroll == true && thrower.sum() == 12) {
  	 	  		printGameLost();
  	 	  		finished = true;
  	 	  	}
  	 	  	
  	 	//comeoutroll neutral
  	 	  	if (comeoutroll == true && thrower.sum() == 1) {
  	 	  	comeoutroll = false;
  	 	  	}
  	 		if (comeoutroll == true && thrower.sum() == 4) {
  	  	  	 	comeoutroll = false;
  	  	  	 	}
  	 		if (comeoutroll == true && thrower.sum() == 5) {
  	  	  	 	comeoutroll = false;
  	  	  	 	}
  	 		if (comeoutroll == true && thrower.sum() == 6) {
  	  	  	 	comeoutroll = false;
  	  	  	 	}
  	 		if (comeoutroll == true && thrower.sum() == 8) {
  	  	  	 	comeoutroll = false;
  	  	  	 	}
  	 		if (comeoutroll == true && thrower.sum() == 9) {
  	  	  	 	comeoutroll = false;
  	  	  	 	}
  	 		if (comeoutroll == true && thrower.sum() == 10) {
  	  	  	 	comeoutroll = false;
  	  	  	 	}
  	 		
  	 	//point:
  	 		
  	 		if (finished == false && comeoutroll == false && point == thrower.sum() && point != 7 && thrower.sum() != 7) {
  	  	 	  	printGameWon();
  	  	 	  	comeoutroll = false;
  	  	 	  	finished = true;
  	 		}
  	 	
  	 		if (finished == false && comeoutroll == false && point != 0 && point != 7 && thrower.sum() != 7) {
  	 		System.out.println("");
  	 		System.out.println("your point is: " + point);
  	 		System.out.println("Roll again? (Y/n) ");
  	 		}
  	 		
  	 		if (finished == false && comeoutroll == false && point == 0 && point != 7 && thrower.sum() != 7) {
  	 		point = thrower.sum();
  	 			
  	 		System.out.println("");
  	 		System.out.println("your point is: " + point);
  	 		System.out.println("Roll again? (Y/n) ");
  	 		}
  	 	
  	 	//roll 7 and you loose!	
  	 		if (finished == false && comeoutroll == false && thrower.sum() == 7) {
  	 		printGameLost();
  	 		finished = true;
  	 		}
	 			 		
    String answer2 = scanner.nextLine();
    if (answer2.equalsIgnoreCase("y")) {
    thrower.getGenerator();
    }     
    
    String answer = scanner.nextLine();
    if (answer.equalsIgnoreCase("n")) {
    System.out.println("");
    finished = true;
    
    }

}
  	scanner.close(); 
}

    /**
     * Prints a 'You have won' message.
     */
    public void printGameWon() {
        // TODO
    System.out.println("congratulations, you win!");
    }

    /**
     * Prints a 'You have lost' message.
     */
    public void printGameLost() {
        // TODO
    System.out.println("This is so sad, you lost :o(");
    }

    /**
     * Prints the rules of craps.
     */
    public void printRules() {
        // TODO
System.out.println("In the game a player throws 2 dice. The first throw is called 'the come out roll'. ");
System.out.println("The player wins, if the sum of the dice is 7 or 11. The player loses, if the sum is 2, 3 or 12."); 
System.out.println("If the sum is something else (that is, 4, 5, 6, 8, 9 or 10), the sum is set as the player's 'point'."); 
System.out.println("The player will now continue throwing the dice until he has lost or won. A sum equal his 'point' is a win,");
System.out.println("and a sum equal 7 is a loss.");
    
    }

}
