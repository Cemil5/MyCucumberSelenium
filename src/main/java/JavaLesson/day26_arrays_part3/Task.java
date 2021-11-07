package day26_arrays_part3;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		String months[] = new String[12];
		
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		double rainfall[] = new double[12];
		double sum =0;
		double max =0;
		double min = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Mohth Rainfall (In Inches");
		
		for (int i=0; i<months.length;i++) {
			System.out.print(months[i] + " : ");
			rainfall[i] = sc.nextDouble();
			while (rainfall[i]<0) {
				System.out.println("rainfall can not be less than 0. enter again");
				rainfall[i] = sc.nextDouble();
			}
			sum += rainfall[i];
			if (rainfall[i]>max) {
				max = rainfall[i];
			}
			if (i==0 || rainfall[i]<min) {
				min = rainfall[i];
			}
		}
		System.out.println("The sum of all the rain is : " + sum + " inches");
		System.out.println("The average rainfall was : " + sum/months.length + " inches");
		System.out.println("The max rain is : " + max + " inches");
		System.out.println("The min rain is : " + min + " inches");

		
		
	}

}
