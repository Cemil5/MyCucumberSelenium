package a_live_review.week12_21_08_2021;

public class EmployeeObject {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Mike", 'M', 50, 11, "SDET", 90_000);
		Employee emp2 = new Employee("Annie", 'F', 25, 12, "QA", 95_000);

		System.out.println(emp1);
		System.out.println(emp2);
		
		emp1.work();
		emp2.attendMeeting();
	}

}
