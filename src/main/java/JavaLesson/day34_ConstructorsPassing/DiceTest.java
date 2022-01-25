package JavaLesson.day34_ConstructorsPassing;

public class DiceTest {

	public static void main(String[] args) {
		
		day34_ConstructorsPassing.Dice sixDice = new day34_ConstructorsPassing.Dice(6);
		rollDice(sixDice, new day34_ConstructorsPassing.Dice(5));
		
		
	}
	
	public static void rollDice(day34_ConstructorsPassing.Dice d1, day34_ConstructorsPassing.Dice d2) {
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
