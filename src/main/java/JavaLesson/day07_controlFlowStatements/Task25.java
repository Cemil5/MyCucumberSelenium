package day07_controlFlowStatements;

public class Task25 {
	public static void main(String[] args) {
		
		int firstNumber = 40;
		int secondNumber = 81;
		int thirdNumber = 100;
		int greatestNumber;
		
		greatestNumber = thirdNumber;
		
		
		if (firstNumber > thirdNumber) {
			greatestNumber = firstNumber;
		}
		
		if (secondNumber > greatestNumber) {
			greatestNumber = secondNumber;
		}
		
		System.out.println("Greatest number is " + greatestNumber);
	}

}
