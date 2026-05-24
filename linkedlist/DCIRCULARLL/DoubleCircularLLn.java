import java.util.*;

class Node
{
	int data;
	Node pre;
	Node next;
}
class DoubleCircularLLn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null, cur=null, ptr=null;
		char ch='y';
		int c=0;
		while(ch=='y')
		{
			c=c+1;
			cur=new Node();
			System.out.println("enter node"+c+" data");
			cur.data=sc.nextInt();
			cur.pre=cur;
			cur.next=cur;
			if(head==null)
			{
				head=cur;
			}
			else{
				ptr.next=cur;
				cur.pre=ptr;
				cur.next=head;
				head.pre=cur;
			}
			ptr=cur;
			System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
		}
		System.out.println("elements in forward: ");
		ptr=head;
		do
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}while(ptr!=head);

		System.out.println("elements in backward: ");
		ptr=head.pre;
		do
		{
			System.out.println(ptr.data);
			ptr=ptr.pre;
		}while(ptr!=head.pre);

	}
}