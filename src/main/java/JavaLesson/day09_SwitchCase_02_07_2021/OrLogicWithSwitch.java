package day09_SwitchCase_02_07_2021;

public class OrLogicWithSwitch {

	public static void main(String[] args) {

		char grade = 'D';
		
		switch (grade) {
		case 'A': case 'B': case 'C':
			System.out.println("pass");
		case 'D': case 'E':
			System.out.println("pass");
		}
	}

}
