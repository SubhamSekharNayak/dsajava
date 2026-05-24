import java.util.*;
class Node
{
	int data;
	Node next;
}
class MyCQLL
{
	 Node front, rear;

	public MyCQLL()
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
		cur.next=cur;
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
		cur.next=front;
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
		rear.next=front;
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
		do
		{
			System.out.println(ptr.data);
			ptr=ptr.next;


		}
		while(ptr!=front);
	}




}

class MyCQTestLL
{
	public static void main(String[] args) 
	{


		



		MyCQLL cq =new MyCQLL();



		while(true) {
			System.out.println("enter your choice\n1.for enQueue\n2.for deQueue\n3.for peek\n4.for disp\n5.to exit");
			Scanner sc = new Scanner(System.in);

			int ch=sc.nextInt();
			System.out.println("");


			switch(ch) {
			case 1:
				System.out.print("enter the element you want to enQueue:");
				int ele=sc.nextInt();

				cq.enQueue(ele);
				break;

			case 2:
				cq.deQueue();
				break;

			case 3:
				cq.peek();
				break;

			case 4:
				cq.disp();
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