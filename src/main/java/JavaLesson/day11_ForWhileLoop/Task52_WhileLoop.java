package day11_ForWhileLoop;

public class Task52_WhileLoop {
	public static void main(String[] args) {
		
		int var = 25;
		
		do {
			System.out.println("in the loop1 "+var);
			var = var -1;
		} while (var>=10);
		
		var = 15;
		while (var>=10) {
			System.out.println("in the loop2 "+var);
			var = var-1;
		}
		
	}

}
