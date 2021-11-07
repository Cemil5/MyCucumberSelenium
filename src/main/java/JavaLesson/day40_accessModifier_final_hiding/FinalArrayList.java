package day40_accessModifier_final_hiding;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayList {

	final static int[] nums = {1, 2, 3};
	static int[] nums1 = new int[10];
	final static ArrayList <String> ss = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		
		COLORS.add("Orange");
		COLORS.add("Red");
		COLORS.remove(0);
		
		// COLORS = new ArrayList<>();
		
		nums1[0] = 1;
		nums1[9] = 9;
		
		System.out.println(Arrays.toString(nums1));
		
		
	}

}
