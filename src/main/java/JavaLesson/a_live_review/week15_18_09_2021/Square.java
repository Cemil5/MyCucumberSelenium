package a_live_review.week15_18_09_2021;

import java.util.ArrayList;

public final class Square extends Shape {
	
	private double s;

	public Square(double s) {
		super("Square");
		setS(s);
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		if (s <= 0) {
			return;
		}
		this.s = s;
	}

	@Override
	public double area() {
		return s * s;
	}

	@Override
	public double perimeter() {
		return 4 * s;
	}
	
	
	
}
