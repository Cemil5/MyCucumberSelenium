package day14_Methods;
import java.util.Scanner;
public class Task64_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		triangle(num);
	}
	public static void triangle(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
