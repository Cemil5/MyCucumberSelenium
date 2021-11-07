package a_live_review.week16_25_09_2021;

public class Cube extends Shape implements Volume {
	
	private double side;
	
	public Cube(double side) {
		super("Cube");
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
