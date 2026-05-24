import java.util.*;
class Node
{
	int data;
	Node next;
}
class MyStackLL
{
	 Node top;
	

	public MyStackLL()
	{
		
		top=null;
	}

	public void push(int ele)
	{
		Node cur=new Node();
		if(cur==null)
		{
			System.out.println("Stack Overflow!");
			return;

		}
		cur.data=ele;
		cur.next=top;
		top=cur;
		System.out.println("the pushed element is "+ele);
	}

	public void pop()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow!");
			return;
		}
		System.out.println("the removed element is "+top.data);
		top=top.next;
	}

	public void peek()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow!");
			return;
		}
		System.out.println("the element at the top is "+top.data);
	}

	public void disp()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow!");
			return;

		}
		Node ptr=top;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;

		}
	}




}

class MyStackTestLL
{
	public static void main(String[] args) 
	{

		
		

		MyStackLL s =new MyStackLL();



		while(true) {
			System.out.println("enter your choice\n1.for push\n2.for pop\n3.for peek\n4.for disp\n5.to exit");
			Scanner sc = new Scanner(System.in);
			int ch=sc.nextInt();
			System.out.println("");


			switch(ch) {
			case 1:
				System.out.print("enter the element you want to push:");
				int ele=sc.nextInt();

				s.push(ele);
				break;

			case 2:
				s.pop();
				break;

			case 3:
				s.peek();
				break;

			case 4:
				s.disp();
				break;

			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("invalid entry!");



			}
		}


		
	}
}