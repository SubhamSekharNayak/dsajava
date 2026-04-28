import java.util.*;
class Node
{
	int data;
	Node next;
}
class NodeTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null, cur=null, ptr=null;
		char ch='y';
		int c=0;
		while(ch=='y')
		{
			c++;
			cur=new Node();
			System.out.println("enter node: "+c+" data");
			cur.data=sc.nextInt();
			cur.next=null;
			if(head==null)
			{
				head=cur;
			}
			else{
				ptr.next=cur;
			}
			ptr=cur;
			System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
		}
		System.out.println("elements are: ");
		ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}

	}
}