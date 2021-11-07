package day36_Static;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("one argument constructor");
	}
	public AllBlocks() {
		System.out.println("no argument constructor");
	}
	
	static {
		System.out.println("first static init");
	}
	
	{
		System.out.println("first instance init");
	}
	
	{
		System.out.println("second instance init");
	}
	static {
		System.out.println("second static init");
	}
	
}
