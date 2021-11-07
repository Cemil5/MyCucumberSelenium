package a_live_review.week16_25_09_2021;

public interface Volume { // public is the only access modifier that can be used
	
	boolean hasVolume = true; // by default: static & final 
	
	
	double volume();	// by default: abstract
	
	
	default int test1() {
		
		
		return 0;
	}
	
	
	
//	public static void main(String[] args) {
//		System.out.println(hasVolume);
//	}
	
}
