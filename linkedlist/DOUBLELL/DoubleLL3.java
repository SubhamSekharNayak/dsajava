class Node
{
	int data;
	Node pre;
	Node next;
}
class DoubleLL3
{
	public static void main(String args[])
	{
		Node F=new Node();
		Node S=new Node();
		Node T=new Node();
		F.pre=null;
		F.data=10;
		F.next=S;
		S.data=20;
		S.pre=F;
		S.next=T;
		T.data=30;
		T.pre=S;
		T.next=null;

		Node ptr=F;
		while(ptr.next!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		System.out.println(ptr.data); //last node
		System.out.println("\n");
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.pre;
		}


	}
}