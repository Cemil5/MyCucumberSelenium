package mentorSolutions;

public class FindTheLargestElementInAnArray {

	public static void main(String[] args) {

		// Question Type 1:
		// Find the biggest number in the Array
			
			int[] numbers = {0,2,1,5,7,4};
			
			int max, min;
			
			max = numbers[0];
			min = numbers[0];
			
			for(int each : numbers) {
				max = Math.max(each, max);
				min = Math.min(each, min);
			}
			
			System.out.println("max : "+ max);
			System.out.println("min : "+ min);
			
			System.out.println("===============================");
		
		// Question Type 2:
		// Find the largest word in the sentence 
			
			String sentence = "I love Java and Pyhton";
			
			String[] words = sentence.split(" ");
			
			String largestWord = words[0];
			String smallestWord = words[0];
			
			for(String word : words) {
				
				if(word.length() > largestWord.length()) {
					largestWord = word;
				}
				
				if(word.length() < smallestWord.length()) {
					smallestWord = word;
				}		
						
			}
			
			System.out.println("LargestWord : "+largestWord);
			System.out.println("SmallestWord : "+smallestWord);
		
	}

}
