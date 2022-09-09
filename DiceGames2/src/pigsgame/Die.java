package pigsgame;

import java.util.Random;
public class Die {

// field variables
	private int faceCount;
	private int faceValue;
	private Random Generator;

//constructor #1
	public Die(int faceCount) {
	Generator = new Random();
	this.faceCount = faceCount;
	}
	
//constructor #2
	public Die() {
	Generator = new Random();
	this.faceCount = 6;
	this.faceValue = 1 + Generator.nextInt(6);
	
	}

//get methods
	public int getFaceCount() {
		return faceCount;
	}

	public int getFaceValue() {
		return faceValue;
	}
	
	public Random getGenerator() {
		return Generator;
	}
	

//random roll
	public void roll() {
	Random Generator = new Random();
	this.faceValue = 1 + Generator.nextInt(6);	
	}
}