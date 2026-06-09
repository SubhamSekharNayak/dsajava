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