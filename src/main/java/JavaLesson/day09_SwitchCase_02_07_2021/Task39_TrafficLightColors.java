package day09_SwitchCase_02_07_2021;

public class Task39_TrafficLightColors {

	public static void main(String[] args) {

		char color = 'G';
		
		switch (color) {
		case 'r': 	case 'R':
			System.out.println("Red");
			break;
		case 'O': 	case 'o':
			System.out.println("Orange");
			break;	
		case 'G': 	case 'g':
			System.out.println("Green");
			break;	
		default:
			System.out.println("No such color");
		
		}
	}

}
