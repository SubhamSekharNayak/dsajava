import java.util.*;

public class BST {

    // Define structure for BST node
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert node into BST
    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    // Inorder traversal
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Find minimum node in right subtree
    static Node findMin(Node node) {
        while (node != null && node.left != null)
            node = node.left;
        return node;
    }

    // Delete node from BST with comments for all 3 cases
    static Node deleteNode(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        else {
            // Node found

            // Case 1: No child (leaf)
            if (root.left == null && root.right == null) {
                System.out.println("Deleting leaf node (no child): " + root.data);
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                System.out.println("Deleting node with one child: " + root.data);
                return root.right;
            } else if (root.right == null) {
                System.out.println("Deleting node with one child: " + root.data);
                return root.left;
            }

            // Case 3: Two children
            System.out.println("Deleting node with two children: " + root.data);
            Node temp = findMin(root.right);
            root.data = temp.data;                          // Copy inorder successor value
            root.right = deleteNode(root.right, temp.data); // Delete successor
        }
        return root;
    }

    // Main function
    public static void main(String[] args) {
        Node root = null;

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Insert values
        for (int val : values)
            root = insert(root, val);

        System.out.println("Original BST (Inorder):");
        inorder(root);
        System.out.println("\n");

        // Case 1: Delete leaf node (20)
        root = deleteNode(root, 20);
        System.out.println("After deleting leaf node 20:");
        inorder(root);
        System.out.println("\n");

        // Case 2: Delete node with one child (30 has only right child 40 now)
        root = deleteNode(root, 30);
        System.out.println("After deleting node with one child 30:");
        inorder(root);
        System.out.println("\n");
        // Case 3: Delete node with two children (50)
        root = deleteNode(root, 50);
        System.out.println("After deleting node with two children 50:");
        inorder(root);
        System.out.println();
    }
}






// import java.util.Scanner;

// public class BST {

//     static class BSTNode {
//         int data;
//         BSTNode left, right;
//         BSTNode(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     static class ListNode {
//         int data;
//         ListNode next;
//         ListNode(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class LinkedList {
//         ListNode head, tail;

//         void add(int data) {
//             ListNode newNode = new ListNode(data);
//             if (head == null) {
//                 head = tail = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }

//         void print() {
//             ListNode curr = head;
//             while (curr != null) {
//                 System.out.print(curr.data);
//                 if (curr.next != null) System.out.print(" -> ");
//                 curr = curr.next;
//             }
//             System.out.println();
//         }

//         void clear() {
//             head = tail = null;
//         }
//     }

//     static BSTNode insert(BSTNode root, int data) {
//         if (root == null)
//             return new BSTNode(data);
//         if (data < root.data)
//             root.left = insert(root.left, data);
//         else
//             root.right = insert(root.right, data);
//         return root;
//     }

//     static void inorder(BSTNode root, LinkedList list) {
//         if (root != null) {
//             inorder(root.left, list);
//             list.add(root.data);
//             inorder(root.right, list);
//         }
//     }

//     static BSTNode findMin(BSTNode node) {
//         while (node != null && node.left != null)
//             node = node.left;
//         return node;
//     }

//     static BSTNode deleteNode(BSTNode root, int key) {
//         if (root == null)
//             return null;
//         if (key < root.data)
//             root.left = deleteNode(root.left, key);
//         else if (key > root.data)
//             root.right = deleteNode(root.right, key);
//         else {
//             if (root.left == null && root.right == null) {
//                 System.out.println("Deleting leaf node (no child): " + root.data);
//                 return null;
//             }
//             if (root.left == null) {
//                 System.out.println("Deleting node with one child: " + root.data);
//                 return root.right;
//             } else if (root.right == null) {
//                 System.out.println("Deleting node with one child: " + root.data);
//                 return root.left;
//             }
//             System.out.println("Deleting node with two children: " + root.data);
//             BSTNode temp = findMin(root.right);
//             root.data = temp.data;
//             root.right = deleteNode(root.right, temp.data);
//         }
//         return root;
//     }

//     static void printTraversal(String label, BSTNode root, LinkedList list) {
//         list.clear();
//         inorder(root, list);
//         System.out.println(label);
//         list.print();
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         BSTNode root = null;
//         LinkedList list = new LinkedList();

//         // ── Insert ──────────────────────────────────────────────
//         System.out.print("How many values to insert? ");
//         int n = sc.nextInt();

//         System.out.println("Enter " + n + " values:");
//         for (int i = 0; i < n; i++) {
//             System.out.print("Value " + (i + 1) + ": ");
//             root = insert(root, sc.nextInt());
//         }

//         printTraversal("BST after insertion (Inorder):", root, list);

//         // ── Delete ──────────────────────────────────────────────
//         System.out.print("How many nodes to delete? ");
//         int d = sc.nextInt();

//         for (int i = 0; i < d; i++) {
//             System.out.print("Enter value to delete: ");
//             int key = sc.nextInt();
//             root = deleteNode(root, key);
//             printTraversal("BST after deleting " + key + ":", root, list);
//         }

//         sc.close();
//     }
// }