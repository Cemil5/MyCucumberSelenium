package day36_Static;

public class CountableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable();	// with static 1
		Countable obj2 = new Countable();	// with static 2
		Countable obj3 = new Countable();	// with static 3
		
		objectCount = obj1.getInstanceCount() + 1;
		objectCount = obj2.getInstanceCount() + 2;
		
		System.out.println(objectCount);	//3
		
		System.out.print(Countable.instanceCount);
		
	}

}
