// import java.util.*;
// class Node
// {
// 	int data;
// 	Node next;
// }
// class SL
// {
// 	static Node head;
// 	static void create()
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Node cur=null, ptr=null;
// 		char ch='y';
// 		int c=0;
// 		while(ch=='y')
// 		{
// 			c=c+1;
// 			cur=new Node();
// 			System.out.print("enter node "+c+" data: ");
// 			cur.data=sc.nextInt();
// 			if(head==null)
// 			{
// 				head=cur;
// 			}
// 			else
// 			{
// 				ptr.next=cur;


// 			}
// 			ptr=cur;

// 			System.out.print("continue? press y else n: ");
// 			ch=sc.next().charAt(0);

// 		}
// 	}
// 	static void insertBeg(int ele)
// 	{
// 		Node cur=new Node();
// 		cur.data=ele;
// 		cur.next=head;
// 		head=cur;
// 		System.out.println("\nelement "+ele+" successfully inserted at the beg!");
// 	}
// 	static void disp()
// 	{
// 		System.out.println("\nthe elements are as follows:");
// 		Node ptr=head;
// 		while(ptr!=null)
// 		{
// 			System.out.print(ptr.data +" --> ");
// 			ptr=ptr.next;
// 		}
// 		System.out.println("NULL");
// 	}



// }
// class TestInsertBeg
// {
// 	public static void main(String args[])
// 	{
// 		SL.create();
// 		SL.disp();
// 		SL.insertBeg(23);
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
	static Node head;
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
			System.out.print("enter node "+c+" data: ");
			cur.data=sc.nextInt();
			if(head==null)
			{
				head=cur;
			}
			else
			{
				ptr.next=cur;


			}
			ptr=cur;
			
			System.out.print("continue? press y else n: ");
			ch=sc.next().charAt(0);

		}
	}
	static void insertBeg(int ele)
	{

		Node cur=new Node();
		
		cur.data=ele;
		cur.next=head;
		head=cur;
		System.out.println("\nelement "+ele+" successfully inserted at the beg!");
	}
	static void disp()
	{
		System.out.println("\nthe elements are as follows:");
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data +" --> ");
			ptr=ptr.next;
		}
		System.out.println("NULL");
	}
	


}
class TestInsertBeg
{
	public static void main(String args[])
	{
		



		SL.create();
		SL.disp();
		Scanner sc=new Scanner(System.in);
		System.out.print("\nenter your desired element: ");
		int ele=sc.nextInt();
		SL.insertBeg(ele);
		SL.disp();
	}
}