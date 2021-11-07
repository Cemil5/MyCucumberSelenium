package day45_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			String str = "Java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));	// i might have problem here
			System.out.println(str.charAt(1));	// this line will not be executed
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println("---------------------------");
			//e.getMessage();
			System.out.println("Exception happend in try block and was cought");
		}
		System.out.println("after try catch block");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
