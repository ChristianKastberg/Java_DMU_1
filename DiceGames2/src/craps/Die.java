package craps;

import java.util.Random;
public class Die {
	// number of faces
	private int faceCount;
	// value of upper face
	private int faceValue;
	//generator
	private Random Generator;

	/**
	 * Creates a die with the given face count and a random face value.
	 */
	public Die(int faceCount) {
	Generator = new Random();
	this.faceCount = faceCount;

	
		// TODO
		// Remember to initialise all fields.
	}

	/**
	 * Creates a die with 6 faces and a random face value.
	 */
	// TODO: Make another constructor
	
	public Die() {
	Generator = new Random();
	this.faceCount = 6;
	this.faceValue = 1 + Generator.nextInt(6);
	
	}

	// TODO: make getters
	
	public int getFaceCount() {
		return faceCount;
	}

	public int getFaceValue() {
		return faceValue;
	}
	
	public Random getGenerator() {
		return Generator;
	}
	

	/**
	 * Rolls the die, resulting in a new face value.
	 */
	public void roll() {
		// TODO
	Random Generator = new Random();
	this.faceValue = 1 + Generator.nextInt(6);
	
		
	}




}