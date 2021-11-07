package day06_logicalOperators;

public class Task2 {
	public static void main(String[] args) {
		
		String outsideWeather;
		int degree;
		outsideWeather = "Shinny";
		degree = 70;
		boolean comp2 = (!(outsideWeather=="Rainy" || degree ==70));	// !(F || T) => !T => F
		System.out.println(comp2);
		System.out.println("******************");
		
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b ==2;
		
		System.out.println(res);
		
	}

}
