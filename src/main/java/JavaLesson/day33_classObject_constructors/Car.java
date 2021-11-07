package day33_classObject_constructors;

public class Car {
	
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	// create constructor
	public Car() {
		model = "Honda";
		make = "Civic";
		year = 2020;
		mile = 5000;
		color = "red";
	}
	
	
	/* 2 things need to be clear
	1- how we create it
	2- what are those constructors responsibilities
	*/

	public Car(String model, String make, int year, double mile, String color) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	
	
	
}
