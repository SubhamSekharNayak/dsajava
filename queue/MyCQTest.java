import java.util.*;
class MyCQ
{
	static int arr[];
	static int front;
	static int rear;
	final int max;

	public MyCQ(int size)
	{
		
		max=size;
		front=-1;
		rear=-1;
		arr=new int[size];
	}

	public void enQueue(int ele)
	{
		// if((front==0 && rear==max-1) || (front==rear+1))
		if((rear+1) % max == front)
		{
			System.out.println("Queue Overflow!");
			return;

		}
		if(front==-1)
		{
			front=0;
		}
		// if(rear==max-1)
		// {
		// 	rear=0;
		// }
		// else
		// {
		// 	rear++;

		// }
		rear=(rear+1) % max;
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
		// if(front==max-1)
		// {
		// 	front=0;
		// }
		// else
		// {
		// 	front++;

		// }
		front=(front+1) % max;
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
		// int i=front;
		// if(front<=rear)
		// {
		// 	while(i<=rear)
		// 	{
		// 		System.out.println(arr[i]);
		// 		i++;

		// 	}
		// }
		// else
		// {
		// 	while(i<=max-1)
		// 	{
		// 		System.out.println(arr[i]);
		// 		i++;
		// 	}
		// 	i=0;
		// 	while(i<=rear)
		// 	{
		// 		System.out.println(arr[i]);
		// 		i++;

		// 	}

		// }

		int i=front;
		do
		{
			System.out.println(arr[i]);
			i=(i+1) % max;


		}
		while(i!=(rear+1) % max);
	}




}

class MyCQTest
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size of the array:");
		int size=sc.nextInt();



		MyCQ cq =new MyCQ(size);



		while(true) {
			System.out.println("enter your choice\n1.for enQueue\n2.for deQueue\n3.for peek\n4.for disp\n5.to exit");
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