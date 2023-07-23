package LinkedList;

public class DoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertLast(1);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertAfter(4, 2);
        list.displayRev();
        System.out.println();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteIndex(2));
        list.display();
    }
}

class DLL {
    private Node head,tail;
    private int size;
    DLL () {
        this.size = 0;
    }
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            // constructor fon insertion in between
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void insertAfter(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        Node temp = head;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        node.prev = temp;
    }
    public void displayRev() {
        Node node = head;
        Node last = null;
        while(node != null) {
            last = node;
            node = node.next;
        }
        while(last != null) {
            System.out.print(last.value+"->");
            last = last.prev;
        }
        System.out.print("START ");
    }
    public void display() {
        Node node = head;
        while(node != null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.print("END");
    }
    // recursive reverse of LL
    public void reverseRec(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // iterative reverse of LL
    public void reverseIter() {
        if(size < 2) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }
}
