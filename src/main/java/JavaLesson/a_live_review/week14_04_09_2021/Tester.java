package a_live_review.week14_04_09_2021;

public final class Tester extends Employee {

	public Tester(String name, char gender, int age, String jobTitle, double salary) {
		super(name, gender, age, jobTitle, salary);
	}

	@Override
	public void work() {
		System.out.println(getName() + " is testing");
	}
	
	public void findBugs() {
		System.out.println(getName() + " found the bug");
	}
	
	

}
