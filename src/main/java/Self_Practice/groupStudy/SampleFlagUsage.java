package groupStudy;

public class SampleFlagUsage {

	public static void main(String[] args) {
		
		//write a method that returns you the letters between two //different items given among your array elements
        
	       char[] letters = {'a','b','c','s','h','e','l','l','o','m','l','m','a','n'};

	    //   System.out.println(letters);
	       
	       System.out.println(getBetween(letters,'s','m'));     //result : hello
	       System.out.println(getBetween(letters,'b','o'));		//result : cshell
	}

	
	public static String getBetween(char[] letters, char firstChar, char secondChar) {		// mentor solution

        String result="";
        boolean flag = false;

        for (int i = 0; i < letters.length; i++) {

            if (letters[i] == firstChar){
                flag=true;

                i++;
            }
            if (flag){
                result+=letters[i];
            }
            if (letters[i]==secondChar){
                flag=false;
            }

           
        }

        return result;
    }    
	
	
	public static char[] myGetBetween(char[] letters, char c, char d) {
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
		
public static String GroupMembersGetBetween(char[] letters, char first, char second) {
		
		String result = "";
		int index1=0, index2=0;
		boolean flag1 = false;
		boolean flag2 = false;
		
		
		for (int i = 0; i < letters.length; i++) {
			
			if (letters[i] == first && !flag1) {
				index1 = i;
				flag1 = true;
				
			} else if (letters[i] == second && !flag2) {
				index2 = i;
				flag2 = true;
			}
		}
		
		if (index1 < index2) {
			
			for (int i = index1 + 1 ; i < index2 ; i++) {
				result += letters[i];
			}
		}
		
		return result;
	}

}
