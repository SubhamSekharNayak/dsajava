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

	static void insertBeg(int ele){
              Node cur=new Node();
              	cur.data=ele;
              if(head==null)
              {

              	head=cur;
              	cur.next=cur;
              	
              	return;
              }
              
              ptr=head;
              do
              {
              	ptr=ptr.next;

              }
              while(ptr.next!=head);
              ptr.next=cur;
              cur.next=head;
              head=cur;


              

              System.out.println(ele+" inserted at the beginning!");

	}

	static void disp()
	{
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
class CLInsertBeg
{
	public static void main(String args[])
	{
		CL.create();
		CL.disp();
		
		CL.insertBeg(9);
		CL.disp();
		
		

	}
}