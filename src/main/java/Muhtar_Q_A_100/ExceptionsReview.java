package Muhtar_Q_A_100;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionsReview {
    public static void main(String[] args) {

        String str = null;
        str ="   ";
       // str.toLowerCase();  // NullPointerException
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.isBlank() = " + str.isBlank());

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
     //   list.get(4);    // IndexOutOfBoundsException

        int[] i = new int[2];
     //   System.out.println(i[3]); // ArrayIndexOutOfBoundExeption

        try {
            list = new ArrayList<>(Arrays.asList(1, 2, 3));
            //    System.out.println(list.get(4));
        }catch (Exception e){
        //    System.exit(0);
        } finally {
            System.out.println("finally");
            System.out.println("finally");

        }

        Parent parent = new Child();    // up casting

       // Sub sub = (Sub) parent; // ClassCastException
    }
}

class Parent {}

class Child extends Parent{} // IS A

class Sub extends Parent{}   // IS A

