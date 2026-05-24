import java.util.*;

class Node {

    int data;
    Node next;
}

class SL {

    static Node head1 = null;
    static Node head2 = null;

    // Create first sorted linked list
    static void create() {
        Scanner sc = new Scanner(System.in);
        Node cur, tail = null;
        char ch = 'y';

        while (ch == 'y' || ch == 'Y') {
            cur = new Node();
            System.out.print("Enter FIRST list data : ");
            cur.data = sc.nextInt();
            cur.next = null;

            if (head1 == null) {
                head1 = cur;
            } else {
                tail.next = cur;
            }
            tail = cur;

            System.out.print("Press y to continue: ");
            ch = sc.next().charAt(0);
        }
    }

    // Create second sorted linked list
    static void create1() {
        Scanner sc = new Scanner(System.in);
        Node cur, tail = null;
        char ch = 'y';

        while (ch == 'y' || ch == 'Y') {
            cur = new Node();
            System.out.print("Enter SECOND list data : ");
            cur.data = sc.nextInt();
            cur.next = null;

            if (head2 == null) {
                head2 = cur;
            } else {
                tail.next = cur;
            }
            tail = cur;

            System.out.print("Press y to continue: ");
            ch = sc.next().charAt(0);
        }
    }

    // Display list
    static void display(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    // Merge two sorted linked lists
    static Node mergeOfTwoLinkList() {

        // Edge cases
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node p1 = head1;
        Node p2 = head2;
        Node mergedHead;
        Node tail;

        // Initialize mergedHead
        if (p1.data <= p2.data) {
            mergedHead = p1;
            p1 = p1.next;
        } else {
            mergedHead = p2;
            p2 = p2.next;
        }

        tail = mergedHead;
        tail.next = null;   // break old link

        // Merge process
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                p2 = p2.next;
            }
            tail = tail.next;
            tail.next = null;   // IMPORTANT
        }

        // Attach remaining nodes
        if (p1 != null) {
            tail.next = p1;
        }
        if (p2 != null) {
            tail.next = p2;
        }

        return mergedHead;
    }
}

public class MergeOfTwoLinkList {

    public static void main(String[] args) {

        System.out.println("Create FIRST sorted list:");
        SL.create();

        System.out.println("\nCreate SECOND sorted list:");
        SL.create1();

        System.out.println("\nFirst List:");
        SL.display(SL.head1);

        System.out.println("Second List:");
        SL.display(SL.head2);

        Node merged = SL.mergeOfTwoLinkList();

        System.out.println("\nMerged List:");
        SL.display(merged);
    }
}