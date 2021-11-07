package replit;
import java.util.Scanner;

public class TeacherStudent {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	String name = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	//name = "Chen";
		//System.out.println("\n"+name);
	  	//boolean result = (name == "Chen");//||(name == "chen");
	  	//System.out.println(result);
	  	if ((name).equals("Chen")) {
	  	//if (name == ("Chen"))	{
	  	//if (result) {
	  		System.out.println("teacher");
	  	} else {
	  		System.out.println("student");
	  	}
	  	
	}

}
