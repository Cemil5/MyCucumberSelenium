package a_live_review.week12_21_08_2021;

public class ConstructorCalls {
	
	public void method1() {	
	}
	
	public void method2() {
		method1();
	}
	
	public void method3() {
		// this();	 2. Constructor call must be the first statement in a constructor
		//	ConstructorCalls();	// 1. constructor cannot be called by the name
		method1();
		method2();
	}
	
	public ConstructorCalls() {
	//	this();	4. constructor cannot call itself
		method1();
		
	}
	public ConstructorCalls(int a) {
		this();	// 3. constructor call must be at the first step 
		method1();
	}
	public ConstructorCalls(String a) {
		this();	
	//	this(10);	 5. one constructor can call only one constructor
		method1();
	}
	
}
