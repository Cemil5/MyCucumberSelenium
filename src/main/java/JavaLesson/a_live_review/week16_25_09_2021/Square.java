package a_live_review.week16_25_09_2021;

public class Square extends Shape {
	
	public Square(double side) {
		super("Square");
		setSide(side);
	}

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}
	
	

}
