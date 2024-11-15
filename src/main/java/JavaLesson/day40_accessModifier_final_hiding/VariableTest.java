package day40_accessModifier_final_hiding;

public class VariableTest {

	public static void main(String[] args) {
		
		Child s = new Child();
		System.out.println("Value of x before increment " + s.x);
		
		s.increment();
		
		System.out.println("Value of x after increment " + s.x);
		
		Parent p = new Parent();
		
		System.out.println("Value of x before increment " + p.x);
		
		p.increment();
		
		System.out.println("Value of x after increment " + p.x);

	}

}
