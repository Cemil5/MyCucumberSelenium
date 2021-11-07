package basics;

public class Bigger {
	public static void main(String[] args) {
		
		int a = 51;
		int b = 59;
		int c = 65;
		
		if (a>b && a>c) {
			System.out.println("a biggest");
		} else if (b>c) {
			System.out.println("b biggest");
		} else {
			System.out.println("c biggest");
		}
	} 

}
