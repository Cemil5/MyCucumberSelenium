package day14_Methods;

public class Task65_Grades3 {

	public static void main(String[] args) {

		calculate(79, 79, 79);
	}
	public static void calculate(int g1, int g2, int g3) {
		
		double average = (g1+g2+g3)/3;
		if (average<= 100 && average >=90) {
			System.out.println("A");
		} else if (average >=80) {
			System.out.println("B");
		} else if (average >=70) {
			System.out.println("C");
		} else if (average >=60) {
			System.out.println("D");
		} else if (average >=0) {
			System.out.println("F");	
		} else {
			System.out.println("Enter valid numbers");
		}
	}
	
}
