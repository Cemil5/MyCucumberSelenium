package basics;

public class PrePostIncrement {
	public static void main(String[] args) {
	
	char c1 = 'a';
	
	switch(c1) {
	case 'a':
		System.out.println("apple");break;
	case 'b':
		System.out.println("bat");break;
	case 'c':
		System.out.println("cat");break;
		default:
			System.out.println("none");
	}
			// c=2
			// 9 == 4
		
			int i=5, f=6, d=3, c=1;
			if (i!=f) {
				c++;
			}
			
			if ((f+d)==(c+=2)) {
				c--;
			}
		System.out.println(c);	
			
		boolean b1=false;
		boolean b2=false;
		
		if (b2!=(b1=!b2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		boolean X = true;
		boolean Y = !X == false;
		boolean Z = Y;
		
		if (X) {
			System.out.println("hello");
		} if (Y) {
			System.out.println("today");
		} if (Z) {
			System.out.println("We");
		}
		
	}

}
