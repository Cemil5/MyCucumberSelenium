package day30_args_wrapperClass;

import java.text.DecimalFormat;

// Write a program to output: 72 degree is equal to 22.22 celcius
public class Task96_DegToCelcius {

	public static void main(String[] args) {

		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		/// first option SUBSTRING
			
		String str2 = str1.substring(str1.indexOf("and ")+4, str1.indexOf(" degree") );
		
		System.out.println(str2);
		
		/// second option SPLIT
		String[] arr =str1.split("and ");
		arr = arr[1].split(" degree");
		str2 = arr[0];
		System.out.println(str2);

		
		int f = Integer.valueOf(str2);			// 
		int f1 = Integer.parseInt(str2) + 10;
		System.out.println(f1);
		
		double d = 5/9.0 * (f - 32);
		
		DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(d));
		
		
	}

}
