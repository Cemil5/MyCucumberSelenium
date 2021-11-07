package day13_Method;

public class Task60_Calculating3Parameters {

	public static void main(String[] args) {

		calculate(6,3,'*');
	}
	public static void calculate(double n1, double n2, char operator) {
		
		double result =0;
		switch (operator) {
		case '+':
			result = n1+n2;
			break;
		case '-':
			result = n1-n2;
			break;	
		case '*':
			result = n1*n2;
			break;	
		case '/':
			result = n1/n2;
			break;	
		default :
			System.out.println("Enter valid operator");
		}
		System.out.println("Result : "+result);
		
	}
	
}
