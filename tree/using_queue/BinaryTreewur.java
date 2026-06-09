//Binary Tree Creation without using recursion(By predefined Queue)
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
class BinaryTreewur
{
    Node root;
    
    Node create() 
    {
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<>();

        System.out.print("Enter root value: ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);
        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.remove();

            // Left child
            System.out.print("Enter left child of " + current.data + " (-1 for no node): ");
            int leftData = sc.nextInt();

            if (leftData != -1) {
                current.left = new Node(leftData);
                q.add(current.left);
            }

            // Right child
            System.out.print("Enter right child of " + current.data + " (-1 for no node): ");
            int rightData = sc.nextInt();

            if (rightData != -1) {
                current.right = new Node(rightData);
                q.add(current.right);
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
        BinaryTreewur tree = new BinaryTreewur();

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