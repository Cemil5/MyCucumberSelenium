package day30_args_wrapperClass;

public class varArgs {

	public static void main(String[] args) {

		
		sum(2,4);
		sum(2,3,4,5);
		
		System.out.println(concat("apple", "orange", "123", "result"));
	}

	public static void sum(int... numbers) {  // a varArg (variable argument) parameter can take a variable number of argument, numbers variable is an array now
		
		int sum =0;
		
		for (int value : numbers) {
			sum = sum + value;
		}
		
	}
	
	public static String concat(String... strs) {
		String newStr = "";
		for (String str : strs) {
			newStr += str.charAt(2); 
		}
		return newStr;
	}
	
}
