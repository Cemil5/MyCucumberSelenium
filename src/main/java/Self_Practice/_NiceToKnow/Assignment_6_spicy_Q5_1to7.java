package _NiceToKnow;

public class Assignment_6_spicy_Q5_1to7 {

	public static void main(String[] args) {
		
		int num = 9;
		for (int i =1; i<=num; i++) {
			for (int j=1; j<=num-i; j++) {
				System.out.print(1);
			}
			for (int j=num-i; j<num; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
