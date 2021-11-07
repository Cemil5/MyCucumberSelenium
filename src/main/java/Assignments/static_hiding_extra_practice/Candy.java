package static_hiding_extra_practice;
/*
extra tasks to practice Encapsulation #3
create a custom class named Candy
private variables:
    brand (String), quantity (int), price (double), hasPeanuts (boolean)

    Encapsulate All the private fields
    (price of candy can not be set to negative)
    (quantity of candy can not be set to zero or negative)

    Add a constructor that can set the instances when the object is created
                 
    Extra methods:
        toString():
        if the price is zero, print "free" instead of 0

 Create a class named CandyFactory
        Create an ArrayList of candies
        Add five objects of candies
        use for each loop to print the brand and price of each candy
 */

public class Candy {
	
	private String brand;
	private int quantity;
	private double price;
	private boolean hasPeanuts;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity<=0) {
			System.err.println("quantity should be more than 0");
			return;
		}
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price<0) {
			System.err.println("price cannot be less than 0");
			return;
		}
		this.price = price;
	}
	
	public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
		setBrand(brand);
		setQuantity(quantity);
		setPrice(price);
		setHasPeanuts(hasPeanuts);
	}
	
	public boolean isHasPeanuts() {
		return hasPeanuts;
	}
	public void setHasPeanuts(boolean hasPeanuts) {
		this.hasPeanuts = hasPeanuts;
	}
	
	public String toStringAll() {
		if (price !=0) {
			return "Candy [brand=" + brand + ", quantity=" + quantity + ", price=" + price + ", hasPeanuts=" + hasPeanuts + "]";
		} else {
			return "Candy [brand=" + brand + ", quantity=" + quantity + ", price=" + "free" + ", hasPeanuts=" + hasPeanuts + "]";
		}
	}

	public String toString() {
		if (price !=0) {
			return "Candy [brand=" + brand + ", price=" + price + "]";
		} else {
			return "Candy [brand=" + brand + ", price=" + "free" + "]";
		}	
	}

}
