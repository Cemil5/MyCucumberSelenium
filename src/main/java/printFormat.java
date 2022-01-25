import java.util.Scanner;

public class printFormat {
    public static void main(String[] args) {

       /* System.out.printf("'%-15s' %n", s1 ("%03d"), x));
        System.out.format("%03d", x);*/

         /*


        input:
        java 100
        cpp 65
        python 50

        output:
        ================================
        java           100
        cpp            065
        python         050
        ================================
         */

        String s1="Test";
        int x= 15;
        System.out.printf("%-15s%03d%n", s1, x);
        System.out.printf("'%-15s%05d' %n", s1, x);
        System.out.printf("'%30s'", s1);
        System.out.printf("'%30d'", x);

/*

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            s1 = sc.next();
            x = sc.nextInt();
            if (s1.length() < 15) {
                for (int j = s1.length(); j <= 15; j++) {
                    s1 += " ";
                }
            }
            String res = "";
            int xlength = ( String.valueOf(x) ).length();
            if (xlength < 3) {
                for (int j = xlength; j <= 3; j++) {
                    res = "0" + String.valueOf(x);
                }
            } else {
                res = String.valueOf(x);
            }
            System.out.println(s1 + res);
            System.out.println("================================");
        }
*/
    }
}
