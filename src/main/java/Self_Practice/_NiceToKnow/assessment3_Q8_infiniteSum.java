package _NiceToKnow;

public class assessment3_Q8_infiniteSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=0, k=0, m=0, sum=0;
		
		//System.out.println(i);
		for (i=0, j=0; sum>20;++i,--j) {
			sum +=i+j;
			}
			System.out.println("sum " + sum);
		
			//****************************
			
			i =1;
			sum=15;
			while(++i<10) {}
			
			if (i>10) {
				System.out.println(" gr" +i);
			} else {
				System.out.println("no " + i);
			}
			//****************************
			i =1;
			boolean b=false;
			
			do {
				System.out.println(i + " " +b);
				i++;
			}while (b=!b);
			
			
			System.out.println(i);
			
			//************************
			int x =0;
			while (x++<10) {
				String message = x>10 ? "greater than" : "false"; // false must be in ""
				System.out.println(message + ","+x);
			}
			
			
			//**********************
			long z=10;  // long ile switch yapýlmaz.
			
		/*	switch (z) {
			case 10:
				
			} */
			
			
			
			//****************************
			/*
			do {
				System.out.println("100");
			} while (true);
			//System.out.println("bye"); // bu satýrý koymazsak hata vermiyor infinite loop oluyor, koyunca unreachable code hatasý veriyor.
			*/
			
			
			
			
	}

}
