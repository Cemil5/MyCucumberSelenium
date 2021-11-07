package day16_ClassesObject;

public class CellPhoneObjects {

	public static void main(String[] args) {

		CellPhone cell1 = new CellPhone();
		
		cell1.brand = "iphone";
		cell1.color = "white";
		cell1.screenSize = 4.7;
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		
		cell1.color = "black";
		System.out.println(cell1.color);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "siemens";
		cell2.color = "green";
		cell2.price	= 23.45;
		
		System.out.println(cell2.brand);
		
		cell2.call();
		cell1.message();
		cell2.takeAphoto();

	}

}
