//Binary Tree Creation by using recursion
import java.util.*;

class Node 
{
    int data;
    Node left, right;

    Node(int value) 
    {
        data = value;
        left = right = null;
    }
}

class BinaryTreeUR1
{
    Node root;
    static Scanner sc = new Scanner(System.in);
    
    Node create() 
    {
        System.out.print("Enter node value: ");
        int data = sc.nextInt();

        Node root = new Node(data);

        System.out.print("Enter number of children (0/1/2) of " + data + ": ");
        int n = sc.nextInt();

        if (n == 1) 
        {
            System.out.println("Enter left child of " + data);
            root.left = create();
        }
        else if (n == 2) 
        {
            System.out.println("Enter left child of " + data);
            root.left = create();

            System.out.println("Enter right child of " + data);
            root.right = create();
        }

        return root;
    }
    void inorder(Node root) 
    {
        if (root != null) 
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    void preorder(Node root) 
    {
        if (root != null) 
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root) 
    {
        if (root != null) 
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args) 
    {
        BinaryTreeUR1 tree = new BinaryTreeUR1();

        tree.root = tree.create();

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
    }
}