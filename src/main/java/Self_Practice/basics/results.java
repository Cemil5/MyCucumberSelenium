package basics;

public class results {
	public static void main(String[] args) {
		
		int i,c;
		double d,f;
		
		i=4;
		f=4.3;
		d=1.8;
		c=0;
		
		if (i!=c) {
			c++;
			if ((f+d)==(c+=2)) {
				System.out.println(c);
			}
		}
		System.out.println(c);
	}

}
