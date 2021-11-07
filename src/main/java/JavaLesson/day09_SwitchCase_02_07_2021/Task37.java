package day09_SwitchCase_02_07_2021;

public class Task37 {

	public static void main(String[] args) {

		String model = "dell ";
		
		switch (model) {
		case "apple":
			System.out.println("Apple-no virus");
			break;
		case "dell":
			System.out.println("Tough one");
			break;	
		case "acer":
			System.out.println("Not recommended");
			break;
			default:
				System.out.println("do not buy that one!");
		}
	}

}
