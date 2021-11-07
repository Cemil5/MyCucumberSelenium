package day04_arithmeticOperators;

public class Task_1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pies=10, people=4;
		double piesPerson;
		
		piesPerson=pies/people;
		System.out.println(piesPerson); //2.0
		
		piesPerson=(double)pies/people; 
		System.out.println(piesPerson);//2.5
		
		piesPerson=pies/(double)people;
		System.out.println(piesPerson); //2.5
		
		piesPerson=(double)(pies/people);
		System.out.println(piesPerson); //2.0
		
		
		System.out.println((int)(7.9) + (int)(6.7)); //13
		System.out.println((int)(7.9 + 6.7));		 //14
		System.out.println((double)(17));			//17.0
		System.out.println((double)(8+3));			//11.0
		System.out.println((double)(7)/2);			//3.5
		System.out.println((double)(7/2));			//3.0
		System.out.println((int)(7.8 + (double)(15)/2));	//15



		
		

	}

}
