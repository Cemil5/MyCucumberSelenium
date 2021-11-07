package day33_classObject_constructors;

public class Mouse {
		
		int numTeeth;
		int numWhiskers;
		int weight;
		
		// 1
		public Mouse(int weight) {
			this(30,weight);	// you are calling constructor
			this.weight = weight;
			System.out.println("JAVA1");
		}
		
		// 2
		public Mouse(int numTeeth, int weight) {
			this(numTeeth,20,weight);
			this.numTeeth = numTeeth;
			this.weight = weight;
			System.out.println("JAVA2");

		}
		
		// 3
		public Mouse(int numTeeth, int numWhiskers, int weight) {
			this.numTeeth = numTeeth;
			this.numWhiskers = numWhiskers;
			this.weight = weight;
			System.out.println("JAVA3");
		}
		
		public void print(){
			System.out.println(weight + " " + numTeeth + " " + numWhiskers);
		}
			
	

}
