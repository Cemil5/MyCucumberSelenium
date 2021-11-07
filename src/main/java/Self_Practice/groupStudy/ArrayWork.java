package groupStudy;

import java.util.Arrays;

public class ArrayWork {

	public static void main(String[] args) {

	//write a method that returns you the letters between two //different items given among your array elements
        
	       char[] letters = {'a','b','c','s','h','e','l','l','o','m','l','m','a','n'};

	       System.out.println(letters);
	       
	       System.out.println(getBetween(letters,'s','m'));     //result : hello
	       System.out.println(getBetween(letters,'b','o'));		//result : cshell
	}

	public static char[] getBetween(char[] letters, char c, char d) {
		int indexC = -1; // Arrays.binarySearch(letters, 's');
		int indexD = -1; // Arrays.binarySearch(letters, d);
	
		for (int i = 0; i<letters.length; i++) {
			if (indexC ==-1 && letters[i] == c){
				indexC = i;	
			} else if (indexD ==-1 && letters[i] == d){
				indexD = i;
			}
		}
		
		System.out.println(indexC + "  "+ indexD);
		
		char[] arr = new char[indexD - indexC-1];
		System.out.println(arr.length);
		
		for (int i=0; i<arr.length; i++) {
			arr[i] += letters[i+indexC+1];
		}
		
		return arr;
	}

}
