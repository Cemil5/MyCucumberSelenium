package day34_ConstructorsPassing;

public class Car1 {
	
	int k,l;

	public Car1(int k, int l) {
		super();
		this.k = k;
		this.l = l;
		System.out.println(k + " " + l);
	}

	public static void main(String[] args) {
		
		Car1 car = new Car1(2,5);
		
		
	}

}
