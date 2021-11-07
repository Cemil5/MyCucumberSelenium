package static_hiding_extra_practice;

public class Circle {
	
	private double radius;
	
	final double PI = Math.PI;
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius>=0) {
			this.radius = radius;
		} else {
			this.radius =0;
			System.out.println("radius can not be set to negative");
		}
	}

	public Circle(double radius) {
		setRadius(radius);
	}
	
	public boolean equal(Circle circle) {
		
		return false;
	}
	
	public double calcArea() {
		return PI*radius*radius;
	}
	public double perimeter() {
		return 2*PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + "]";
	}
	
	
}
