package day37_inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Student student = new Student();
		
		person.name = "Mike";
		person.age = 35;
		person.gender = 'M';
		
		student.name = "Smith";
		student.age = 30;
		student.gender = 'M';
		
		student.studentID = 1000;
		
		person.eat("steak");
		student.eat("pizza");
		
	//	person.code("java");
		student.code("java");

		
		
		
	}

}
