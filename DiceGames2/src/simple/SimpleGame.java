package simple;

import java.util.Scanner;

import sun.nio.cs.Surrogate.Generator;

public class SimpleGame {

    /**
     * Simulates playing one game of Simple.
     */
    public void play() {
    	int facevalues = 0;
    	int rollcount = 0;
    	int facevalue6 = 0;
    	int facepair = 0;
    	int bestroll = 0;
    	int currentroll = 0;
    	 
        Scanner scanner = new Scanner(System.in);     
        DiceThrower thrower = new DiceThrower();
        
        boolean finished = false;
        while (!finished) {
            // TODO: Roll dice, print roll description.
        	     	
        	thrower.roll();
        	System.out.println(thrower.rollDescription());
        	
        	//Count of face value 6
        	int eyesvalue1 =  thrower.methodEyes1();
        	int eyesvalue2 =  thrower.methodEyes2();        	
           
        			if (eyesvalue1 == 6) {
        				facevalue6 ++; }
             
        			if (eyesvalue2 == 6) {
        				facevalue6++; }
        			
        	//pairs
         			if (eyesvalue1 == eyesvalue2) {
         				facepair++; }
        	
        			
            //count & sum
        	rollcount++;
        	facevalues = facevalues + thrower.sum();
        	
        	//currentroll
        	currentroll = eyesvalue1 + eyesvalue2;
        	
        	//bestroll
        	if (currentroll >= bestroll) {
        		bestroll = currentroll;
        	}
    	
        	
            System.out.println("Roll again? (Y/n) "); 
            
String answer2 = scanner.nextLine();
if (answer2.equalsIgnoreCase("y")) {
	thrower.getGenerator();

}

String answer = scanner.nextLine();
if (answer.equalsIgnoreCase("n")) {
	
	finished = true;
	
            }
        }
        scanner.close();

        System.out.printf("\nResults:\n");
        System.out.printf("---------\n");
        // TODO: Print all the results:
        // roll count, total of all face values, average sum in one roll,
        // count of face value 6, count of same face value on both dice,
        // max sum in one roll.
        // Use the method: System.out.printf().
      System.out.printf("Number of rolls:          " + rollcount);
      System.out.printf("\n"); 
      System.out.printf("Score:                    " + facevalues);        
      System.out.printf("\n");
      System.out.printf("Average score:            " + (facevalues/rollcount));   
      System.out.printf("\n");
      System.out.printf("Count of face value 6:    " + facevalue6);   
      System.out.printf("\n");
      System.out.printf("Number of Pairs :         " + facepair);
      System.out.printf("\n");
      System.out.printf("Best roll :               " + bestroll);
      System.out.printf("\n");
      
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
