package day34_ConstructorsPassing;

public class AppleTest {

	//static Apple app = new Apple();
	//static int x = 5;
	
	public static void main(String[] args) {

		Apple app = new Apple();
		app.mA();
		int x = 5;
		changeApple(x, app);
		app.mA();
		
		System.out.println(methodObject().color);
		
		methodObject().mA();
		Apple a2 = methodObject();
		a2.mA();

	}
	
	public static void changeApple(Integer x, Apple a1) {
		
		a1.color = "White";
		System.out.println(x);
		System.out.println(a1.color);
		a1.mA();
	}
	
	public static Apple methodObject() {
		Apple b1 = new Apple();
		return b1;
	}
}
