package io.github.SarahElhelw;

public class DiceUser {
	
	/**
	 * It creates a triplet of six-sided dice, rolls them once, and returns the object representing the triplet.
	 * @return a triplet of dice.
	 */
	public static TripletOfDice rollOnce() {
		return new TripletOfDice(6);
	}
	
	public static void main(String [] args) {
		TripletOfDice t = rollOnce();
		System.out.println("The die number 1 is a "+t.getFirstDie());
		System.out.println("The die number 2 is a "+t.getSecondDie());
		System.out.println("The die number 3 is a "+t.getThirdDie());
	}
}
