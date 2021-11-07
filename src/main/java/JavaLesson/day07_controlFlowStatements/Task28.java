package day07_controlFlowStatements;

public class Task28 {
	public static void main(String[] args) {
		
		double revenue, discount =0, price = 50;
		int quantity = 100;
		
		revenue = price * quantity;
		
		if (revenue > 5000) {
			discount = revenue * 0.10;
			revenue = revenue -discount;
		}
		System.out.println("Discount = " + discount + " %. Revenue = " + revenue);
		
	}

}
