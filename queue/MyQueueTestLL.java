import java.util.*;
class Node
{
	int data;
	Node next;
}
class MyQueueLL
{
	Node front, rear;

	public MyQueueLL()
	{
		
		front=null;
		rear=null;
	}

	public void enQueue(int ele)
	{
		Node cur=new Node();


		if(cur==null)
		{
			System.out.println("Queue Overflow!");
			return;

		}
		cur.data=ele;
		cur.next=null;
		if(front==null)
		{
			front=cur;
		}
		if(rear==null)
		{
			rear=cur;
			return;
		}
		rear.next=cur;
		rear=cur;
		System.out.println("the enqueued element is "+ele);
	}

	public void deQueue()
	{
		if(front==null)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("the dequeued element is "+front.data);
		if(front==rear)
		{
			front=null;
			rear=null;
			return;
		}
		front=front.next;
	}

	public void peek()
	{
		if(front==null)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("the element at the front is "+front.data);
	}

	public void disp()
	{
		if(front==null)
		{
			System.out.println("Queue Underflow!");
			return;

		}
		Node ptr=front;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;

		}
	}




}

class MyQueueTestLL
{
	public static void main(String[] args) 
	{





		MyQueueLL q =new MyQueueLL();



		while(true) {
			System.out.println("enter your choice\n1.for enQueue\n2.for deQueue\n3.for peek\n4.for disp\n5.to exit");
			Scanner sc = new Scanner(System.in);

			int ch=sc.nextInt();
			System.out.println("");


			switch(ch) {
			case 1:
				System.out.print("enter the element you want to enQueue:");
				int ele=sc.nextInt();

				q.enQueue(ele);
				break;

			case 2:
				q.deQueue();
				break;

			case 3:
				q.peek();
				break;

			case 4:
				q.disp();
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