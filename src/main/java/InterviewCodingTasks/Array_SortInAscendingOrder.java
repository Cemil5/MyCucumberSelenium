package InterviewCodingTasks;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingArrayAsc(new int[]{25, 52, 5, 1})));
    }

    public static int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }


}
