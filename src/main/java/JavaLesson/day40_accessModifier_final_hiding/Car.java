package day40_accessModifier_final_hiding;

public class Car {
	
	String model;
	public int year;
	private int door;
	protected double engine;
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", door=" + door + ", engine=" + engine + "]";
	}
	
	
	
	
}


