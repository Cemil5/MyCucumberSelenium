package day04_arithmeticOperators;

public class contribution {
	public static void main(String[] args) {
		
		//This program calculates teh amount of pay that will be
		
		double salary = 10000;
		double contribution, montlyPay;
		
		montlyPay=0.05;
		contribution=salary*montlyPay;
		System.out.println((int)(montlyPay*100) + " percent, $" + contribution +" contribution per month");
		
		montlyPay=0.08;
		contribution=salary*montlyPay;
		System.out.println(montlyPay*100 + " percent, $" + contribution +" contribution per month");
		
		montlyPay=0.10;
		contribution=salary*montlyPay;
		System.out.println(montlyPay*100 + " percent, $" + contribution +" contribution per month");
		
	}

}
