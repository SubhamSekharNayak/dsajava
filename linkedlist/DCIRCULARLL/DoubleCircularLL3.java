class Node
{
	int data;
	Node pre;
	Node next;
}
class DoubleCircularLL3
{
	public static void main(String args[])
	{
		Node F=new Node();
		Node S=new Node();
		Node T=new Node();
		F.pre=T;
		F.data=10;
		F.next=S;
		S.data=20;
		S.pre=F;
		S.next=T;
		T.data=30;
		T.pre=S;
		T.next=F;
         System.out.println("forward:");
		Node ptr=F;
		do		
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		while(ptr!=F);
		System.out.println("\nbackward:");
        ptr=F.pre;
		do
		{
			System.out.println(ptr.data);
			ptr=ptr.pre;
		}while(ptr!=F.pre);


	}
}