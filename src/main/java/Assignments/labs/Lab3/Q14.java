package labs.Lab3;

public class Q14 {

	public static void main(String[] args) {
		
		System.out.println(endsLy("oddly") == true);
		System.out.println(endsLy("y") == false);
		System.out.println(endsLy("oddy") == false);
	}
	
	public static boolean endsLy(String str) {
		
		
		return str.endsWith("ly");
	}
	

}
