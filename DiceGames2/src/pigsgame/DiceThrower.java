package pigsgame;
import java.util.Random;
public class DiceThrower {
	private Die die1;

//field variables
private int rollcount;
private int facevalues; 
private Random Generator;


//constructor
public DiceThrower () {
	this.die1 = new Die();
	this.rollcount = 0;
	this.facevalues = 0;
	Generator = new Random();
}

	// TODO: Add get methods for the fields.
public Random getGenerator() {
	return Generator;
}

public Die getDie1() {
	return die1;
}

public int getRollcount() {
	return rollcount;
}


public int getFacevalues() {
	return facevalues;
}


//roll
	public void roll() {
die1.roll();
	}	
	
//face value
	public int methodEyes1() {
		return die1.getFaceValue();
		}

//roll (string format)
	public String rollDescription() {
		// TODO: Use the method: String.format().
		return String.format(die1.getFaceValue() + "");
	}
	

	
}


