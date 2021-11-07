package a_live_review.week17_02_10_2021;

import a_live_review.week16_25_09_2021.*;

public class ReferenceTypeCastings {

	public static void main(String[] args) {
		
		int a = 10;
		double b = a; // implicit casting
		double b2 = (double) a;
		
		short s = (short)(long) b;	// explicit casting
		int i = (short) b;
		
		System.out.println("-------------------------------------");
		
		
		Shape shape1 = new Cube(10);	//up-casting
		
		// shape1.volume();	in polymorphism, reference type decides that we can call
		
		((Cube) shape1).volume();	// down-casting
		
		// ((Cylinder) shape1).volume();	// java.lang.ClassCastException	// cube has not IS-A relationship
		
		((Volume) shape1).volume();		// best to cast, if you know the parent object
	}

}
