package JavaLesson.day35_Encapsulation;

public class Calculator {
	
	day35_Encapsulation.Floor floor;
	
	day35_Encapsulation.Carpet carpet;
	
	public Calculator(day35_Encapsulation.Floor floor, day35_Encapsulation.Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		return floor.getArea()*carpet.getCost();
	}
	
}
