package static_hiding_extra_practice;

public class Item {
	
	String name;
	double unitPrice;
	int quantity;
	
	
	public Item(String name, double unitPrice, int quantity) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
	public double calcCost() {
		return unitPrice*quantity;
	}
	
	
}
