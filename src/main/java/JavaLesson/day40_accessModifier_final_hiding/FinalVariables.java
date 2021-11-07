package day40_accessModifier_final_hiding;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;
	
	public FinalVariables(){
		MODEL_3_MAXSPEED = 252;
		// ADMIN_USERNAME ="Ozzy";
	}
	
	
	{
		MODEL_X_PASSENGERS = 7;
	}
	
	
	static {
		ADMIN_USERNAME ="Ozzy";
	}
	
	public static void main(String[] args) {
		
		FinalVariables f = new FinalVariables();
		
		final int MAX_PASSENGERS_COUNT = 5;
		final int SSN;
		
		SSN=66;
		System.out.println(f.ROADSTER_MAX_RANGE);
		System.out.println(ADMIN_USERNAME);
		System.out.println(f.MODEL_3_MAXSPEED);
		
	}

}
