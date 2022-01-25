package DevCourse.LinkedListTest;

import java.util.NoSuchElementException;

public class OurLinkedList {
    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node first;
    public Node last;
    public int size;

    public OurLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void addLast(int item){
        var node = new Node(item);
        System.out.println("adding an item : " + item);
        if (isEmpty()) first  = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void insertInOrder(int item) {
        var node = new Node(item);
        Node current = first;
        if (isEmpty()) first = last = node;
        else if (item < first.value) {
            node.next = first;
            first = node;
        } else {
            while (current != last && item > current.next.value ) {
                current = current.next;
            }
            if (current == last){
                current.next = node;
                last = node;
            } else {
                node.next = current.next;
                current.next = node;
            }
        }
        size++;
    }

    public void myinsertInOrder(int item) {
        var node = new Node(item);
        Node current = first.next;
        Node prev = null;
        if (isEmpty()) first = last = node;
        else if (item < first.value) {
            node.next = first;
            first = node;
        } else {
            while (item >= current.value && current != last) {
                prev = current;
                current = current.next;
            }
            if (current != last) {
                Node temp = current;
                current = node;
                node.next = temp;
                prev.next = node;
            } else {
                last.next = node;
                last = node;
            }
        }
        size++;
    }

    public void deleteLast(){
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("deleting an item from the last: ");
        if (first == last) first = last = null;
        else {
            var previous = first;
            var current = first;
            while (current.next!=null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            last = previous;
            size--;
        }
    }

    public void printLinkedList(){
        if (isEmpty()){ throw new NoSuchElementException(); }
        var current = first;
        while ((current != null)){
            System.out.println("value : " + current.value);
            current = current.next;
        }
    }

    /* Given pointer to the head node of a linked list, the task is to reverse the linked list.
    We need to reverse the list by changing the links between nodes.
    /* Function to reverse the linked list */
    public OurLinkedList reverse(OurLinkedList list) {
        OurLinkedList result = new OurLinkedList();
        Node prev = list.first;
        Node current = list.first.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        result.last = first;
        result.last.next = null;
        result.first = prev;
        return result;
    }
    public Node reverse() {

        Node prev = first;
        Node current = first.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        last = first;
        last.next = null;
        first = prev;
        return first;
    }
    public Node findingKthValueFromEnd(int k){
        if (isEmpty()) throw new NoSuchElementException();

        Node node1 = first;
        Node node2 = first;
        while (k>1 || node1.next != null){
            node1 = node1.next;
            if (k>1){
                if (node1 == null) throw new IllegalArgumentException();
                k--;
            }
            else {
                node2 = node2.next;
            }
        }
        return  node2;
    }

    public void findMiddleElement(){
        if (first == null) throw new NoSuchElementException();

        Node node1 = first;
        Node middle = first;

        while (node1 != last && node1.next != last){
            node1 = node1.next.next;
            middle = middle.next;
        }

        if (node1 == last){
            System.out.println("middle element = " + middle.value);
        } else {
            System.out.println("middle elements = " + middle.value + " and " +  middle.next.value);
        }
    }

    public boolean isPalindrome(){
        Node reversed = reverse();
        Node current = first;
        Node revCur = reversed;
        while (revCur != null){
            System.out.println("reversed.value = " + revCur.value);
            System.out.println("current.value = " + current.value);
            if (revCur.value != current.value) return false;
            revCur = revCur.next;
            current = current.next;
        }
        return true;
    }
    public boolean isPalindrome(OurLinkedList list){
        OurLinkedList reversed = reverse(list);
        Node current = list.first;
        Node revCur = reversed.first;
        while (revCur != null){
            System.out.println("reversed.value = " + revCur.value);
            System.out.println("current.value = " + current.value);
            if (revCur.value != current.value) return false;
            revCur = revCur.next;
            current = current.next;
        }
        return true;
    }

    public void MyFindMiddleElement(){
        if (first == null) throw new NoSuchElementException();

        Node node1 = first;
        Node middle = first;
        Node middleEven = null;
        int size = 1;

        while (node1.next != null){
            node1 = node1.next;
            middleEven = middle;
            middle = middle.next;
            size++;
            if (node1.next != null){
                node1 = node1.next;
                size++;
            }
        }
        System.out.println("size = " + size);
        if (size % 2 != 0){
            System.out.println("middle element = " + middle.value);
        } else {
            System.out.println("middle elements = " + middleEven.value + " and " +  middle.value);
        }

    }

}
