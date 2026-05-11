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
			static void InsertAnyPos(int p, int ele) {
				Node cur=new Node();
				if (head == null) {
					System.out.println("no elements present in the LL");
					return;
				}

				int c = count();

				if (p > c+1 || p < 1) {
					System.out.println("invalid position!");
					return;
				}
				System.out.println("inserted element=" + ele);
	    // CASE 1: Inserting the first node
				if (p == 1) {
					cur.data=ele;
					cur.next=head;
					head=cur;
					
					return;
				}

	    // CASE 2: Inserting any other node
				Node ptr = head;
				int i = 1;
				while (i < (p - 1)) {
					ptr = ptr.next;
					i++;
				}
				

				
				
				cur.data=ele;
				cur.next = ptr.next;
				ptr.next=cur;
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
		class InsertAnyPosition
		{
			public static void main(String args[])
			{
				SL.create();
				SL.disp();
				SL.InsertAnyPos(1, 35);
				SL.disp();

				








			}
		}