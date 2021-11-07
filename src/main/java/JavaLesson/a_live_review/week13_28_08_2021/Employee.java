package a_live_review.week13_28_08_2021;

import java.util.ArrayList;

public class Employee {
	
	public String name;
	public String jobTitle;
	public double salary;
	public static boolean hasJob;
	
	public static ArrayList<String> colors;
	
	
	static {
		hasJob = true;
		// name = "John";  ERROR
		colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");

	}
	
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		hasJob = true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}
	
	

}
