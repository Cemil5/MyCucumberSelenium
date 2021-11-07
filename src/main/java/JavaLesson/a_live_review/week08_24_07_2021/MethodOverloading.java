package a_live_review.week08_24_07_2021;

public class MethodOverloading {

	public static void main(String[] args) {

		m1("aa", 1);
		m1(1, "aa");
		
		draw("red");
		draw("white", 5);
		draw(5, "white");
		draw(3.2f);
		draw((byte)2);
		draw(5.5);
		
		short b=50;
		draw(b);
		
	}
	
	public static void m1 (String str, int i) {
		System.out.println(str + " 1 " + i);
	}
	
	public static void m1 (int i, String str) {
		System.out.println(str + " 2 " + i);

	}
	public static void draw() {
		System.out.println("Basic drawing");
	}
	
	public static void draw(String color) {
		System.out.println("Drawing with " + color);
	}
	
	public static void draw(int size) {
		System.out.println("drawing this size: " + size);
		size += 6;		
	}
	public static int draw(String color, int size) {
		System.out.println("color and size");
		return size;
	}
	public static long draw(int size, String color) {
		System.out.println("size and color");
		return 0;
	}
	public static double draw(double height) {
		System.out.println("drawing this height: " + height);
		return  height;
	}
	public static void draw(float height) {
		System.out.println("drawing this height / float: " + height);
	}
}
