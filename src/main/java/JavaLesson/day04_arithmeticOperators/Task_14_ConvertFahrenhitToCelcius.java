package day04_arithmeticOperators;

public class Task_14_ConvertFahrenhitToCelcius {
	public static void main(String[] args) {
		
		float celcius, fahrenheit = 158.36f;
		
		celcius = (fahrenheit - 32) * 5 /9;
		
		System.out.println(celcius + " celcius is equal to " + fahrenheit + " fahrenheit");
		
	}

}
