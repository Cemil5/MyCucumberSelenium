package day39_inheritance_review_access_modifiers;

public class Vehicle {
	
	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;
	
	
	/*
	 * public Vehicle() { this("BMW", "3.6", 60, 50); }
	 */
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentDirection = 0;
		this.currentVelocity = 0;
	}
	
	public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
		super();
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.currentDirection = currentDirection;
	}

	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): steering at " + currentDirection + " degrees.");
	}
		
	public void move(int velocity, int direction) {
		this.currentDirection = direction;
		this.currentVelocity = velocity;
		System.out.println("Vehicle.move(): moving at " + currentVelocity + " in direction "+ currentDirection + " degrees.");
	}
	
	public void stop() {
		this.currentVelocity = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
}
