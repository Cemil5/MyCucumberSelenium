package inputExercise;

import java.util.Scanner;

public class FahrenheitToCelsius {
		public static void main(String[]args){
			   
				Scanner input = new Scanner(System.in);

		        System.out.print("Input a value in an inches: ");
		        double inches = input.nextDouble();

		        double  meters = inches * 0.0254;
		        System.out.println(inches + " inches is equal to " + meters + " meters");	
		
	}
}
