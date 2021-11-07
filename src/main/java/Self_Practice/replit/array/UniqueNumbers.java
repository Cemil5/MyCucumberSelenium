package replit.array;

public class UniqueNumbers {

	public static void main(String[] args) {
		
		/* Write a void method **printUniqueNumbers** that will print unique numbers from an array of ints.`
		output:
			2
			9
			34	*/
		
		int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3}; 

		printUniqueNumbers(nums);
		
	}
	public static void printUniqueNumbers(int[] nums){
		
		for (int i=0; i<nums.length; i++) {
			int count =0;
			for (int j=0; j<nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count ==1) {
				System.out.println(nums[i]);
			}
		}
		
	}
}
