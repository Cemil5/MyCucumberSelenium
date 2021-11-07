package day47_collection_part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		
		Vector <Integer> numsStack = new Stack<>();
		
		numsStack.add(50);
		numsStack.add(70);
		numsStack.add(500);
		numsStack.add(510);
		
		System.out.println(numsStack.toString());	// [50, 70, 500, 510]
		
		//check value on top of stack
		System.out.println(((Stack<Integer>)numsStack).peek());		// 510
		System.out.println(numsStack.toString()); 	// [50, 70, 500, 510]

		
		// read  value on top of stack then remove it
		((Stack<Integer>)numsStack).pop();	
		System.out.println(numsStack.toString());	// [50, 70, 500]

		((Stack<Integer>)numsStack).push(800);
		System.out.println(numsStack.toString());	// [50, 70, 500, 800]
		
		System.out.println(numsStack.get(1));   	// 70
	}

}
