package groupStudy;

public class WrapperExamples {

	public static void main(String[] args) {
		
		String str = "1-16 of 462 results for";
		
		//As my first step, I will split it in the following way
		//It will create this array for me after using first split method
		// {"1-16 of ", "462 results for"}
	//index     0               1
		String totalNumber = str.split("1-16 of ")[1].split(" results for")[0];
		//I will take the second element of the array and use split method again
		//then take the first element inside it to reach specificly my number string
		// {"462", " results for"}
	//index   0           1
		
		int totalNum = Integer.parseInt(totalNumber);
		
		System.out.println(totalNum + 1);
		
		
		totalNumber = str.split(" of ")[1].split(" results for")[0];
		totalNum = Integer.parseInt(totalNumber);
		System.out.println(totalNum + 1);

		
	}

}
