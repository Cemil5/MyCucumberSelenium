package codeWars;

public class Persistence {

	public static void main(String[] args) {
		System.out.println(persistence(39) == 3); // because 3*9 = 27, 2*7 = 14, 1*4=4
                // and 4 has only one digit
           
		System.out.println(persistence(999) == 4); // because 9*9*9 = 729, 7*2*9 = 126,
                 // 1*2*6 = 12, and finally 1*2 = 2
            
		System.out.println(persistence(4) == 0); // because 4 is already a one-digit number
	}

	private static int persistence(long n) {
		if (n<10) return 0;
		int count =1;
		while (n>9) {
			String str = Long.toString(n);
			String[] arr = str.split("");
			n = 1;
			for (int i=0; i<arr.length;i++) {
				int num = Integer.parseInt(arr[i]);
				n *= num;
			}
			if (n > 9) {
				count++;
			}
		}
		return count;
	}
	
	
	
}
