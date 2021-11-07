package day07_controlFlowStatements;

public class ifStatements {
	public static void main(String[] args) {
		int x, y;
		y = 10;
		x = 0;	
		if (y==20) {
			x = 5;
		}
		System.out.println("x = " + x + " y = " + y);

		
		
		int sales,bonus;
		double commissionRate, salary;
		
		sales =5000;
		salary = 10000;
		
		if (sales>5000) {
			bonus = 500;
			commissionRate=1.12;
			
			salary = salary*commissionRate+bonus;
			
		System.out.println("Salary = " + salary);
		}
		
		
		double payRate = 30;
		int hours = 40;
		
		if (hours > 40) {
			payRate = payRate * 1.5; 
			
			
		}
		System.out.println("Payrate is " + payRate);
		
		/* Write an if statement that sets the variable fees to 50 if the Boolean variable max is true
		*/
		
		int fees = 0;
		boolean max=true;
		
		if (max = true) {
			fees = 50;
		}
		System.out.println("Fee is " + fees);
			
		/*4- Write an if statement that assigns 20 to the variable a if variable b is 50 and c is
greater and equal to 100*/
		
		int a=0, b=50, c=100;
		
		if ((b==50)&(c >= 100)) {
			a = 20;
		}
		
		System.out.println("Value of a = " + a);
		
		/*5- Write an if statement that prints Ideal Temp if the temp is between 70 and 80 */
		
		int temp = 75;
		
		if ((70<=temp) & (temp<=80)){
			System.out.println("Ideal Temp");
		}
		
		
	}
	

}
