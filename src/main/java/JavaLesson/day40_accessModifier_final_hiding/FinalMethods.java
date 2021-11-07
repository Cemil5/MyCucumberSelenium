package day40_accessModifier_final_hiding;

public class FinalMethods {
	
	public final void method1() {
		System.out.println("method-1");
	}
	
	
	public final static void staticMethod(String word) {
		System.out.println("static method");
	}
	
}

class Sub extends FinalMethods{
	
//	@Override
//	public void method1() {
//		System.out.println("method1 in sub class");
//	}
	
//	public static void staticMethod(String w) {
//		System.out.println("static method in sub class");
//	}
	
}
