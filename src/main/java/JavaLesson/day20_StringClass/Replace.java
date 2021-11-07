package day20_StringClass;

public class Replace {

	public static void main(String[] args) {

		String str = "Ebay is a very good Ebay";
		
		String replaced = str.replace("Ebay", "Amazon");
		System.out.println(replaced);
		str = str.replace("Ebay", "Amazon");
		System.out.println(str);
		
		String email = "firstName_LastName@gmail.com";
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
		
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpace = sentence.replace(" ", "");
		System.out.println(withNoSpace);
		
		System.out.println(sentence.replace(",", "!!"));
		
		String result = "About 8,930,000,000 results (0,68 seconds)";
		
		String newResult = result.replace("About ", "").replace(" results (0,68 seconds)", "");
		System.out.println(newResult);
	}

}
