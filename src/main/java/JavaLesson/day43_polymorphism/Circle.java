package day43_polymorphism;

public class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
	
	public void check() {
		System.out.println("check it");
	}
}
