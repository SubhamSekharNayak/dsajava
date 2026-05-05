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
	static void searchEle1(int ele)
	{
		if(head==null)
		{
			System.out.println("no elements present in the linked list");
			return;
		}
		Node ptr=head;
		int c=0;
		while(ptr!=null)
		{
			
			if(ptr.data==ele)
			{
				c++;
				
			}
			ptr=ptr.next;
		}
		if(c==0)
		{
			System.out.println("the entered element is not present");
		}
		else
		{
			System.out.println("entered element found "+c+" times");
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
class SearchEle1
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.searchEle1(9);
		
        

		
		

	}
}