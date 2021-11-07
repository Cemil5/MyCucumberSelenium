package day31_ArrayList;

public class Task98_filterNumbers {

	public static void main(String[] args) {

		String str = "((O!n^$%e&'() ()=T<789w[]{o @F<<<<<<<<<<344354<<<<<<<i²²²v##¼e½¾ S{{[i3434234[[[x]]]|}{";
		
		System.out.println(filterNumbers(str));
	}
	
	public static String filterNumbers(String s) {
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)|| ch == ' ') {
				str += ch;
			}
		}
		String[] arr = str.split(" ");
		String result = "";
		
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i].toLowerCase()) {
				case "one" :
					result += 1 ;
				break;
				case "two" :
					result += 2 ;
				break;
				case "three" :
					result += 3 ;
				break;
				case "four" :
					result += 4 ;
				break;
				case "five" :
					result += 5 ;
				break;
				case "six" :
					result += 6 ;
				break;
				case "seven" :
					result += 7 ;
				break;
				case "eight" :
					result += 8 ;
				break;
				case "nine" :
					result += 9 ;
				break;
				case "zero" :
					result += 0 ;
				break;
			}
			result +=" ";
		}
		
		return result;
	}
	
	
}
