package a_live_review.week12_21_08_2021;

public class DogObjects {

	public static void main(String[] args) {
		
	Dog dog1 = new Dog("Lucy", "Husky", 'F', 3);
	
	Dog dog2 = new Dog("Max", "Golden Retriever", 'M', 2);
	
	System.out.println(dog1);
	System.out.println(dog2);
	
	dog1.eat();
	dog2.bark();
	
	}

}
