package day03_VariablesDataTypes;

public class VariableDeclaration {
	public static void main(String[] args) {
		
		//declaration
		byte inches;
		int speed;
		double month;
		long salesCommission;
		float distance;
		
		//assinged
		inches=90;
		speed=500;
		month=2345345435324523554332.65566;
		distance=954_40442.0F;
		salesCommission=546545632;
		char firstLetter = 'A';
		inches = 'A';
		String firstName = "Adam";
		String lastName = "Smith";
		String fullName = firstName+ " " +lastName;
		System.out.println(fullName);
		
				
		
		//declared + assigned
		byte inches2=5;
		
		System.out.println("My Number is " + inches);
		
		inches=95;
		//fullName = speed + inches2;
		System.out.println("My Number is " + (speed + inches2));
		System.out.println(""+speed + inches2);
		System.out.println(fullName);

		//Test case -> check the balances with 100 different account numbers
		
		int nValue = (int) (3.14156);
		System.out.println(nValue);
	}

}
