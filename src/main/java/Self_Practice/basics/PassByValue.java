package basics;

public class PassByValue {
	
	class Demo{
		int x = 10;
		int y = 20;
		
		int display(Demo A, Demo B) {
			A.x = 95;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			return 0;
		}
	}
class Main{
	public void main(String[] args) {
		
		Demo C = new Demo();
		Demo D = new Demo();
		
		D.y = 55;
		
		C.display(C, D);
		D.display(C, D);
	}
}
}
