import java.util.*;

class Node
{
	int data;
	Node pre;
	Node next;
}

class DL
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
		


	}

	static void insertBeg(int ele){
              Node cur=new Node();
              	cur.data=ele;
              if(head==null)
              {

              	cur.pre=null;
              	head=cur;
              	cur.next=null;
              	
              	return;
              }
              cur.next=head;
              cur.pre=null;
              head.pre=cur;
              head=cur;
              System.out.println(ele+" inserted at the beginning!");

	}

	static void dispf()
	{
		if(head==null)
		{
			System.out.println("no element ");
			return;
		}

		System.out.println("elements in forward: ");
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		

	}
	static void dispb()
	{
       if(head==null)
		{
			System.out.println("no element ");
			return;
		}
        Node ptr=head;
        while(ptr.next!=null)
        {
        	ptr=ptr.next;
        }
	
		System.out.println("elements in backward: ");
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.pre;
		}
	}

}
class DLInsertBeg
{
	public static void main(String args[])
	{

		DL.create();
		DL.dispf();
		DL.dispb();
		DL.insertBeg(9);
		DL.dispf();
		DL.dispb();

		
	}
}