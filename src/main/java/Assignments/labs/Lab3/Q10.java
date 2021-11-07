package labs.Lab3;

public class Q10 {

	public static void main(String[] args) {

		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));

		
	}

	public static boolean frontAgain(String word) {
		if (word.substring(0,2).equals(word.substring(word.length()-2))) {
			return true;
		} else {
			return false;
		}
	}
}
