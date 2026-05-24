import java.util.*;
class MyQueue
{
	static int arr[];
	static int front;
	static int rear;
	final int max;

	public MyQueue(int size)
	{
		
		max=size;
		front=-1;
		rear=-1;
		arr=new int[size];
	}

	public void enQueue(int ele)
	{
		if(rear==max-1)
		{
			System.out.println("Queue Overflow!");
			return;

		}
		if(front==-1)
		{
			front=0;
		}
		rear=rear+1;
		arr[rear] =ele;
		System.out.println("the enqueued element is "+ele);
	}

	public void deQueue()
	{
		if(front==-1)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("the dequeued element is "+arr[front]);
		if(front==rear)
		{
			front=-1;
			rear=-1;
			return;
		}
		front=front+1;
	}

	public void peek()
	{
		if(front==-1)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("the element at the front is "+arr[front]);
	}

	public void disp()
	{
		if(front==-1)
		{
			System.out.println("Queue Underflow!");
			return;

		}
		int i=front;
		while(i<=rear)
		{
			System.out.println(arr[i]);
			i++;

		}
	}




}

class MyQueueTest
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size of the array:");
		int size=sc.nextInt();



		MyQueue q =new MyQueue(size);



		while(true) {
			System.out.println("enter your choice\n1.for enQueue\n2.for deQueue\n3.for peek\n4.for disp\n5.to exit");
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