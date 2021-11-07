package day12_BranchingStatements;

public class BranchingStatements {

	public static void main(String[] args) {

		int n = 0;
		while (n < 15) {
			n++;
			if (n<=5) {
				System.out.println("skip " + n);
				continue;
			}
			System.out.println("num " +n);
			if (n>=10) {
				System.out.println("breaking " + n);
				break;
			}
		}
		
	}

}
