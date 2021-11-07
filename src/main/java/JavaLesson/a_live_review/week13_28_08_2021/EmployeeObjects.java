package a_live_review.week13_28_08_2021;

public class EmployeeObjects {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("John", "SDET", 95000);
		Employee e2 = new Employee("Matt", "Developer", 110000);
		Employee e3 = new Employee("Aaron", "Scrum Master", 100000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(Employee.colors);
		
		System.out.println(e1.hasJob);
		System.out.println(Employee.hasJob);

	}

}
