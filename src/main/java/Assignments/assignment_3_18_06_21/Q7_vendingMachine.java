package assignment_3_18_06_21;

public class Q7_vendingMachine {

	public static void main(String[] args) {
		
		int price, quarters, dimes, nickles, change;
		
		price = 95;
		change = 100 - price;
		
		//quarters = change / 25;
		//dimes = (change - quarters*25)/ 10;
		//nickles = ((change - quarters*25) % 10)/5;
		
        quarters = change / 25;
        dimes = (change % 25) / 10;
        nickles = (change % 25)% 10 / 5;
		
		System.out.println("Price in cents : " + price);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");

	}
}
