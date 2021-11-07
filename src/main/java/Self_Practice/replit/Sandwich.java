package replit;

public class Sandwich {

	public static void main(String[] args) {

		String str = "xxbreadapple";
		int i1 = str.indexOf("bread")+5;
		int i2 = str.lastIndexOf("bread");
		String output ="";
		if (i1<i2) {
			output = str.substring(i1,i2);
		} else {
			output = "nothing";
		}
		System.out.println(output);
	}

}
