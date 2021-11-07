package Assignment_5_ForLoop;
/*
 * Write a program that displays the number of even numbers between 5 and 50 (included)
 */
public class Q3_EvenNumbers {

	public static void main(String[] args) {

		for (int i=5;i<=50;i++) {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
