package a_live_review.week09_31_07_2021;
/*
Write a program that can remove duplciated characters from a string
        ex:
            str = "aaaabbbbbbcccccccccdddd"
            output:
                abcd
 */
public class RemoveDuplicate_Muhtar {

	public static void main(String[] args) {

		String str = "aaaabbbbbbcccccccccddddeeeeeffffffffffffaaaaaaaaaa";
		String result = "";
		
		for (int i=0; i< str.length();i++){ // i: 0, 1, 2,3,4,
			char ch = str.charAt(i);
			
			if (!result.contains(""+ch)) {	// 'a' ==> "a"
				result += ch;
			}
		} 
		
		System.out.println(result);
	}
	
	public static void replacing (String str) {
		String result = "", ch;
		int i = 0;
		
		while (!str.isEmpty()) {
			ch 	= ""+str.charAt(i);
			str = str.substring(i+1);
			str = str.replace(ch, "");
			result +=ch;
			i ++;
		} 
		System.out.println(result);
	}
}
