package day35_Encapsulation;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	
	
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	
	
	//setters
	public void setAge(int i) {

		this.age=age;
		
	}
	
	//getters
	public int getAge() {
		return age;
	}
		
	

}
