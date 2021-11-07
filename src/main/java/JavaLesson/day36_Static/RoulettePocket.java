package day36_Static;

public class RoulettePocket {
	
	/*
On a roulette wheel, the pockets are numbered from 0 to 36. The colors of the pockets are as follows:
Pocket 0 is green.
For pockets 1 through 10, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 11 through 18, the odd-numbered pockets are black and the even-numbered pockets are red.
For pockets 19 through 28, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 29 through 36, the odd-numbered pockets are black and the even-numbered pockets are red.

Write a class named RoulettePocket. The class's constructor should accept a pocket number. The class should have a method named getPocketColor that returns the pocket's color, as a string.

Demonstrate the class in a program that asks the user to enter a pocket number, and displays whether the pocket is green, red, or black. The program should display an error message if the user enters a number that is outside the range of 0 and 36.
	 */
	
	int number;
	
	public RoulettePocket(int number) {
		
		this.number = number;	
	}
	
	public String getPocketColor(int number) {
		String color="";
		
		if (number == 0) {
			color = "green";
		} else if (number>0 && number <= 10) {
				if (number % 2 == 0) {
					color = "black";
				} else {
					color = "red";
				}
		} else if (number>10 && number <= 18) {
				if (number % 2 == 0) {
					color = "red";
				} else {
					color = "black";
				}
		} else if (number>18 && number <= 28) {
				if (number % 2 == 0) {
					color = "black";
				} else {
					color = "red";
				}
		} else if (number>28 && number <= 36) {
				if (number % 2 == 0) {
					color = "black";
				} else {
					color = "red";
				}
		} else {
			System.err.println("number is outside the range of 0 and 36.");
		}
		return color;
	}
	
	
}
