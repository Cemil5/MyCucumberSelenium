package day33_classObject_constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
	/*	Rectangle R1 = new Rectangle(2.4,5.7); // calling constructor
		// new keyword invokes the constructor
		// which constructor ? 
		// accepting arguments with suitable variables types.
		System.out.println(R1.length);
		System.out.println(R1.width);
		
		
	/*	R1.length = 5;
		R1.width = 3.2;
		System.out.println(R1.length);
		System.out.println(R1.width);
		R1.getArea(); */

		Rectangle R2 = new Rectangle();
		R2.length = 2.5;
		R2.width = 12.6;
		System.out.println(R2.length);
		System.out.println(R2.width);
		R2.getArea();
		
		Rectangle R3 = new Rectangle();

	}

}
