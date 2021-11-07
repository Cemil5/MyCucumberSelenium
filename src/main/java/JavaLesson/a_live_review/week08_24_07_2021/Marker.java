package a_live_review.week08_24_07_2021;

public class Marker {

	// Instance variables:
	String name;
	String color;
	double height;
	char c;
	
	// Instance methods
	
	public void print () {
		System.out.println("Name: " + name + " Color: " + color + " Height: "+height + " char: " + c);
	}
	
	public String writeMsg(String msg) {
		msg = name + " is writing " + msg;
		return msg;
	}
	
	public void setInfo(String setName, String setColor, double setHeight) {
		name = setName;
		color = setColor;
		height = setHeight;
	}
	
}
