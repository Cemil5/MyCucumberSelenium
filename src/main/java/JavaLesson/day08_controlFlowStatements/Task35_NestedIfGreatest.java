package day08_controlFlowStatements;

public class Task35_NestedIfGreatest {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 4;
		int n3 = 50; 
		
		if (n1>n2 && n1>n3) {
				System.out.println("n1 is the greatest");
			} else {
				if (n2>n3) {
				System.out.println("n2 is the greatest");		
				} else {
					System.out.println("n3 is the greatest");
				}
			}
	}

}
