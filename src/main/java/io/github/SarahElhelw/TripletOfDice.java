package io.github.SarahElhelw;

public class TripletOfDice {
	private int die1;
	private int die2;
	private int die3;
	private int n;
	
	/**
	 * This is the constructor of TripletOfDice class.
	 * @param nbOfSides represents the number of sides the dice will have.
	 * It defines the number of sides dice will have and rolls them all.
	 * 
	 * Precondition : nbOfSides must be a positive integer.
	 * Postcondition : initializes the number of sides and rolls the 3 dice
	 */
	public TripletOfDice(int nbOfSides) {
		n = nbOfSides;
		rollAllDice();
	}
	
	/**
	 * Rolls the 3 dice.
	 * 
	 * Precondition : None
	 * Postcondition : rolls the 3 dice.
	 */
	public void rollAllDice() {
		die1 = (int)(Math.random()*n) + 1;
		die2 = (int)(Math.random()*n) + 1;
		die3 = (int)(Math.random()*n) + 1;
	}
	
	/**
	 * Rolls one of the three dice.
	 * @param dieNumber gives the number of the dice to roll.
	 * 
	 * Preconditions: dieNumber must be equal to 1, 2 or 3.
	 * Postcondition: one die is rolled.
	 */
	public void rollOneDie(int dieNumber) {
		if (dieNumber!=1 && dieNumber!=2 && dieNumber!=3) {
			throw new IllegalArgumentException();
		}
		if (dieNumber==1) {
			die1 = (int)(Math.random()*n) + 1;
		}
		if (dieNumber==2) {
			die2 = (int)(Math.random()*n) + 1;
		}
		if (dieNumber==3) {
			die3 = (int)(Math.random()*n) + 1;
		}
	}
	
	/**
	 * This a getter.
	 * @return the value of the first die.
	 */
	public int getFirstDie() {
		return die1;
	}
	/**
	 * This a getter.
	 * @return the value of the second die.
	 */
	public int getSecondDie() {
		return die2;
	}
	/**
	 * This a getter.
	 * @return the value of the third die.
	 */
	public int getThirdDie() {
		return die3;
	}
	
}
