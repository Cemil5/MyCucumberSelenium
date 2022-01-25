package Muhtar_Q_A_100;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {

        String[] array1 = {"a", "b", "c"};
        String[] array2;
        array2 = Arrays.copyOfRange(array1, 0, array1.length);

        array2 = Arrays.copyOf(array1, array1.length);

        System.out.println("array2 = " + array2);
        System.out.println("array2 = " + Arrays.toString(array2));

        System.out.println("============================");


        if (System.out.printf("Hello").equals("")){
        }
        while (System.out.append("how are you").equals("")){
        }

        System.out.println("============================");




    }
}
