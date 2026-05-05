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

	/*
	static void delDupl() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
	
		Node ptr=head;
		Node temp=ptr.next;
		Node p=ptr;
		while(temp!=null)
		{
			if(temp.next==null)
				{
					break;
				}
			if(ptr.data==temp.data)
			{

                p.next=temp.next;
                temp=p.next;
                continue;
			}
			p=p.next;
		}

	}
	*/

	static void delDupl() {       //unsorted dupl deletion
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    Node ptr = head;

    while (ptr != null) {
        Node temp = ptr;

        while (temp.next != null) {
            if (ptr.data == temp.next.data) {
                temp.next = temp.next.next; // remove duplicate
            } else {
                temp = temp.next;
            }
        }

        ptr = ptr.next;
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
class DelDupl
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.delDupl();
		SL.disp();


	}
}









