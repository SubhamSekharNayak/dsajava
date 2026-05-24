//Spilt
import java.util.*;

class Node {

    int data;
    Node next;
}

class SL {

    static Node head = null;
    static Node evenHead = null;
    static Node oddHead = null;

    // Create linked list
    static void create() {
        Scanner sc = new Scanner(System.in);
        Node cur, tail = null;
        char ch = 'y';

        while (ch == 'y' || ch == 'Y') {
            cur = new Node();
            System.out.print("Enter data: ");
            cur.data = sc.nextInt();
            cur.next = null;

            if (head == null) {
                head = cur;
            } else {
                tail.next = cur;
            }
            tail = cur;

            System.out.print("Press y to continue: ");
            ch = sc.next().charAt(0);
        }
    }

    // Display linked list
    static void display(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    // Split into EVEN and ODD linked lists
    static void splitEvenOdd() {
        Node evenTail = null;
        Node oddTail = null;
        Node cur = head;

        while (cur != null) {
            if (cur.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = cur;

                } else {
                    evenTail.next = cur;
                    evenTail = evenTail.next;
                }

            } else {
                if (oddHead == null) {
                    oddHead = oddTail = cur;

                } else {
                    oddTail.next = cur;
                    oddTail = oddTail.next;
                }
            }
            cur = cur.next;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }
        if (oddTail != null) {
            oddTail.next = null;
        }
    }
}

public class SplitOfALinkedList {

    public static void main(String[] args) {

        System.out.println("Create Linked List:");
        SL.create();

        System.out.println("\nOriginal List:");
        SL.display(SL.head);

        SL.splitEvenOdd();

        System.out.println("\nEven Linked List:");
        SL.display(SL.evenHead);

        System.out.println("Odd Linked List:");
        SL.display(SL.oddHead);
    }
}