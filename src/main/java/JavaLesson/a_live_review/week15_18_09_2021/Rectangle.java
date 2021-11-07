package a_live_review.week15_18_09_2021;

public final class Rectangle extends Shape {
	
	private double w, l;

	public Rectangle(double w, double l) {
		super("Rectangle");
		setL(l);
		setW(w);
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		if (w <=0) {
			return;
		}
		this.w = w;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		if (l <=0) {
			return;
		}
		this.l = l;
	}

	@Override
	public double area() {
		
		return l * w;
	}

	@Override
	public double perimeter() {
		return 2 * (l + w);
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