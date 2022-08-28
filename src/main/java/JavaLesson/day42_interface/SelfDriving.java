package JavaLesson.day42_interface;

public interface SelfDriving {
	
	void selfDrive(); // public abstract
	
	static void test() {
		//Integer i = 0;
		System.out.println("static method - self driving");
	}
	
	default void defaultMethod() {
		System.out.println("default method - self driving");
	}

}
