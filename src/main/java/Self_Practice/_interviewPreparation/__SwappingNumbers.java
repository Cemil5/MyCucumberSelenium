package _interviewPreparation;

public class __SwappingNumbers {

	public static void main(String[] test) {

		dummyVariable(010, 20);
		noVariable(15, 25);
		noVariable2(150, 250);
	}
	
	public static void dummyVariable(int n1, int n2) {
		int swap =n1;
		n1 = n2;
		n2 = swap;
		System.out.println("n1 = " + n1 + " n2 = " + n2);
	}

	public static void noVariable(int n1, int n2) {		
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.println("n1 = " + n1 + " n2 = " + n2);
	}
	
	public static void noVariable2(int n1, int n2) {		
		
		n2 = (n1 + n2) - (n1 = n2);
		
		System.out.println("After swapping:");
		System.out.println("Number 1 is " + n1);
		System.out.println("Number 2 is " + n2);
	}
}
