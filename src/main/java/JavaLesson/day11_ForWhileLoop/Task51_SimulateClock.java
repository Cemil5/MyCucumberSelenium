package day11_ForWhileLoop;

public class Task51_SimulateClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int hour = 12; hour<=12; hour++ ) {
			for (int min =59; min<=59; min++) {
				for (int sec = 41; sec<=59; sec++) {
					System.out.println(hour + ":"+ min+":"+sec);
				}
			}
		}

	}

}
