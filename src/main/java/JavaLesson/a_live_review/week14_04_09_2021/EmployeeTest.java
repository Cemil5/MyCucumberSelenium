package a_live_review.week14_04_09_2021;

public class EmployeeTest {

	public static void main(String[] args) {

		Teacher teacher = new Teacher("Muhtar", 'M', 24, "teacher", 90_000);
		teacher.work();
		System.out.println(teacher);
		
		Driver driver = new Driver("John", 'M', 33, "driver", 50000);
		
		
	}

}
