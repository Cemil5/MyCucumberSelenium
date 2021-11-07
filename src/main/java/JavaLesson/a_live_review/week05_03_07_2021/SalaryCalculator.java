package a_live_review.week05_03_07_2021;
/*
 * [Salary Calculator]

Given the following information: hourly rate, weekly hours, and number of weeks. Check if all the inputs are valid and then calculate the salary. 

    - hourly rate cannot be negative or zero
        -> If invalid print: Hourly Rate cannot be Negative or Zero
    - weekly hours cannot be zero, negative or more than 65
        -> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
    - number of weeks cannot be less than 1 and more than 52 
        -> If invalid print: Number of weeks cannot be less than 1 or greater than 52

Equation: salary  =  hourly rate *  weekly hours * number of weeks
 */

public class SalaryCalculator {
	public static void main(String[] args) {
		
		int weeklyHours = 40, numberOfWeeks = 52;
		double hourlyRate = 15.5;
		
		if (hourlyRate > 0) {
			if (weeklyHours > 0 && weeklyHours <= 65) {
				if (numberOfWeeks>0 && numberOfWeeks<=52) {
					System.out.println("Your salary is " + (hourlyRate * weeklyHours * numberOfWeeks));
				} else {
					System.out.println("Number of weeks cannot be less than 1 or greater than 52");
				}
			} else {
				System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
			}
			
		} else {
			System.out.println("Hourly Rate cannot be Negative or Zero");
		}
		
 // -------------------------------
        
        // Modified requirements: 
        
        boolean validHourlyRate = hourlyRate > 0;
        boolean validWeeklyHours = weeklyHours > 0 && weeklyHours < 65;
        boolean validNumberOfHours = numberOfWeeks > 0 && numberOfWeeks <= 52;
        
        
        if(validHourlyRate && validWeeklyHours && validNumberOfHours) {
            System.out.println("Salaray is: " + (hourlyRate * weeklyHours * numberOfWeeks));
        } else {
            
            // if we are in the else, it means one of the booleans was false
            
            if(!validHourlyRate) {  // !false -> true
                System.out.println("Hourly Rate was invalid");
            }
            
            if(!validWeeklyHours) {
                System.out.println("Weekly Hours are invalid");
            }
            
            if(!validNumberOfHours) {
                System.out.println("Number of weeks invalid");
            }
        }
	}

}
