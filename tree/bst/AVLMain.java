// import java.util.Scanner;

// class Node {
//     int data;
//     Node left, right;
//     int height;

//     Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//         this.height = 1; // AVL initial height
//     }
// }

// class AVLTree {

//     // Get height
//     int getHeight(Node node) {
//         if (node == null)
//             return 0;
//         return node.height;
//     }

//     // Get balance factor
//     int getBalance(Node node) {
//         if (node == null)
//             return 0;
//         return getHeight(node.left) - getHeight(node.right);
//     }

//     // Right Rotation (LL Case)
//     Node rightRotate(Node z) {
//         Node y = z.left;
//         Node T3 = y.right;

//         y.right = z;
//         z.left = T3;

//         z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
//         y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

//         return y;
//     }

//     // Left Rotation (RR Case)
//     Node leftRotate(Node z) {
//         Node y = z.right;
//         Node T2 = y.left;

//         y.left = z;
//         z.right = T2;

//         z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
//         y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

//         return y;
//     }

//     // Insert with AVL balancing
//     Node insert(Node root, int key) {

//         // BST insert
//         if (root == null)
//             return new Node(key);

//         if (key < root.data)
//             root.left = insert(root.left, key);
//         else
//             root.right = insert(root.right, key);

//         // Update height
//         root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

//         // Balance factor
//         int balance = getBalance(root);

//         // LL Case
//         if (balance > 1 && key < root.left.data)
//             return rightRotate(root);

//         // RR Case
//         if (balance < -1 && key > root.right.data)
//             return leftRotate(root);

//         // LR Case
//         if (balance > 1 && key > root.left.data) {
//             root.left = leftRotate(root.left);
//             return rightRotate(root);
//         }

//         // RL Case
//         if (balance < -1 && key < root.right.data) {
//             root.right = rightRotate(root.right);
//             return leftRotate(root);
//         }

//         return root;
//     }

//     // Inorder traversal
//     void inorder(Node root) {
//         if (root != null) {
//             inorder(root.left);
//             System.out.print(root.data + " ");
//             inorder(root.right);
//         }
//     }
// }

// public class AVLMain {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         AVLTree avl = new AVLTree();
//         Node root = null;

//         System.out.println("Enter numbers for AVL Tree (type -1 to stop):");

//         while (true) {
//             System.out.print("Enter data: ");
//             int value = sc.nextInt();


//             if (value == -1)
//                 break;

//             root = avl.insert(root, value);
//         }

//         System.out.println("\nInorder Traversal of AVL Tree:");
//         avl.inorder(root);

//         sc.close();
//     }
// }



import java.util.Scanner;

class Node {
    int data;
    Node left, right;
    int height;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}

class AVLTree {

    // Get height of a node
    int height(Node n) {
        if (n == null) {
            return 0;
        }
        return n.height;
    }

    // Get balance factor
    int balance_factor(Node n) {
        if (n == null) {
            return 0;
        }

        return height(n.left) - height(n.right);
    }

    // Update height
    void update_height(Node n) {
        if (n != null) {
            n.height = 1 + Math.max(height(n.left), height(n.right));
        }
    }

    // Right Rotation
    Node right_rotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotation
        x.right = y;
        y.left = T2;

        // Update heights
        update_height(y);
        update_height(x);

        return x;
    }

    // Left Rotation
    Node left_rotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotation
        y.left = x;
        x.right = T2;

        // Update heights
        update_height(x);
        update_height(y);

        return y;
    }

    // Insert a node
    Node insert(Node root, int key) {

        // 1. Normal BST insertion
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } 
        else if (key > root.data) {
            root.right = insert(root.right, key);
        } 
        else {
            return root; // Duplicate not allowed
        }

        // 2. Update height
        update_height(root);

        // 3. Get balance factor
        int balance = balance_factor(root);

        // 4. Balance the tree

        // Left Left Case
        if (balance > 1 && key < root.left.data) {
            return right_rotate(root);
        }

        // Right Right Case
        if (balance < -1 && key > root.right.data) {
            return left_rotate(root);
        }

        // Left Right Case
        if (balance > 1 && key > root.left.data) {
            root.left = left_rotate(root.left);
            return right_rotate(root);
        }

        // Right Left Case
        if (balance < -1 && key < root.right.data) {
            root.right = right_rotate(root.right);
            return left_rotate(root);
        }

        return root;
    }

    // Find minimum value node
    Node min_value_node(Node root) {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    // Delete a node
    Node delete(Node root, int key) {

        // 1. Normal BST deletion
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } 
        else if (key > root.data) {
            root.right = delete(root.right, key);
        } 
        else {

            // Node with no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Node with only right child
            if (root.left == null) {
                return root.right;
            }

            // Node with only left child
            if (root.right == null) {
                return root.left;
            }

            // Node with two children
            Node temp = min_value_node(root.right);

            // Copy inorder successor's value
            root.data = temp.data;

            // Delete inorder successor
            root.right = delete(root.right, temp.data);
        }

        // 2. Update height
        update_height(root);

        // 3. Get balance factor
        int balance = balance_factor(root);

        // 4. Balance the tree

        // Left Left Case
        if (balance > 1 && balance_factor(root.left) >= 0) {
            return right_rotate(root);
        }

        // Left Right Case
        if (balance > 1 && balance_factor(root.left) < 0) {
            root.left = left_rotate(root.left);
            return right_rotate(root);
        }

        // Right Right Case
        if (balance < -1 && balance_factor(root.right) <= 0) {
            return left_rotate(root);
        }

        // Right Left Case
        if (balance < -1 && balance_factor(root.right) > 0) {
            root.right = right_rotate(root.right);
            return left_rotate(root);
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

    // Preorder traversal
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}

public class AVLMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AVLTree tree = new AVLTree();
        Node root = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root = tree.insert(root, value);
        }

        System.out.println("\nInorder traversal after insertion:");
        tree.inorder(root);

        System.out.println("\n\nPreorder traversal after insertion:");
        tree.preorder(root);

        System.out.print("\n\nEnter value to delete: ");
        int key = sc.nextInt();

        root = tree.delete(root, key);

        System.out.println("\nInorder traversal after deletion:");
        tree.inorder(root);

        System.out.println("\n\nPreorder traversal after deletion:");
        tree.preorder(root);

        sc.close();
    }
}