		// import java.util.*;
		// class Node
		// {
		// 	int data;
		// 	Node next;
		// }
		// class SL
		// {
		// 	static Node head; //this means SL has a Node
		// 	static void create()
		// 	{
		// 		Scanner sc=new Scanner(System.in);
		// 		Node cur=null, ptr=null;
		// 			char ch='y';
		// 			int c=0;
		// 			while(ch=='y')
		// 			{
		// 				c=c+1;
		// 				cur=new Node();
		// 				System.out.println("enter node"+c+" data:");
		// 				cur.data=sc.nextInt();
		// 				cur.next=null;
		// 				if(head==null)
		// 				{
		// 					head=cur;
		// 				}
		// 				else
		// 				{
		// 					ptr.next=cur;
		// 				}
		// 				ptr=cur;
		// 				System.out.println("Do you want to create next, if yes then press y");
		// 				ch=sc.next().charAt(0);
		// 			}
		// 	}
		// 	static int count(){

		// 		int c=0;
		// 		if(head==null)
		// 		{

		// 			System.out.println("no elements present in the LL");
		// 			return 0;
		// 		}
		// 		Node ptr=head;
		// 		while(ptr!=null)
		// 		{
		// 			ptr=ptr.next;
		// 			c=c+1;
		// 		}

		// 		   return c;

		// 	}
		// 	static void deleteAnyPos(int p)
		// 	{
		// 		if(head==null)
		// 		{
		// 			System.out.println("no elements present in the LL");
		// 			return;
		// 		}


		// 		int c=count();

		// 		if(p>c || p<1)
		// 		{
		// 			System.out.println("invalid postion!");
		// 			return ;
		// 		}
		// 			Node ptr=head;
		// 			int i=1;
		// 		while(i<(p-1))
		// 		{
		// 			i=i+1;
		// 			ptr=ptr.next;
		// 		}
		// 		System.out.println("deleted element="+ptr.next.data);
		// 	    ptr.next=ptr.next.next;




		// 	}



		// 	static void disp()
		// 	{
		// 		System.out.println("elements are: ");
		// 		Node ptr=head;
		// 		while(ptr!=null)
		// 		{
		// 			System.out.println(ptr.data);
		// 			ptr=ptr.next;
		// 		}
		// 	}
		// }
		// class DeleteAnyPosition
		// {
		// 	public static void main(String args[])
		// 	{
		// 		SL.create();
		// 		SL.disp();
		// 		SL.deleteAnyPos(1);
		// 		SL.disp();







		// 	}
		// }









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
			static int count(){
				
				int c=0;
				if(head==null)
				{
					
					System.out.println("no elements present in the LL");
					return 0;
				}
				Node ptr=head;
				while(ptr!=null)
				{
					ptr=ptr.next;
					c=c+1;
				}

				return c;

			}
			static void deleteAnyPos(int p) {
				if (head == null) {
					System.out.println("no elements present in the LL");
					return;
				}

				int c = count();

				if (p > c || p < 1) {
					System.out.println("invalid position!");
					return;
				}

	    // CASE 1: Deleting the first node
				if (p == 1) {
					System.out.println("deleted element=" + head.data);
	        head = head.next; // Move head to the second node
	        return;
	    }

	    // CASE 2: Deleting any other node
	    Node ptr = head;
	    int i = 1;
	    while (i < (p - 1)) {
	    	ptr = ptr.next;
	    	i++;
	    }
	    
	    // Check if ptr.next is not null before accessing data
	    if (ptr.next != null) {
	    	System.out.println("deleted element=" + ptr.next.data);
	    	ptr.next = ptr.next.next;
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
class DeleteAnyPosition
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.deleteAnyPos(1);
		SL.disp();

		








	}
}