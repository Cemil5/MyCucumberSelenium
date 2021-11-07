package a_live_review.week15_18_09_2021;

public final class Circle extends Shape {
	
	private double r;
	public static final double PI;
	
	static {
		PI = Math.PI;
	}

	public Circle(double r) {
		super("Circle");
		setR(r);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		if (r<=0) {
			return;
		}
		this.r = r;
	}

	@Override
	public double area() {		
		return PI * r * r;
	}

	@Override
	public double perimeter() {
		return 2*PI*r;
	}
	
	
	
	
	
	
	
}
/*
Circle
		Attributes:
			r, pi

		ACTION:
			area(): r * r * PI
			perimeter(), toString()
 
*/