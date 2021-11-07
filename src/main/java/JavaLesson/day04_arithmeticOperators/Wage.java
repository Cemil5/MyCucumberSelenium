package day04_arithmeticOperators;

public class Wage {
	public static void main(String[] args) {
		double regularWage;
		double basePay=25;
		double regularHours=40;
		double overtimeWages;
		double overTimePay=37.5;
		double overTimeHours=10;
		double totalWage;
		
		regularWage = basePay * regularHours;
		overtimeWages = overTimePay * overTimeHours;
		totalWage = regularWage + overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
	}

}
