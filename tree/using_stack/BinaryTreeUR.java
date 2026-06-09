//By using Recursion
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
class BinaryTreeUR
{
    Node root;
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

    public static void main(String[] args) {
        BinaryTreeUR tree = new BinaryTreeUR();

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