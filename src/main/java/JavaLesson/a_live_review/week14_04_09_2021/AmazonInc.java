package a_live_review.week14_04_09_2021;

public class AmazonInc { // Amazon Has A Tester, Developer, Teacher, Driver

	public static void main(String[] args) {
		
		Tester tester = new Tester("Selami", 'M', 25, "SDET", 100000);
		
		Developer developer = new Developer("Annie", 'F', 28, "Java Developer", 110000);
		
		Teacher teacher = new Teacher("Asiya", 'F', 24, "Softskill teacher", 110000);
		
		Driver driver = new Driver("John", 'M', 32, "Truck Driver", 95000);
		
		System.out.println(teacher);
		System.out.println(developer);
		System.out.println(tester);
		System.out.println(driver);
		
		System.out.println("-------------------");
		tester.work();
		developer.work();
		teacher.work();
		driver.work();
		
		tester.findBugs();
	//	driver.findBugs();
		
		tester.setJobTitle("QA");
		System.out.println(tester);
		
		tester.setSalary(10);
		System.out.println(tester);

	}

}
