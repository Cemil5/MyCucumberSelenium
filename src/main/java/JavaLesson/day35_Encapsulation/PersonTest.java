package day35_Encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("ozzy", 10, 'M');
		
		p.setAge(20); // user should not access directly to variable, but should access thru different mechanism.

		
		System.out.println(p.getAge());
		
		
		//Encapsulation:
		
		// cut the access --> private variables
		// create setter method to initialize my value
		// create getter method to retrieve it.
		
		// private variables
		// public setter methods
		// public getter methods
		
	}

}
