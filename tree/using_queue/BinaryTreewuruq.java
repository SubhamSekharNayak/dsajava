//Binary Tree Creation without using recursion(By userdefined Queue)
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
class Queue {
    int front, rear, size;
    Node arr[];

    Queue(int capacity) {
        size = capacity;
        arr = new Node[size];
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        return front > rear;
    }

    void enqueue(Node x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = x;
    }

    Node dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }
        return arr[front++];
    }
}
class BinaryTreewuruq
{
    Node root;
    
    Node create() 
    {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(50);

        System.out.print("Enter root value: ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);
        q.enqueue(root);

        while (!q.isEmpty()) {
            Node current = q.dequeue();

            // Left child
            System.out.print("Enter left child of " + current.data + " (-1 for no node): ");
            int leftData = sc.nextInt();

            if (leftData != -1) {
                current.left = new Node(leftData);
                q.enqueue(current.left);
            }

            // Right child
            System.out.print("Enter right child of " + current.data + " (-1 for no node): ");
            int rightData = sc.nextInt();

            if (rightData != -1) {
                current.right = new Node(rightData);
                q.enqueue(current.right);
            }
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
        BinaryTreewuruq tree = new BinaryTreewuruq();

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