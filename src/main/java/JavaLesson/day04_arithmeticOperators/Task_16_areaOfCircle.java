package day04_arithmeticOperators;

public class Task_16_areaOfCircle {

	public static void main(String[] args) {
		
		double radius = 5.5, perimeter, area; 
		final double PI = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;
		
		perimeter = 2 * radius * PI;
		area = radius * radius * PI;
		
		System.out.println("Perimeter of the circle is " + perimeter);
		System.out.println("Area  of the circle is " + area);
		

	}

}
