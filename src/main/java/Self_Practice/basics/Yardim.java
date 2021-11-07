package basics;

import java.util.Scanner;

public class Yardim {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
        boolean flag=true;
        String guestList ="";
        String comma ="";


        System.out.println("Please enter guest name:");

        String guestName = scan.nextLine();
        
        while (flag==true){

        System.out.println("Do you want to enter new guest name:");

        String answer = scan.next();

        guestList = guestList + comma +  guestName;
        comma=",";

        if (answer.equalsIgnoreCase("yes")) {

            flag=true;
            continue;
        } else if (answer.equalsIgnoreCase("no")) {

            flag=false;

        }
        } 

        System.out.println("Guest's list:" + guestList);
    }


}
