package day44_OPP_review.shapes;

import java.lang.reflect.Array;

public class ShapeTest {

	public static void main(String[] args) {
			
		Shape diamond = new Diamond();
		Shape square = new Square();
		Object shapeObject = new Shape();
		Object shapeObject1 = new Square();
		
		
		square.draw();
		diamond.draw();
		
		((Square)square).squareMethod();
		
		
	}

}
