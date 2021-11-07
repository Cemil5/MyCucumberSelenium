package a_live_review.week03_19_06_2021;

public class SalaryCalculator {

	public static void main(String[] args) {

		int rate, weeklyHours, salary;
		double taxRate, totalTax, netIncome;
		final int weekNumber = 48; // Assume that a year has 48 weeks (excluding PTO)
		
		rate = 50;
		taxRate = 1/3D; // 0.3333333333333333	
		weeklyHours = 40;
		
		
		salary = rate * weeklyHours * weekNumber;
		totalTax = salary * taxRate;
		netIncome = salary - totalTax;
		
		System.out.println("Your salary is: " + salary + " USD");
		System.out.println("Your total tax is: " + totalTax + " USD");
		System.out.println("Your income after tax is: " + netIncome + " USD");		
		
	}

}
