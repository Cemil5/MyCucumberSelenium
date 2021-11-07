package labs.Lab3;

public class Q15 {

	public static void main(String[] args) {

		
		System.out.println(hasBad("badxx") == true);
		System.out.println(hasBad("xbadxx") == true);
		System.out.println(hasBad("xxbadxx") == false);	
		
	}
	
	public static boolean hasBad(String str) {
		boolean b = false;
		
			
		return str.indexOf("bad") ==0 || str.indexOf("bad") ==1;
	}

}
