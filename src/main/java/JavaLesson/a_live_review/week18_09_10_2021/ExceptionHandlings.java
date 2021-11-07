package a_live_review.week18_09_10_2021;

public class ExceptionHandlings {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("test started");
		
		int[] arr = {1,2,3};
		
		try {
			System.out.println(arr[2000]); // unchecked exception
		} catch (RuntimeException e) {	//ArrayIndexOutOfBoundsException
			e.printStackTrace();
		}
		
		System.out.println("test completed");
		
		
		System.out.println("----------------------------------------");
		
		System.out.println("test2 started");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("test2 completed");

		
		System.out.println("----------------------------------------");
		
		System.out.println("test3 started");

		Thread.sleep(4000);
		
		
		System.out.println("test3 completed");

		
		
	}

}
