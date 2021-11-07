package day20_StringClass;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = "Apple";
		String str2 = new String("Apple");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
