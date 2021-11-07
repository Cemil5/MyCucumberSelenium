package day14_Methods;

public class Task62_GreatestNumber {

	public static void main(String[] args) {

		greatest (21,12,3);
	}
	public static void greatest(int n1, int n2, int n3) {
		
		if (n1>n2 && n1>n3) {
			System.out.println("n1 is greatest");
		} else if (n2>n3) {
			System.out.println("n2 is greatest");
		} else {
			System.out.println("n3 is greatest");
		}
	}
}
