package DevCourse.LinkedListTest;

import java.util.ArrayList;

public class LinkedListExe {
    public static void main(String[] args) {

        var list1 = new OurLinkedList();
        var list2 = new OurLinkedList();

    /*    for (int i = 1; i <= 5; i++) {
            list2.addLast(i);
        }

     */

        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);

        list1.insertInOrder(1);

        list1.printLinkedList();
     //   list2.printLinkedList();


 /*        list1.deleteLast();
        list1.printLinkedList();
*/


     //   Reversing the nodes of a singly linked lists in one pass.
  /*      System.out.println("Reversed linked list1 ");
        list1.reverse(list1);
        list1.printLinkedList();

   */
/*
      //  Finding the Kth node from the end in one pass where you don’t know the size of the list1.
        System.out.println("\n\tkth element of linked list1 ");
        System.out.println(list1.findingKthValueFromEnd(4).value);


     // Find the middle of a linked list1 in one pass. If the list1 has an even number of nodes, there would be two
     //   middle nodes. (Note: Assume that you don’t know the size of the list1 ahead of time.)
        System.out.println("\n\tfinding middle element(s) : ");
        list1.findMiddleElement();
*/

        // Additional /Optional Exercises
// Check the singly linked list1 if it is Palindrome (Without a stack)
//        System.out.println("is palindrome : " + list1.isPalindrome(list1));


// Sort the singly linked list1 of integers in descending order without using any sort algorithm.


    }
}
