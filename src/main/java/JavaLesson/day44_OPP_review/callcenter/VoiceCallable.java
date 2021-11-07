package day44_OPP_review.callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = true;	// public static final boolean CAN_CALL = true;
	
	public abstract void call(String contact);
	
	public static void decline() {
		System.out.println("Mike declined voice call..");
	}
	
	// default (keyword) method: accessible in same package
	public default void accept() {
		System.out.println("Mike finally accepted voice call..");
	}

}
