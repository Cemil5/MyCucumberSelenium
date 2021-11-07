package day40_accessModifier_final_hiding;

public class Marsupial {
	
	public static boolean isBiped() {
		return false;
	}
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}
}
