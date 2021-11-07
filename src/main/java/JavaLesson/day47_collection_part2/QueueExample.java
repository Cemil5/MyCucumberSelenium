package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Jamal");
		queue.add("Asiya");
		queue.add("Oscar");

		System.out.println(queue.toString()); 	// [Mike, Ozzy, Jamal, Asiya, Oscar]
		
		String name = queue.remove();
		
		System.out.println(name);
		System.out.println(queue.toString()); 	// [Ozzy, Jamal, Asiya, Oscar]
		
		// removing an element from Queue using poll()
		// the poll() method is similar to remove() except that it returns null if the queue is empty
		name = queue.poll();
		
		System.out.println(name);
		System.out.println(queue.toString()); 	// [Jamal, Asiya, Oscar]
		
		// get the element at the front of the queue without removing it using peek()
		name = queue.peek();
		
		System.out.println(name);				// Jamal
		System.out.println(queue.toString()); 	// [Jamal, Asiya, Oscar]
		
		
	}

}
