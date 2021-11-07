package day42_interface;

public abstract class ElectricCar {
	
	private String model;
	private double price;
	private String color;
	
	abstract void start();
	abstract void charge();
	abstract void drive();
	
	void stop() {
		System.out.println("car is stopping by pushing the break");
	}

	public ElectricCar(String model, double price, String color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	
	public static void staticMethod() {
		System.out.println("static method test");
	}
	
	public static final void finalMethod() {
		System.out.println("static method test");
	}
	
	public static final void staticfinalMethod() {
		System.out.println("static method test");
	}

	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	
}
