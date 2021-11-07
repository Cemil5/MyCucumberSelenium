package day44_OPP_review.shapes;

import java.util.List;
import java.util.ArrayList;

import static day44_OPP_review.shapes.ShapeManager.*;

public class ShapeActions {

	public static void main(String[] args) {
		
		Shape shape = ShapeManager.buildShape("square");		
		ShapeManager.drawShape((shape));
		
		drawSquare(((Square)shape));
		
		
		
		shape = ShapeManager.buildShape("diamond");
		ShapeManager.drawShape((shape));
		
		shape = ShapeManager.buildShape("shape");
		ShapeManager.drawShape((shape));
		

		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());
		myList.add(new Shape());
		
		System.out.println("-----------------------");
		
		drawShape(myList);
		
		
		
	}

}
