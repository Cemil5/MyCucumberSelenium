package a_live_review.week13_28_08_2021;

public class Rectangle {
	
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
//		if (length > 0) {
//			this.length = length;
//		} else {
//			System.err.println("value must be positive");
//		}
		
		if (length <0) {
			System.err.println("length value must be positive");
			return;
		}
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width <0) {
			System.err.println("width value must be positive");
			return;
		}
		this.width = width;
	}
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
		
	
	
}
