package pigs;

import java.util.Random;

public class Die {
	// number of faces
	private int faceCount;
	// value of upper face
	private int faceValue;
	private Random Generator;

	/**
	 * Creates a die with the given face count and a random face value.
	 */
	public Die(int faceCount) {
		// TODO
		this.faceCount = faceCount;
		Generator = new Random();
		// Remember to initialise all fields.
	}

	/**
	 * Creates a die with 6 faces and a random face value.
	 */
	// TODO: Make another constructor

	public Die() {
		Generator = new Random();
		this.faceCount = 6;
		this.faceValue = Generator.nextInt(6) + 1;

	}

	// TODO: make getters

	public int getFaceCount() {
		return faceCount;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue() {
		this.faceValue = faceValue;
	}

	public Random getGenerator() {
		return Generator;
	}

	/**
	 * Rolls the die, resulting in a new face value.
	 */
	public void roll() {
		// TODO
		this.faceValue = 1 + Generator.nextInt(6);

	}
}