package day38_inheritance_part2;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	@Override
	public String toString() {
		return "Dog [eyes=" + eyes + ", legs=" + legs + ", tail=" + tail + ", teeth=" + teeth + ", coat=" + coat + "]";
	}
	
	public void chew () {
		System.out.println("dog is chewing");
	}

	@Override
	public void eat() {
		System.out.println("dog eat called");
		chew();
		super.eat();
	}
	public void walk() {
		System.out.println("Dog.walk called");
		move(5);
	}
	public void run() {
		System.out.println("dog.run called");
		move(10);
	}

	@Override
	public void move(int speed) {
		System.out.println("dog.move called");
		moveLegs(speed);
		super.move(speed);
	}
	public void moveLegs(int speed) {
		System.out.println("dog.movelegs called");
	}
}
