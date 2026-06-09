import java.util.Scanner;

class Node {
    int data;
    Node left, right;
    int height;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1; // AVL initial height
    }
}

class AVLTree {

    // Get height
    int getHeight(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    // Get balance factor
    int getBalance(Node node) {
        if (node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    // Right Rotation (LL Case)
    Node rightRotate(Node z) {
        Node y = z.left;
        Node T3 = y.right;

        y.right = z;
        z.left = T3;

        z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    // Left Rotation (RR Case)
    Node leftRotate(Node z) {
        Node y = z.right;
        Node T2 = y.left;

        y.left = z;
        z.right = T2;

        z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    // Insert with AVL balancing
    Node insert(Node root, int key) {

        // BST insert
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Update height
        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        // Balance factor
        int balance = getBalance(root);

        // LL Case
        if (balance > 1 && key < root.left.data)
            return rightRotate(root);

        // RR Case
        if (balance < -1 && key > root.right.data)
            return leftRotate(root);

        // LR Case
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL Case
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class AVLMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AVLTree avl = new AVLTree();
        Node root = null;

        System.out.println("Enter numbers for AVL Tree (type -1 to stop):");

        while (true) {
            System.out.print("Enter data: ");
            int value = sc.nextInt();

            if (value == -1)
                break;

            root = avl.insert(root, value);
        }

        System.out.println("\nInorder Traversal of AVL Tree:");
        avl.inorder(root);

        sc.close();
    }
}