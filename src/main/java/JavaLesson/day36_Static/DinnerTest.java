package day36_Static;

public class DinnerTest {

	public static void main(String[] args) {
		
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total slices : " + mom.pizzaSlice);
		
		dad.takeASlice(2);
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("Total slices : " + Dinner.pizzaSlice);
		
		kid.takeASlice(2);
		mom.takeASlice(2);
		System.out.println("Total slices : " + Dinner.pizzaSlice);
		
		System.out.println(Math.PI);
	}

}
