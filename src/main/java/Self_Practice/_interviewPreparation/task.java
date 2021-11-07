package _interviewPreparation;

public class task {

	public static void main(String[] args) {

			
		String str = "hi";
		int num =0;
		
		for (int i=0; i<str.length()-1;i++) {
			if (str.substring(i, i+2).equals("hi")) {
				num++;
			}
		}
		System.out.println(num);
		
	}
	
	
	
	
	

}
