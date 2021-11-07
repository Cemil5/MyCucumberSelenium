package replit.array;

public class GetDuplicates_Replit {
/*
If there is any element is duplicated, the method counts how many of those present in the array.

Example :
getDup(["1","2","aa"',"1"])  returns:2   ("1" is duplicated and there are two "1"s so return is 2)
getDup(["1","2","aa"',"1", "aa"]) returns:4 ("1" is duplicated and there are two "1"s and 2 "aa"s so return is 4)
getDup(["1","g","aabb',"7","7","2","aa"',"7"])   returns:3

hint: you will need a nested array the will run on the array we get from the method argument. inside the nested loop you will need to check if the main array element is equal to the current
 */
	public static void main(String[] args) {
				
		String[] str1 = {"1","2","aa","1"};
		String[] str2 = {"1","2","aa","1", "aa"};
		String[] str3 = {"8","1","g","aabb", "7", "7","2","aa","7"};
		String[] str4 = {"6","a","d","a", "a", "a","d"};

		
		System.out.println(getDup(str3));
		System.out.println(getDup(str4));

		System.out.println(getDup(str1));
		System.out.println(getDup(str2));
	
	}



	public static int getDup(String[] r) {
		int result = 0;
		
		for (int i=0; i<r.length;i++) {
			boolean b = true;
			for (int j=i+1;j<r.length;j++) {
				if (r[i] !="" && r[i].equals(r[j])) {
					if (b) {
						result +=2;
						b = false;
						r[j]="";
					} else {
						result ++;
						r[j]="";
					}
				}
			}
		}
		
		return result;
	}
	
}
