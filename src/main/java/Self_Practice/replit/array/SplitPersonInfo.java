package replit.array;

import java.util.Arrays;

public class SplitPersonInfo {

	public static void main(String[] args) {

		person("jon,doe.mmm,30");
		
		
	}
	  public static void person(String info) {
		  
		  String[] str = info.split(",");
		  System.out.println("person name: " + str[0]);
		  System.out.println("last name: " + str[1]);
		  System.out.println("age: " + str[2]);
		//  String[] str1 = str[1].split(".m");
		//  System.out.println(Arrays.toString(str1));
	  }
}
