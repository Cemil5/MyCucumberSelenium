package a_live_review.week16_25_09_2021;

public abstract class Shape {
	
	private final String name;
	
	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract double area();
	
	public abstract double perimeter();

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
