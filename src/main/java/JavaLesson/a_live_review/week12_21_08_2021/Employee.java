package a_live_review.week12_21_08_2021;

public class Employee {
	
	public String name;
	public char gender;
	public int age;
	public long id;
	public String jobTitle;
	public double salary;
	
	
	public Employee(String name, char gender, int age, long id, String jobTitle, double salary) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}	// we can set all the instances when the object is created
	
	public void work() {
		System.out.println(name + " is working");
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending meeting");
	}

	@Override
	public String toString() {	// we will not get a hashcode when we pass an object of Employee
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + ", id=" + id + ", jobTitle="
				+ jobTitle + ", salary= $" + salary + "]";
	}
	
	
}
/*
Attributes:
	name, gender, age, id, jobTitle, salary
	
actions:
	work(), attendMeeting(), toString()

*/