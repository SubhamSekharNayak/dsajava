import java.util.*;

class Node
{
	int data;
	Node pre;
	Node next;
}

class DCL
{
	static Node head=null; //this means DL HAS Node
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
		


	}

	static void insertBeg(int ele){
		Node cur=new Node();
		cur.data=ele;
		if(head==null)
		{

			cur.pre=cur;
			head=cur;
			cur.next=cur;

			return;
		}
		Node ptr=head.pre;
		cur.pre=ptr;
		cur.next=head;
		head.pre=cur;
		ptr.next=cur;
		head=cur;

		System.out.println(ele+" successfully inserted at the beginning!");

	}

	static void dispf()
	{
		if(head==null)
		{
			System.out.println("no element ");
			return ;
		}

		System.out.println("elements in forward: ");
		Node ptr=head;
		do
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}while(ptr!=head);
		

	}
	static void dispb()
	{
       if(head==null)
		{
			System.out.println("no element ");
			return ;
		}
        
		System.out.println("elements in backward: ");
		Node ptr=head.pre;
		do
		{
			System.out.println(ptr.data);
			ptr=ptr.pre;
		}while(ptr!=head.pre);
	}



}
class DCLInsertBeg
{
	public static void main(String args[])
	{

		DCL.create();
		DCL.dispf();
		DCL.dispb();
		DCL.insertBeg(9);
		DCL.dispf();
		DCL.dispb();

		
	}
}