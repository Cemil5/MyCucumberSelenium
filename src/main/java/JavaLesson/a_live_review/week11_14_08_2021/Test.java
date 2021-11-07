package a_live_review.week11_14_08_2021;

import java.util.Arrays;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test {

	public static void main(String[] args) {
		
		String name = "Madam";
		String reversedName = StringUtility.reverse(name);
		
		System.out.println(reversedName);
		
		boolean r1 = StringUtility.isPalindrome(name);
		System.out.println(r1);
		
		
		String str1 = "aaaaaaaaaaaabbbbbbbbbcccdddddaaaaaaeeeeeefff";
		System.out.println(StringUtility.removeDup(str1));
		
		
		String str2 = "listen";
		String str3 = "netlis";
		boolean r2 = StringUtility.isAnagram(str2, str3);
		System.out.println(r2);
		
		
		String str4 = "aaaabccccdeeeef";
		String unique = StringUtility.unique(str4);
		System.out.println(unique);
		
		
		int freq = StringUtility.frequency(str4, 'a');
		System.out.println(freq);
		
		System.out.println(StringUtility.frequencyOfChars("aabbaaabccd"));
		
		int[] arr = {1, 100, 200, 300, 4,5,6,8,10};
		double[] arr2 = {1.5, 2.5, 0, -1};
		
		int max = ArraysUtility.max(arr);
		System.out.println(max);
		System.out.println(ArraysUtility.min(arr));

		
		System.out.println(ArraysUtility.max(arr2));
		System.out.println(ArraysUtility.min(arr2));

		
		int [] a1 = {1,2,3,4,5,6};
		int [] a2 = {7,8,9,10,11,12,13,14};
		int [] a3 = ArraysUtility.merge(a1, a2);
		
		System.out.println(Arrays.toString(a3));
		
		String [] s1 = {"A", "B", "C"};
		String [] s2 = {"D", "E", "F", "H", "I"};
		
		String [] s3 = ArraysUtility.merge(s1, s2);
		System.out.println(Arrays.toString(s3));
		
		System.out.println(Arrays.toString(ArraysUtility.reverse(a1)));
		System.out.println(Arrays.toString(ArraysUtility.reverse(s1)));
		System.out.println(Arrays.toString(ArraysUtility.reverse(arr2)));
	}

}
