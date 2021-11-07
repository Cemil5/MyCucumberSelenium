package day33_classObject_constructors;

public class Rectangle {
	
	double length;
	double width;
	
	public void getArea() {
		System.out.println(length * width);
	}
	
	// my constructor with no parameter
	public Rectangle(){
		// instantiate the object variables
		// default constructor
	} 
	
	//created a constructor which accepts 2 arguments type double
	public Rectangle(double a, double b) {
		length = a;
		width = b;
	}
	
}
