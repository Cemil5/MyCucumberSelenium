package replit;
import java.util.*;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// index number 8 in the sequence of 
		 // 0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21) 
		 Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	}
	public static void fib(int num){
		int first =0, second =1, next=0;
		if (num==1){
			num =2;
		}

		for (int index =2;index<=num;index ++) {
			next = first + second;
			first = second;
			second = next;
			//System.out.println("index " +index+" first: " +first+" second: "+second+" next: "+next);
		}
		System.out.println(next);		
	}
	
}
