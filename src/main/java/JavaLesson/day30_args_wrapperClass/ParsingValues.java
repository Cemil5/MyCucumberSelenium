package day30_args_wrapperClass;

public class ParsingValues {

	public static void main(String[] args) {

		String numStr = "2018";
		numStr = numStr + 1;
		System.out.println(numStr); //20181
		
		
		int num = Integer.parseInt(numStr);
		num++;
		System.out.println(num); //20182
		
		
		double num2 = Double.parseDouble(numStr);
		System.out.println(num2); //20181.0
		
		int i = 10;
		String s = String.valueOf(i);
		s = s+1;
		System.out.println(s); //101	string
		
		String s2 = Integer.toString(i);	
		System.out.println(s2); //10	string
	}

}
