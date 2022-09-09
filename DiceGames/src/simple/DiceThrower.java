package simple;

import java.util.Random;

public class DiceThrower {
	// 2 dice with face count of 6 each
	private Die die1, die2;
	private int rollcount;
	private int facevalues;
	private int facevaluesix;
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
		die2 = new Die();
		rollcount = 0;
		facevalues = 0;
		facevaluesix = 6;
		facepair = 0;
		bestroll = 6;

		Generator = new Random();

	}
	// TODO: Make a constructor that initialises all fields.

	// TODO: Add get methods for the fields.

	public int DiceMethod1() {
		return die1.getFaceValue();
	}

	public int DiceMethod2() {
		return die2.getFaceValue();
	}

	public Random getGenerator() {
		return Generator;
	}

	public Die getDie1() {
		return die1;
	}

	public Die getDie2() {
		return die2;
	}

	public int getRollcount() {
		return rollcount;
	}

	public int getFacevalues() {
		return facevalues;
	}

	public int getFacevaluesix() {
		return facevaluesix;
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
		die2.roll();

	}

	/**
	 * Returns the sum of the face values in a roll.
	 */
	public int sum() {
		// TODO
		return die1.getFaceValue() + die2.getFaceValue();

		// der stod 0 i return før
	}

	/**
	 * Returns a textual description of the roll of the 2 dice. Example: Returns
	 * "(4,5)" for a roll of 4 and 5.
	 */
	public String rollDescription() {
		// TODO: Use the method: String.format().
		return String.format("(" + die1.getFaceValue() + ", " + die2.getFaceValue() + ")");
	}

	public void incrementRollcount() {
		rollcount++;
		return;
	}
}
