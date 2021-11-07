package day45_exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println(7/0);
			
			String str = null;
			System.out.println(str.toUpperCase());
			
			int[] n = {10, 4};
			System.out.println(n[2]);
			
		} catch (ArithmeticException e) {
			System.out.println("Aritmetic exception happened");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException happened");
		} catch (RuntimeException e) {
			System.out.println("runtime exception");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("exception happened");
		}
		
		
		
		
	}

}
