package day40_accessModifier_final_hiding_2;

import day40_accessModifier_final_hiding.Car;

public class CarTest{

	public static void main(String[] args) {
		
		Car c = new Car();
		
	//	c.model = "M3";	// default var, dif package
		c.year = 2017;	// public var, dif package
	//	c.door = 4;		// private var, dif package
	//	c.engine = 5.3;
		
	}

}
