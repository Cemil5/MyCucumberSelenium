package day07_controlFlowStatements;

public class SmallTasks2 {
	public static void main(String[] args) {
		
		int x = 90, y = 0;
		
		if (x>100) {
			y = 20;
		}
		else {
			y = 0;
		}
		System.out.println("x = " + x + " y = " + y);
		
		y = 90;
		if (y==100) {
			x = 1;
		}
		else {
			x = 0;
		}
		System.out.println("x = " + x + " y = " + y);

	}

}
