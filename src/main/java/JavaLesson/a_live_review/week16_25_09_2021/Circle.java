package a_live_review.week16_25_09_2021;

public class Circle extends Shape {
	
	private double radius;
	public static final double PI = 3.14;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}



	public Circle(double radius) {
		super("Circle");
		setRadius(radius);
	}

	@Override
	public double area() {
		
		return PI * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return PI * radius * 2;
	}
	
	
}
