package a_live_review.week08_24_07_2021;

public class MarkerObjs {

	public static void main(String[] args) {

		// make an object of Marker
		
		Marker markerOne = new Marker();
		
		markerOne.name = "Expo";
		markerOne.color = "Blue";
		markerOne.height = 3.5;
		
		
		Marker markerTwo = new Marker();
		markerTwo.setInfo("Expo 2","Red" , 3.2);
		
		Marker markerThree = new Marker();

		
		
		System.out.println(markerOne.writeMsg("first message"));
		System.out.println(markerTwo.writeMsg("second message"));

		
		
		
		// System.out.println(markerOne.name);
	   // 	System.out.println(markerTwo.name);
		
		markerOne.print();
		markerTwo.print();
		markerThree.print();

	}

}
