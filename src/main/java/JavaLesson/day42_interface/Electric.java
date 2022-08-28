package JavaLesson.day42_interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false; // public final static
	
	
	public abstract void charge();
	
	void test(); // public abstract -- by default
	
	public default void methodA() {
		//code
	}
	

}
