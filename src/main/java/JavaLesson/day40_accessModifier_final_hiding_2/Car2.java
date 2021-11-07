package day40_accessModifier_final_hiding_2;

import day40_accessModifier_final_hiding.Car;

public class Car2 extends Car {

	public Car2() {
		
	// model = "M3";	// default var, dif package
		year = 2017;	// public var, dif package
	//	door = 4;		// private var, dif package
		engine = 5.3;
	}
}
