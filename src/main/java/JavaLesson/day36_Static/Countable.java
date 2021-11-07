package day36_Static;

public class Countable {
	
	static int instanceCount;
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
}
