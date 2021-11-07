package static_hiding_extra_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

	public static void main(String[] args) {
		
		ArrayList <Candy> candies = new ArrayList<>();		
		
		Candy c1 = new Candy("c1",1,6.0,true);		// String brand, int quantity, double price, boolean hasPeanuts
		Candy c2 = new Candy("c2",2,-7.0,true);
		Candy c3 = new Candy("c3",0,8.0,true);
		Candy c4 = new Candy("c4",4,0.0,true);
	//	Candy c5 = new Candy("c5",5,10.0,true);
		
	//	candies.addAll(Arrays.asList(c1, c2, c3, c4, c5));
		candies.addAll(Arrays.asList(c1, c2, c3, c4, new Candy("c5",5,10.0,true)));
		
//		candies.add(c1);
//		candies.add(c2);
//		candies.add(c3);
//		candies.add(c4);
//		candies.add(c5);
				
		for (Candy each : candies) {
			System.out.println(each.toString());
		}
			
	}

}
