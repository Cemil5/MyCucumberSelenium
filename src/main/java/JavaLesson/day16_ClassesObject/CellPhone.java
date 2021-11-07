package day16_ClassesObject;

public class CellPhone {
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		System.out.println(brand + " is calling");
	}
	
	public void message() {
		System.out.println(brand + " has message");
	}
	public void takeAphoto() {
		System.out.println(brand + " is taking photo");
	}
}
