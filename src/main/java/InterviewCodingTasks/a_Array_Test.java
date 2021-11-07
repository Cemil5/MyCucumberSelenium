package InterviewCodingTasks;

import java.util.Arrays;

import static InterviewCodingTasks.Array_FindMinimum.minValue;

public class a_Array_Test {
    public static void main(String[] args) {

        int[] n = {2, 3, 5, 1,5,15,20,4};
        int[] n2 = {2, 3, 5, 1,5,15,20,4};
        int[] n3 = {2, 3, 5, 1,0,5,0,0,15,0,20,4};

    //    Write a function that can find the maximum number from an int Array
        System.out.println("maxValue = " + maxValue(n));

    //    Write a function that can find the maximum number from an int Array
        System.out.println("minValue = " + minValue(n));

    //   write a program that can find the first duplicated element from the array
        System.out.println("firstDuplicatedElement(n) = " + firstDuplicatedElement(n));

    //    Write a return method that can concat two arrays
        System.out.println("Array_MergeTwoArrays.concatTwoArrays(n, n2) = " + Arrays.toString(Array_MergeTwoArrays.concatTwoArrays(n, n2)));

    //   write a program that can move all the zeros to the end of an array
        System.out.println("Array_MoveAllZerosToTheEnd.moveZerosToTheEnd(n3) = " + Arrays.toString(Array_MoveAllZerosToTheEnd.moveZerosToTheEnd(n3)));

    }

    public static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

  /*
    Write a function that can find the maximum number from an int Array
     */

    public static int minValue(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }
        }
        return firstDuplicated;
    }
}
