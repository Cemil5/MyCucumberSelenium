package day20_StringClass;

public class String_Index2 {

	public static void main(String[] args) {

		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", firstDash+1);
		System.out.println(secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list.lastIndexOf("-"); // en sondan baþlayarak arama yapar
		System.out.println(lastDash);
	}

}
