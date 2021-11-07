package day35_Encapsulation;

public class CarpetTest {

	public static void main(String[] args) {
		
	//	Floor f = new Floor(0, 0);
			
		Calculator calculator = new Calculator(new Floor(10, 5), new Carpet(3.5));
		
		System.out.println(calculator.getTotalCost());
	}

}
