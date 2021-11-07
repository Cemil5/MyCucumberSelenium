package day45_exceptions;

import javax.management.RuntimeErrorException;

public class ThrowAndThrows2 {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		//throw new RuntimeException("This is exception");
		/*
		try {
			throw new Exception("Another exception"); // checked exception
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
		String username = "aeu";
		if (username.isEmpty()) {
			throw new RuntimeException("username can not be empty");
		} else {
			System.out.println("valid username");
		}
		
		sleep3(2);	// not requires handling
		
		//sleep2(2); requires handling
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	
	public static void sleep3(int seconds) {
		try {
			sleep2(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
