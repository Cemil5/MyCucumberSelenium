package day15_MethodOverloading_Review;

public class Task68_Age {

	public static void main(String[] args) {
		yearsUntilRetirement("Mike", 1977);
	}

	public static int calculateAge (int yearBirth) {
		return 2021 - yearBirth;
	}
	public static void yearsUntilRetirement(String name, int year) {
		int retirement = 65 - calculateAge(year);
		System.out.println(name + " retires in " + retirement + " years");;
	}
	
}
