package day08_controlFlowStatements;

public class NestedIf {
	public static void main(String[] args) {
		
		int salary = 200000;
		int yearOnJob = 1;
		boolean bo = true;
		
		if (salary >= 30000 & bo == false) {
			if (yearOnJob>=2) {
				System.out.println("You qualify for the loan");
			} else {
				System.out.println("You must have been on job at least 2 years to qualify");
			} 
		}else {
			System.out.println("You must earn at least $ 30,000");
				
			}
		}
		
		
	}


