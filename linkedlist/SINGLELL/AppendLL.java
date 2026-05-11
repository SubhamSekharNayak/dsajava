import java.util.*;
class Node
{
	int data;
	Node next;
}
class SL
{

	static Node create()
	{
		Scanner sc=new Scanner(System.in);
		Node cur=null,head=null, ptr=null;
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
		return head;

	}

	

	static void merGe(Node L1,Node L2) {      
    if (L1 == null && L2==null) {
        System.out.println("List is empty.");
        return;
    }
    Node ptr=L1;
    Node head3=null;
    while(ptr!=null)
    {
    	head3=appendLL(head3,ptr.data);
    	ptr=ptr.next;
    }
    ptr=L2;
       while(ptr!=null)
    {
    	head3=appendLL(head3,ptr.data);
    	ptr=ptr.next;
    }
     disp(head3);
    
}

static Node appendLL(Node head,int ele){
		Node cur=new Node();
		cur.data=ele;
		cur.next=null;
		if(head==null)
		{
			
			head=cur;
			return head;
		}
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=cur;
		return head;

	}


   

static void disp(Node head)
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
class AppendLL
{
	public static void main(String args[])
	{
		Node L1=SL.create();
		Node L2=SL.create();
		SL.disp(L1);
		SL.disp(L2);
		System.out.println("after merge:-");
		SL.merGe(L1,L2);
		
		


	}
}









