package a_live_review.week16_25_09_2021;

public class Cylinder extends Shape implements Volume {
	
	private double radius, height;
	public static final double PI = 3.14;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static double getPi() {
		return PI;
	}

	public Cylinder(double radius, double height) {
		super("Cylinder");
		setHeight(height);
		setRadius(radius);
	}

	@Override
	public double volume() {

		return PI * radius * radius * height;
	}

	@Override
	public double area() {
		return PI * radius * radius + height*(2*PI*radius);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
