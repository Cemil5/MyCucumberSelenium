package day36_Static;

public class Quiz_OrderDriver {

	public static void main(String[] args) {
		
		Order order = new Order("f");	// garbage collector
		System.out.println(order.value);
		order = new Order();
		System.out.println(order.value);
	}
}

class Order{
	static String value = "t";
	
	static { value += "a"; }

	static { value += "c"; }
	
	public Order() {
		value += "b";
	}
	public  Order(String s) {
		value += s;
	}
	
}
