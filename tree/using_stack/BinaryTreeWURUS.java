//Without using Recursion(By userdefined Stack)
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
class Stack {
    int top;
    int capacity = 50;
    Node arr[];

    Stack() {
        top = -1;
        arr = new Node[capacity];
    }

    void push(Node x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    Node pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top--];
    }

    Node peek() {
        if (top == -1) return null;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
class BinaryTreeWURUS
{
	Node root;
    void inorder(Node root) 
    {
    	Stack stack = new Stack();
        Node current = root;

        while (current != null || !stack.isEmpty()) 
        {
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

        Stack stack = new Stack();
        stack.push(root);

        while (!stack.isEmpty()) 
        {
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
    }
    void postorder(Node root) 
    {
    	if (root == null) return;

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

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
        BinaryTreeWURUS tree = new BinaryTreeWURUS();

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