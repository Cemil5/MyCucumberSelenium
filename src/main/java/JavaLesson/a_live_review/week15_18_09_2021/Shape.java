package a_live_review.week15_18_09_2021;

public class Shape {
	
	private final String name;
	
	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double area() {
		return 0;
	}
	
	public double perimeter() {
		return 0;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name +  ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}
	
	public static void test() {
		
	}

	public static void test(int i) {
		
	}
	
	
}
/*
Attribute:
			name

		Actions/methods:
			area(), perimeter(), toString()
*/
