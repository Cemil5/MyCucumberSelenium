package day42_interface;

public class Tesla extends ElectricCar{

	public Tesla(String model, double price, String color) {
		super(model, price, color);
	}
	
	@Override
	void start() {
		System.out.println("Tesla - start by pressing a button");
		System.out.println("Change to drive mode");
	}

	@Override
	void charge() {
		System.out.println("Tesla - plugin charge for 30 mins ...");
	}

	@Override
	void drive() {
		System.out.println("Tesla -  is driving ...");
		
	}
	
}
