package day45_exceptions;

public class TryCatch2 {

	public static void main(String[] args) {
		
		int[] nums = {36,6,34,12};
		
	//	System.out.println(nums{0]);  // compile error
		
		try {
			System.out.println(nums[6]);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("wrong index");
			System.out.println(e.getMessage());
		}
		System.out.println("continue");
	}
}
