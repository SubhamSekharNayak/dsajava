import java.util.*;
class Node
{
	int data;
	Node next;
}
class SL
{
	static Node head; //this means SL has a Node
	static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node cur=null, ptr=null;
		char ch='y';
		int c=0;
		while(ch=='y')
		{
			c=c+1;
			cur=new Node();
			System.out.println("enter node"+c+" data:");
			cur.data=sc.nextInt();
			cur.next=null;
			if(head==null)
			{
				head=cur;
			}
			else
			{
				ptr.next=cur;
			}
			ptr=cur;
			System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
		}
	}
	
	static void delDuplCon() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
	
		Node ptr=head;
		while(ptr!=null)
		{

              if(ptr.next==null)
				{
					break;
				}
			if(ptr.data==ptr.next.data)
			{
				if(ptr.next.next==null)
				{
					ptr.next=null;
					break;
				}
				else
				{
                 ptr.next=ptr.next.next;

                 continue;
                 }
			}
			ptr=ptr.next;
		}

	}


   

static void disp()
{
	System.out.println("elements are: ");
	Node ptr=head;
	while(ptr!=null)
	{
		System.out.println(ptr.data);
		ptr=ptr.next;
	}
}
}
class DelDuplCon
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.delDuplCon();
		SL.disp();


	}
}









