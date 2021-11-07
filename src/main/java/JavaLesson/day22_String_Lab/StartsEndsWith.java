package day22_String_Lab;

public class StartsEndsWith {

	public static void main(String[] args) {


		String word1 = "eclipse";
		System.out.println(word1.startsWith("e"));	//true
		System.out.println(word1.startsWith("ec")); //true
		System.out.println(word1.startsWith("ex")); //false
		
		
		System.out.println(word1.endsWith("se")); //true
		
		String word2 = "Mr.";
		
		if (word2.startsWith("Mr.")){
			System.out.println("married man");
		} else if (word2.startsWith("Mrs.")){
			System.out.println("married woman");
		} else if (word2.startsWith("Ms.")){
			System.out.println("married/unmarried woman");
		} else if (word2.startsWith("Dr.")){
			System.out.println("Doctor man or woman");
		} else {
			System.out.println("unknown status");
		} 
		
	}

}
