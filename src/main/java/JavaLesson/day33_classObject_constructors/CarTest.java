package day33_classObject_constructors;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("Honda", "Civic", 2021, 5500, "white");
		
		System.out.println(c1.make);
		System.out.println(c2.year);

		
		// 1 - new  : calls constructor
		// 2- which constructor? constructor with no parameter in Car class - default constructor
		
		
		
		
	}

}
