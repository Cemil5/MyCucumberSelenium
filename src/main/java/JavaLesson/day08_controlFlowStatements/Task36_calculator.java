package day08_controlFlowStatements;

public class Task36_calculator {
	public static void main(String[] args) {
		
		int i1 = 2;
		int i2 = 3;
		double res =0;
		String operator = "/";
		
		switch (operator) {
		case "+":
			res = i1 + i2;
			break;
		case "-":
			res = i1 - i2;
			break;
		case "*":
			res = i1 * i2;
			break;
		case "/":
			res = (double)i1 / i2;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		System.out.println("Result is " + res);
	}

}
