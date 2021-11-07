package static_hiding_extra_practice;

public class Dog {

	int breed, size, gender, age, color;
	static int numberOfLegs, numberOfEyes;
	
	public Dog(int breed, int size, int gender, int age, int color) {
		super();
		this.breed = breed;
		this.size = size;
		this.gender = gender;
		this.age = age;
		this.color = color;
	}

	{
		numberOfEyes = 2;
		numberOfLegs =4;
	}
	
}
