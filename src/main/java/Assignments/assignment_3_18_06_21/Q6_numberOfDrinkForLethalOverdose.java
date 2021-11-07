package assignment_3_18_06_21;

public class Q6_numberOfDrinkForLethalOverdose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfDrink, milligramsInDrink, lethalOverdose;
		
		lethalOverdose = 10; 
		milligramsInDrink = 500;
		
		numberOfDrink = lethalOverdose * 1000 /milligramsInDrink; // * 1000; for grams to milligrams
		
		System.out.println("Number of milligrams in drink: " + milligramsInDrink);
		System.out.println("It would take about " + numberOfDrink + " drinks for a lethal overdose");

	}
}
