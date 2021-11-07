package a_live_review.week17_02_10_2021;

import a_live_review.week14_04_09_2021.*;
import a_live_review.week16_25_09_2021.*;

public class PolymorphismPractice {

	public static void main(String[] args) {

		Circle circle = new Circle(3);
		Rectangle rectangle = new Rectangle(4, 5);
		Square square = new Square(6);
		Cylinder cylinder = new Cylinder(8, 7);
		Shape cube = new Cube(5);
		
		Shape [] shapes = {circle, rectangle, square, cylinder, cube, new Circle(10), new Square(20)};
		
		
		Employee emp1 = new Driver("John", 'M', 32, "Truck Driver", 95000);
		Employee emp2 = new Teacher("Asiya", 'F', 24, "Softskill teacher", 110000);
		Employee emp3 = new Developer("Annie", 'F', 28, "Java Developer", 110000);
		
		// verify that Emp1 is Developer
		boolean r1 = emp1 instanceof Employee;	// true
		boolean r2 = emp1 instanceof Developer;	// false
		boolean r3 = !(emp1 instanceof Driver);	// false

			
		System.out.println(r1 + " "+ r2 + " " + r3);
		
		
	}

}
