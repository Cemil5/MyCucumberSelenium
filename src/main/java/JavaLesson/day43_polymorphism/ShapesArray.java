package day43_polymorphism;

import java.util.List;
import java.util.ArrayList;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		
		int [] x = new int[3]; // holding 3 int values
		
		shapes[0] = new Shape();
//		System.out.println(shapes[0].getClass().getName());
//		System.out.println(shapes[0].getClass().getSimpleName());

		
		shapes[1] = new Triangle();	// polymorphism
		
		shapes[2] = new Circle();
		
		for (Shape sh : shapes) {
		//	System.out.println(sh.getClass().getName());
			System.out.println(sh.getClass().getSimpleName());
		//	sh.draw();
		}
		
	//	ArrayList<Shape> shapeList = new ArrayList<>();
		List<Shape> shapeList = new ArrayList<>();	// polymorphism
		shapeList.add(new Triangle());
		shapeList.add(new Circle());
		shapeList.add(new Square());

		
	}

}
