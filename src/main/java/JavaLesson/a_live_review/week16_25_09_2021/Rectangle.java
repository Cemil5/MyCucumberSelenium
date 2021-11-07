package a_live_review.week16_25_09_2021;

public class Rectangle extends Shape {
	
	public Rectangle(double l, double w) {
		super("Rectangle");
		setW(w);
		setL(l);
	}

	private double w, l;
	
	

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	@Override
	public double area() {
		
		return l * w;
	}

	@Override
	public double perimeter() {
		
		return 2 * l * w;
	} 

	
	

	
	
	

}
/*
Rectangle
		Attributes:
			w, l

		ACTION:
			area(): w * l
			perimeter(), toString()
*/