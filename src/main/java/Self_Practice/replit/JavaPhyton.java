package replit;

import java.util.Scanner;

public class JavaPhyton {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		int countOfJava = 0;
	    int countOfPython = 0;
	    
	    int i =0;
	    do {
	    	i = sentence.indexOf("java",i);
	    	if (i>=0) {
	    		countOfJava ++;
	    		i +=4;
	    	}
	    } while (i>=0);
	    
	    i =0;
	    do {
	    	i = sentence.indexOf("python",i);
	    	if (i>=0) {
	    		countOfPython ++;
	    		i +=6;
	    	}
	    } while (i>=0);
	System.out.println(countOfJava == countOfPython ? true : false);
		
	}

}
