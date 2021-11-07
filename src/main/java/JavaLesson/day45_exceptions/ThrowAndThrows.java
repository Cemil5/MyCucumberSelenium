package day45_exceptions;

import javax.management.RuntimeErrorException;

public class ThrowAndThrows {

	public static void main(String[] args) {
		
		sleep3(2);	// not requires handling, try / catch 
		
		//sleep2(2); //requires handling
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
