package day43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {
		
		ChildA chA = new ChildA();
		chA.m1();
		chA.m2();
		chA.m3();
		
		ChildB chB = new ChildB();
		chB.m1();
		chB.m2();
		chB.m4();
		
		Parent p1 = new ChildA();
		p1.m1();
		
		MyInterface int1 = new ChildA();
		int1.m2();
		
		
	}

}

class Parent{
	public void m1() {	}
}

interface MyInterface{
	void m2();
}

class ChildA extends Parent implements MyInterface {
	public void m2() {}
	public void m3() {}	
}

class ChildB extends Parent implements MyInterface {
	public void m2() {}
	public void m4() {}	
}
