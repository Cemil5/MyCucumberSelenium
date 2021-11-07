package day40_accessModifier_final_hiding;

public class Kangaroo extends Marsupial {
	
//	@Override
//	public boolean isBiped() {
//		return true;
//	}
	
	public static boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs:" + isBiped());
	}

}
