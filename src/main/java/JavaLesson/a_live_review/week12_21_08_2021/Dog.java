package a_live_review.week12_21_08_2021;

public class Dog {
	
	public String name;
	public String breed;
	public char gender;
	public int age;

	public Dog(String name, String breed, int i, int age) {
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void bark() {
		System.out.println(name + " is barking");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	// new Dog("Lucy", "Golden Retriever", 'F', 2);
}
	
	/*•	dog: 
		o	attributes : (instance variables)
			name, breed, age, gender
		o	action:	(instance methods)
			eat(), drink(), sleep(), bark() */

