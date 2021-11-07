package day42_interface;

public class Ford extends ElectricCar{

	
	private int year;
	
	public Ford(String model, double price, String color, int year) {
		super(model, price, color);
		this.year = year;
	}

	@Override
	void start() {
		System.out.println("Ford - start by pressing a button");
	}

	@Override
	void charge() {
		System.out.println("Ford - plugin to electric outlet ...");
	}

	@Override
	void drive() {
		System.out.println("Ford -  is driving ...");
		
	}

	public int getYear() {
		return year;
	}
	
	
	
	

}
