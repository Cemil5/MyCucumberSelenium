package day13_Method;

public class Task59_payment {

	public static void main(String[] args) {
		pay(5, 20);
		pay(40, 20);
	}
	
	public static void pay(int numHour, int pay) {
		System.out.println("payment : "+ numHour*pay);
	}

}
