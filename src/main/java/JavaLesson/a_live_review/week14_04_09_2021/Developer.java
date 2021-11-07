package a_live_review.week14_04_09_2021;

public final class Developer extends Employee {

	public Developer(String name, char gender, int age, String jobTitle, double salary) {
		super(name, gender, age, jobTitle, salary);
	}
	
	@Override
	public void work() {
		System.out.println(getName() + " is coding");
	}
	public void fixBug() {
		System.out.println(getName() + " is fixing bugs");
	}
}
