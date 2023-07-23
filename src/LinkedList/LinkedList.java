package LinkedList;
import java.util.*;
import java.io.*;
public class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertIndex(99, 2);
        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteIndex(2));
//        list.display();
        list.insertRec(100, 3);
        list.display();
    }

}
class LL {
    private Node head; // head pointing to start element or as first element
    private Node tail; // tail pointing to end element or as last element
    private int size;
    // initially setting size to zero by constructor
    public LL() {
        this.size = 0;
    }
    private class Node {
        private int value; // value
        private Node next; // next pointing to next node

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            // constructor fon insertion in between
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val) { // Insert at first position
        Node node = new Node(val); // create new node
        node.next = head; // point to head node (first node)
        head = node; // update head to new first node

        if(tail == null) { // if LL empty
            tail = head; // tail and head both point to single node
        }
        size++; // increment size
    }
    public void insertLast(int val) { // insert at last position
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val); // create new node
        tail.next = node; // tail is last node hence pointing to current inserted value at last
        tail = node; // updating tail node
        size++;
    }
    public void insertIndex(int value, int ind) { // Insert at particular index
        if(ind == 0) {
            insertFirst(value);
            return;
        }
        if(ind == size) {
            insertLast(value);
            return;
        }
        Node temp = head; // initiate temp node to head
        for(int i=1; i<ind; i++) { // since head is first node start from 2
            temp = temp.next; // reach at node previous to index to be added
        }
        Node node = new Node(value, temp.next); //point added node to next node
        temp.next = node; // update previous.next to current added node
        size++;
    }
    public void display() {
        Node temp = head; // Initialized to head
        while (temp != null) { // while not reached null (last node)
            System.out.print(temp.value + " -> ");
            temp = temp.next; // point to next node
        }
        System.out.println("END");
    }
    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }
    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size --;
        return value;
    }
    public int deleteIndex(int index) {
        if(index == 0) {
            deleteFirst();
        }
        else if(index == size - 1) {
            deleteLast();
        }
        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }
    public Node get(int ind) {
        Node node = head;
        for(int i=0; i<ind; i++) {
            node = node.next;
        }
        return node;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        // till the index doesn't become zero decrement index and increment next
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }
}
