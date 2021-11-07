package day36_Static;

public class Quiz_Static {

	Quiz_Static sd = new Quiz_Static();
	
	void method1() {
		method4();
		Quiz_Static.method2();
	//	Quiz_Static.method3();
		method5();
	}
	
	static void method2() {
		method4();
		//method5();	
	}
	
	void method3() {
		method1(); 
		method2();
		sd.method2();
	}
	
	static void method4() {}
	
	void method5() {}
	
	public static void main(String[] args) {
		//method5();
	}
	
}
