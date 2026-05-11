import java.util.*;

class Node
{
	int data;
	Node pre;
	Node next;
}
class DoubleLLn
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
			cur.pre=null;
			cur.next=null;
			if(head==null)
			{
				head=cur;
			}
			else{
				ptr.next=cur;
				cur.pre=ptr;
			}
			ptr=cur;
			System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
		}
		System.out.println("elements in forward: ");
		ptr=head;
		while(ptr.next!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
		System.out.println("\n");
		System.out.println("elements in backward: ");
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.pre;
		}

	}
}