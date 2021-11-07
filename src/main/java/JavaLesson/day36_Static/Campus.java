package day36_Static;

public class Campus {
	
	private static String city;
	static String country;
	
	static {
		System.out.println("Static Block-1");
		country = "USA";
	}

	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	static {
		System.out.println("Static Block-2");
		country = "UK";

	}
}
