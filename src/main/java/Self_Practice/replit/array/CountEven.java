package replit.array;

public class CountEven {

	public static void main(String[] args) {
		
	int [] nums1 = {2, 1, 2, 3, 4}; // → 3

	int [] nums2 = {2, 2, 0, 3, 5};// → 3

	int [] nums3 = {1, 3, 5, 7, 9}; // → 0
	
	int [] nums4 = {2, 4, 2, 3, -2}; // → 0
	int [] nums5 = {2, 2, 5, 3, 0 }; // → 0
	int [] nums6 = {1, 33, 5, 7, 9}; // → 0
	
	int [] nums7 = {1, 1, 2, 3, 4, 3, 4}; // → 2
		
/*	System.out.println(evens(nums1));
	System.out.println(evens(nums2));
	System.out.println(evens(nums3));

	System.out.println(max(nums3));
	System.out.println(max(nums4));
	System.out.println(max(nums5));
	System.out.println(max(nums6));

	nonDuplicate(nums7); */
	
	sum(nums1);
	
	
	}
	
	private static void sum(int[] nums) {
		
		int sum = 0;
		
		for (int each : nums) {
			sum += each;
		}
		
		System.out.println(sum);
	}

	public static int nonDuplicate(int[] nums) {
		int nonDup = 0;
		
		for (int i =0; i<nums.length; i++) {
			int count =0;
			for (int j=0; j<nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				} else if (count >= 2) {
					break;
				}
			}
			if (count == 1) {
				nonDup = nums[i];
				break;
			}
		}
		System.out.println(nonDup);
		
		return nonDup;
	}
	
	
	
	public static int max(int[] nums) {
		int max = nums[0];
		
		for (int i=1; i< nums.length; i++) {
			if (nums[i]>max) {
				max = nums[i];
			}
		}
		System.out.println(max);
		return max;
	}
	
	public static int evens(int[] nums) {
		int count=0;
		
		for (int each : nums) {
			if (each % 2 ==0) {
				count ++;
			}
		}
		System.out.println(count);
		
		return count;
	}
	
}
