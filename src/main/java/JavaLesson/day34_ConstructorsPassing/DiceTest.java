package day34_ConstructorsPassing;

public class DiceTest {

	public static void main(String[] args) {
		
		Dice sixDice = new Dice(6);
		rollDice(sixDice, new Dice(5));
		
		
	}
	
	public static void rollDice(Dice d1, Dice d2) {
		//Rolling a 6 sided dice
//		Dice d1 = new Dice(6);
//		d1.roll();
		System.out.println("Rolling a " + d1.getSides() + " sided dice");
		System.out.println("result : " + d1.getValue());
	
		//the dice's value : 5
	//	Dice d2 = new Dice(5);
	//	d2.roll();
		System.out.println("Rolling a " + d2.getSides() + " sided dice");
		System.out.println("result : " + d2.getValue());
	}
	
}
