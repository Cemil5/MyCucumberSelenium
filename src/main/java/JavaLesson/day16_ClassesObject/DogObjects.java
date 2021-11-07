package day16_ClassesObject;

public class DogObjects {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		
		Dog dog2 = dog1;
		
		Dog dog3 = new Dog();
		
		
		dog1.age=10;
		dog2.name = "Rover";
		dog1.color = "Red";
		System.out.println(dog1.name);
		dog1.name = "Maltese";
		System.out.println(dog1.name);

		System.out.println(dog1.age);
		System.out.println(dog2.age);
		dog1.barking();
		dog2.hungry();
		dog1.sleeping();
	}

}
