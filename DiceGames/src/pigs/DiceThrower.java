package pigs;

import java.util.Random;

import craps.Die;

public class DiceThrower {
	// 2 dice with face count of 6 each
	private Die die1;
	private int rollcount;
	private int FaceValue;
	private int FaceValueix;
	private int facepair;
	private int bestroll;
	private Random Generator;

	// TODO: Add fields.
	// Fields:
	// 1. The roll count.
	// 2. The total of all face values rolled.
	// 3. The count of face value 6.
	// 4. The count of same face value on both dice.
	// 5. The maximum sum of the face values in one roll.
	// Remember to update fields, when the dice are rolled.

	/**
	 * Creates a DiceThrower object.
	 */

	public DiceThrower() {

		die1 = new Die();

		Generator = new Random();

	}
	// TODO: Make a constructor that initialises all fields.

	// TODO: Add get methods for the fields.

	public int DiceMethod1() {
		return die1.getFaceValue();
	}

	public Random getGenerator() {
		return Generator;
	}

	public Die getDie1() {
		return die1;
	}

	public int getRollcount() {
		return rollcount;
	}

	public int getFaceValue() {
		return FaceValue;
	}

	public void setFaceValue() {
		this.FaceValue = FaceValue;
	}

	public int getFaceValueix() {
		return FaceValueix;
	}

	public int getFacepair() {
		return facepair;
	}

	public int getBestroll() {
		return bestroll;
	}

	/**
	 * Rolls the 2 dice.
	 */
	public void roll() {
		// TODO: Roll the 2 dice.
		die1.roll();

	}

	/**
	 * Returns the sum of the face values in a roll.
	 */
	public int sum() {
		// TODO
		return die1.getFaceValue();

	}

	/**
	 * Returns a textual description of the roll of the 2 dice. Example: Returns
	 * "(4,5)" for a roll of 4 and 5.
	 */
	public String rollDescription() {
		// TODO: Use the method: String.format().
		return String.format("(" + die1.getFaceValue() + ")");
	}
}
