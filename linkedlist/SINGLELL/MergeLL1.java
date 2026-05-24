import java.util.*;

class Node {

    int data;
    Node next;
}

class SL {

    static Node head1 = null;
    static Node head2 = null;

    // Create first linked list
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

    // Create second linked list
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

    // Display linked list
    static void display(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    // Sort a linked list (Bubble Sort)
    static Node sortList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;

        } while (swapped);

        return head;
    }

    // Merge two sorted linked lists into a THIRD list
    static Node mergeOfTwoLinkList() {

        if (head1 == null && head2 == null) {
            return null;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node p1 = head1;
        Node p2 = head2;

        Node head3 = null;
        Node tail3 = null;

        while (p1 != null && p2 != null) {
            int val;

            if (p1.data <= p2.data) {
                val = p1.data;
                p1 = p1.next;
            } else {
                val = p2.data;
                p2 = p2.next;
            }

            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;

            if (head3 == null) {
                head3 = newNode;
                tail3 = newNode;
            } else {
                tail3.next = newNode;
                tail3 = newNode;
            }
        }

        while (p1 != null) {
            Node newNode = new Node();
            newNode.data = p1.data;
            newNode.next = null;

            tail3.next = newNode;
            tail3 = newNode;
            p1 = p1.next;
        }

        while (p2 != null) {
            Node newNode = new Node();
            newNode.data = p2.data;
            newNode.next = null;

            tail3.next = newNode;
            tail3 = newNode;
            p2 = p2.next;
        }

        return head3;
    }
}

public class MergeOfTwoLinkedListSorting {

    public static void main(String[] args) {

        System.out.println("Create FIRST list:");
        SL.create();

        System.out.println("\nCreate SECOND list:");
        SL.create1();

        // Sort both lists
        SL.head1 = SL.sortList(SL.head1);
        SL.head2 = SL.sortList(SL.head2);

        System.out.println("\nSorted First List:");
        SL.display(SL.head1);

        System.out.println("Sorted Second List:");
        SL.display(SL.head2);

        // Merge sorted lists
        Node merged = SL.mergeOfTwoLinkList();

        System.out.println("\nMerged Sorted List:");
        SL.display(merged);
    }
}