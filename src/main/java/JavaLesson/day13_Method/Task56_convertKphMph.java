package day13_Method;

public class Task56_convertKphMph {

	public static void main(String[] args) {
	
		for (int i=1; i<=3; i++)
			MilesKm(i);
	}
	
	public static void MilesKm(double mph){
		double kph;
		
		kph = mph/0.6214;
		System.out.println(mph + " mile = " + kph + " km");
		
	}

}
