package replit;
import java.util.Scanner;
public class PrintNtimes {

	public static void main(String[] args) {

	//	Scanner scan = new Scanner(System.in);
	//	int n= scan.nextInt();
		
	//	for (int i=1; i<=n;i++) {
		//	System.out.print("*");
	//	}
		
		for (int i=80; i>=20;i-=2) {
			System.out.print(i);
			if (i>20) {
				System.out.print(" ");
			}
		}
		
		
	}

}
