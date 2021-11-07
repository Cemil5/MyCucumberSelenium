package day13_Method;

public class PassingArguements_Task58_GreaterNumber {

	public static void main(String[] args) {
		greater(28, 2);
		int i =2;
		greater(i*2, 6);
	}
	
	public static void  greater(int n1, double n2) {
		if (n1>n2) {
			System.out.println(n1+" n1 is bigger "+n2);
		} else if (n1<n2) {
			System.out.println("n2 is bigger");
		} else {
			System.out.println("numbers are equal");
		}
	}
	
}
