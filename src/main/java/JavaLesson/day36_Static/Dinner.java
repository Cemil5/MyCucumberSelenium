package day36_Static;

public class Dinner {
	
	static int pizzaSlice = 8;
	
	public void takeASlice() {
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		pizzaSlice -= count;
	}
}
