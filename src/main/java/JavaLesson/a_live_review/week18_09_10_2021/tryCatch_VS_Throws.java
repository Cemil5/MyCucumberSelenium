package a_live_review.week18_09_10_2021;

public class tryCatch_VS_Throws {

	public static void main(String[] args) throws InterruptedException {
		
		method1();
		
		method2();
		
	}
	
	public static void method1() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void method2() throws InterruptedException {
		
		Thread.sleep(3000);
		
	}

}
