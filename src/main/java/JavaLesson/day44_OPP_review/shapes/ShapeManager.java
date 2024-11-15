package day44_OPP_review.shapes;

import java.util.List;

public class ShapeManager {
	
	public static Shape buildShape(String type) {
		
		Shape shape = null;
		
		switch (type.toLowerCase()){
		case "shape":
			shape = new Shape();
			break;
		case "diamond":
			shape = new Diamond();
			break;
		case "square":
			shape = new Square();
			break;
		}
		return shape;
	}

	
	public static void drawSquare(Square shape) {
		// draw from square class
		shape.draw();
		
	}
	
	public static void drawShape(Shape shapeObject) {
		shapeObject.draw();
	}
	
	public static void drawShape(List<Shape> shapeList) {
		
		for (Shape each : shapeList) {
			each.draw();
		}
		
	}
	
}
