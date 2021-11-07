package day16_ClassesObject;

public class CarObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		car1.printCarInfo();
		
		car1.make="Ford";
		car1.model = "Focus";
		car1.currentSpeed = 35;
		car1.drive();
		car1.showCurrentSpeed(70);
		car1.accelerate(20);
		System.out.println("after acc : " + car1.currentSpeed);		
	}

}
