package day44_OPP_review.callcenter;

public abstract class MessagingApp {
	
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE = "Messenger";
	
	
	
	
	public MessagingApp() {
		System.out.println("MessagingApp no-args constructor...");
	}


	public MessagingApp(String name, int count) {
		this.name = name;
		MessagingApp.count = count;
	}
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) { // this : this object  this() : constructor with argument
		MessagingApp.count = count;
	}

	protected abstract void sendMessage(String msg);
	
	void launch() {
		System.out.println("launch the messaging application");
	}
	
	public static void close() {
		System.out.println("close the messaging application");
	}

}
