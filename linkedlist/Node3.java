class Node
{
	int data;
	Node next;
}
class Node3
{
	public static void main(String args[])
	{
		Node F=new Node();
		Node S=new Node();
		Node T=new Node();
		F.data=10;
		F.next=S;
		S.data=20;
		S.next=T;
		T.data=30;
		T.next=null;

		Node ptr=F;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}


	}
}