package day38_inheritance_part2;

public class Main {
	public static void main(String[] args) {
		Base b= new Base();
		b.foo();
		Base b1 = new Derived();
		b1.foo();
	}

}

class Derived extends Base{
	 public void foo() {
		System.out.println("Derived");
	}
}

class Base{
	public void foo() {
		System.out.println("Base");
	}
}
