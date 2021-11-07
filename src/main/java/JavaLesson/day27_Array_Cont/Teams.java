package day27_Array_Cont;

import java.util.Arrays;

public class Teams {

	public static void main(String[] args) {

		String[][] teams = new String[2][4];
		
		teams[0][0] = "Mike";
		teams[0][1] = "Tonny";
		teams[0][2] = "Smith";
		teams[0][3] = "Evan";
		
		teams[1][0] = "David";
		teams[1][1] = "Emyy";
		teams[1][2] = "John";
		teams[1][3] = "Ryan";
		
		System.out.println("First player of first team");
		System.out.println(teams[0][0]);
		
		System.out.println("number of rows: "+ teams.length);
		System.out.println("# people in first team " + teams[0].length);
		System.out.println("# people in second team " + teams[1].length);

		System.out.println(Arrays.deepToString(teams));
		
		System.out.println(" çift for each");

		for (String[] strings : teams) {
			for (String strings2 : strings) {
				System.out.print(strings2 + " ");
			}
			System.out.println();
		}
		System.out.println(" tek for each");
		for (String[] strings : teams) {
			System.out.println(Arrays.toString(strings));
		}
		
		
		System.out.println();
		System.out.println(" nested for");

		for (int i=0; i<teams.length;i++) {
			for (int j=0; j<teams[i].length;j++) {
				System.out.println(teams[i][j]);
			}
		}
	
		
		
		
	}

}
