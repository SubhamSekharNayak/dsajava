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
	static void sum_EvenOdd(){
		
		int esum=0, osum=0;
		if(head==null)
		{
			
			System.out.println("no elements present");
			return ;
		}
		Node ptr=head;
		while(ptr!=null)
		{
			
		if(ptr.data%2==0)
		{
			esum=esum+ptr.data;

		}
		else
		{
			osum=osum+ptr.data;
		}
		ptr=ptr.next;

		}

		   System.out.println("sum of even elements= "+esum);
		   System.out.println("sum of odd elements= "+osum);

		   
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
class SumEvenOdd
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.sum_EvenOdd();
		
        

		
		

	}
}