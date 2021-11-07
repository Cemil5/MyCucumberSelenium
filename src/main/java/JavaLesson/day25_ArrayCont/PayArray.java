package day25_ArrayCont;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {

		// This program in an array the hours worked for by 5 employees who all make same hourly
		// display their gross pay
		
		Scanner sc = new Scanner(System.in);
		
		final int EMPLOYEES = 5;
		double payRate;
		double grossPay;
		
		int[] hours = new int[EMPLOYEES];
		
		System.out.println("enter work by " + EMPLOYEES + " employees who all earn the same hourly wage");
		
		for (int i=0; i<EMPLOYEES; i++) {
			hours[i] = sc.nextInt();
		}
		System.out.println("enter the hourly rate for each employee");
		payRate = sc.nextDouble();
		
		for (int i=0; i<EMPLOYEES; i++) {
			grossPay = hours[i]*payRate;
			System.out.println("Employee #" + (i+1) + " : $ "+grossPay);		
		}
		
		
		
	}

}
