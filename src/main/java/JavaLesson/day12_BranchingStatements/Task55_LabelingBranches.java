package day12_BranchingStatements;

public class Task55_LabelingBranches {

	public static void main(String[] args) {

		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						break outer;
					}
			}while(true);
	}

}
