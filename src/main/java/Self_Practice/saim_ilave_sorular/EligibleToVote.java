package saim_ilave_sorular;

/*
 * If the citizenship is for the USA then ask user to enter their age. Use the age to figure out if they vote. 

    -> 18+ : You are eligible to vote
    -> < 18: You must be at least 18 years old to vote

If the person is not a USA citizen: You must be US citizen in order to vote"

 */

public class EligibleToVote {
	public static void main(String[] args) {
		
		String citizenShip = "USA";
		int age = 20;
		
		if (citizenShip == "USA") {
			if (age >= 18) {
				System.out.println("You are eligible to vote");
			} else {
				System.out.println("You must be at least 18 years old to vote");
			}
		} else {
			System.out.println("You must be US citizen in order to vote");
		}
	}

}
