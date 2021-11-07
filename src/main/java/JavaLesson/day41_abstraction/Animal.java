package day41_abstraction;

public abstract class Animal {
	
	int a;
	
	//abstract int b;
	
	public abstract void eat();	// abstract method
	
	public abstract void breath();
	
	public void move() {	// instance method
		System.out.println("moving");
	}

	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	

}


class Main{
	public static void main(String[] args) {
		// Animal a = new Animal();
	}
}