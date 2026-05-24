import java.util.*;
class Node
{
	int data;
	Node next;
}
class CL
{
	static Node head; //this means CL HAS Node
	static Node ptr;
	static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node cur=null;
		char ch='y';
		int c=0;
		while(ch=='y')
		{
			c=c+1;
			cur=new Node();
			System.out.println("enter node"+c+" data:");
			cur.data=sc.nextInt();
			cur.next=cur;
			if(head==null)
			{
				head=cur;
			}
			else{
				ptr.next=cur;
				cur.next=head;
			}
			ptr=cur;
			System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
		}
	}

	static void deleteBeg(){
		
		if(head==null)
		{

			System.out.println("List is empty!");
			
			return;
		}
		System.out.println("deleted element at the beginning: "+head.data);
		if(head.next==head)
		{
			
			head=null;
			System.out.println("successfully deleted the only element in the list!");

			return;
		}
		
		ptr=head;
		do
		{
			ptr=ptr.next;

		}
		while(ptr.next!=head);
		head=head.next;
		ptr.next=head;

		
	}

	static void disp()
	{
		if(head==null)
		{
			System.out.println("List is empty.");
			return;
		}
		System.out.println("elements are: ");
		ptr=head;


		do
		{
			System.out.println(ptr.data);
			ptr=ptr.next;

		}
		while(ptr!=head);

	}

}
class CLDeleteBeg
{
	public static void main(String args[])
	{
		CL.create();
		CL.disp();


		CL.deleteBeg();
		CL.disp();
		
		

	}
}