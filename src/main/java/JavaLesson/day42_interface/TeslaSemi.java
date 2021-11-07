package day42_interface;

public class TeslaSemi extends ElectricTruck {
	
	private double engineSize;
		
		
	public TeslaSemi(String model, double price, String color, double engineSize) {
		super(model, price, color);
		this.engineSize = engineSize;
	}

	

	@Override
	int load(String item) {
		System.out.println(super.getModel() + " - load " + item + " by lowering the truck and opening door ...");
		return 0;
	}

	@Override
	void start() {
		System.out.println(super.getModel() + " - start truck by pressing a button");
	}

	@Override
	void charge() {
		System.out.println(super.getModel() + " - plugin charge for 30 mins ...");
	}

	@Override
	void drive() {
		System.out.println(super.getModel() + " - truck is driving with load...");
		
	}

	public double getEngineSize() {
		return engineSize;
	}
	
	
	
}
