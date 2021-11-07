package labs.Lab3;

public class Q12 {

	public static void main(String[] args) {

		System.out.println(catDog("catdog") == true);
		System.out.println(catDog("catcat") == false);
		System.out.println(catDog("1cat1cadodog") == true);
	}
	
	public static boolean catDog(String str) {
		boolean b =false;
		int countCat =0;
		int countDog =0;
		
		for (int i=0; i<str.length()-2; i++) {
			if (str.substring(i, i+3).equalsIgnoreCase("cat")) {
				countCat++;
			}
			if (str.substring(i, i+3).equals("dog")) {
				countDog++;
			}
		}

		b = countCat == countDog;
		
		return b;
	}
	
	public static boolean catDog1(String str) {
		boolean b =false;
		int countCat =0;
		int countDog =0;
		
		while (str.contains("cat") || str.contains("dog")) {
			if (str.contains("cat")){
				countCat ++;
				str = str.replaceFirst("cat", "");
			}
			if (str.contains("dog")){
				countDog ++;
				str = str.replaceFirst("dog", "");
			}
		}
		b = countCat == countDog;
		b = false;
		countCat =0;
		countDog =0;

		
		// ------- option 2
		
		for (int i=0; i<str.length()-2; i++) {
			if (str.substring(i, i+3).equalsIgnoreCase("cat")) {
				countCat++;
			}
			if (str.substring(i, i+3).equals("dog")) {
				countDog++;
			}
		}

		
		b = countCat == countDog;
		
		
		
		
		return b;
	}
}
