//Without using Recursion(By predefined Stack)
import java.util.Stack;
class Node
{
	int data;
	Node left,right;
	Node(int value)
	{
		data=value;
		left=right=null;
	}
}
class BinaryTreeWUR
{
	Node root;
    void inorder(Node root) 
    {
    	Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) 
        {
        // Go to leftmost node
        	while (current != null) 
        	{
        		stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");

            current = current.right;
        }
    }
    void preorder(Node root) 
    {
    	if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) 
        {
        	Node current = stack.pop();
            System.out.print(current.data + " ");

            // Push right first (so left is processed first)
            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
    }
    void postorder(Node root) 
    {
    	if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) 
        {
        	Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null)
                stack1.push(current.left);

            if (current.right != null)
                stack1.push(current.right);
        }

        while (!stack2.isEmpty()) 
        {
        	System.out.print(stack2.pop().data + " ");
        }
    }


	public static void main(String[] args) {
        BinaryTreeWUR tree = new BinaryTreeWUR();

        // Create root
        tree.root = new Node(1);

        // Create children
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Tree created successfully!");

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