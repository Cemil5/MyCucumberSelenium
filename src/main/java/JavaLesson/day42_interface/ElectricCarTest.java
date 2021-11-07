package day42_interface;

public class ElectricCarTest {

	public static void main(String[] args) {

	//	ElectricCar ec = new ElectricCar(null, 0, null); ERROR can not be instantiated
		
		Tesla modelS = new Tesla("Model S", 45000, "blue");
		
		System.out.println(modelS.toString());
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		
		System.out.println("==========================");
		
		Ford fusion = new Ford("Fusion", 35000, "white", 2020);
		
		System.out.println(fusion.toString());
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		
		System.out.println("==========================");
		
		TeslaSemi semi = new TeslaSemi("Semi", 50000, "brown", 3.5);
		
		System.out.println(semi.toString());
		semi.charge();
		semi.load("Oranges");
		semi.start();
		semi.drive();
		semi.stop();
		
		
		System.out.println("==========================");
		
		TeslaTruck tr = new TeslaTruck("Truck", 50000, "brown", 3.5);
		
		System.out.println(tr.toString());
		tr.charge();
		tr.load("books");
		tr.start();
		tr.drive();
		tr.stop();
		
		System.out.println("==========================");
		Tesla2 t2 = new Tesla2();
		t2.test();
		t2.defaultMethod();
		SelfDriving.test();
		
	}

}
