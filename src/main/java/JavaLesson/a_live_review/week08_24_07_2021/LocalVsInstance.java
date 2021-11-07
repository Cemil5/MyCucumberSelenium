package a_live_review.week08_24_07_2021;

public class LocalVsInstance {
	
	//class and object are in the same page in this example
	
	// instance variable
	
	int a;
	String str;
	char ct;
	
	public void talk() {
		
		// local variable
		int z = 0;
		int a = 5;
		System.out.println(a);  // throws error for "z" without initialization.
		System.out.println(z);
	}
	
	
	public static void main(String[] args) {
		
		 // a = 9; // throws error 
		
		LocalVsInstance local = new LocalVsInstance();
		
		local.talk();
		
		new LocalVsInstance().talk(); // 5 0
		
		System.out.println(new LocalVsInstance().a);  //0
		System.out.print(local.ct);	//""
		System.out.println(local.str);	//null
	//	System.out.println(ct);			// throws error


		for (int i=0; i<5; i++) {
			for (int j=0; i<5; i++) {
				
			}	
		}
		for (int i=0; i<5; i++) {
			
		}
		
		
	}

}
