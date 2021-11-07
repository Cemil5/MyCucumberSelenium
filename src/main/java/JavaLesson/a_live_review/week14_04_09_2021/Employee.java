package a_live_review.week14_04_09_2021;

public class Employee {
	private String name; // Name, gender, age, jobTitle, salary, 
	private final char gender;
	private int age;
	private String jobTitle;
	private double salary;

	public static boolean hasJob;	// don't put getter / setter for static variables

	static {
		hasJob = true;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age<=0) {
			System.err.println("age cannot be negative or zero");
			return;
		}
		if (age<18) {
			System.err.println("age of the employee at least has to be 18");
			return;
		}
		this.age = age;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setSalary(double salary) {
		if (salary<=0) {
			System.err.println("salary cannot be negative or zero");
			return;
		}
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	
	public Employee(String name, char gender, int age, String jobTitle, double salary) {
		setName(name);
		setAge(age);
		setJobTitle(jobTitle);
		setSalary(salary);
		this.gender = gender;
	}

	public void work() {
		System.out.println(name + " is working");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + ", jobTitle=" + jobTitle + ", salary="
				+ salary + "]";
	}
	
	
	
	
}
