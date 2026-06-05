import java.util.*;
class MyDQR
{
	int arr[], front, rear;
	final int max;

	public MyDQR(int size)
	{
		
		max=size;
		front=-1;
		rear=-1;
		arr=new int[size];
	}

	public void insertRear(int ele)
	{
		if((front==0 && rear==max-1) || (front==rear+1))


		// if((rear+1) % max == front)
		{
			System.out.println("Queue Overflow!");
			return;

		}
		if(front==-1)
		{
			front=0;
		}
		if(rear==max-1)
		{
			rear=0;
		}
		else
		{
			rear++;

		}
		
		arr[rear] =ele;
		System.out.println("the enqueued element is "+ele);
	}

	public void insertFront(int ele)
	{
		if((front==0 && rear==max-1) || (front==rear+1))


		// if((rear+1) % max == front)
		{
			System.out.println("Queue Overflow!");
			return;

		}
		if(front==-1)
		{
			front=0;
			rear=0;
			arr[rear]=ele;
			System.out.println("the enqueued element is "+ele);

			return;
		}
		
		if(front==0) 
		{
			front=max-1;
			
		}
		else
		{
			front--;

		}
		
		
		arr[front]=ele;
		System.out.println("the enqueued element is "+ele);
	}


	

	public void deleteFront()
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
		if(front==max-1)
		{
			front=0;
		}
		else
		{
			front++;

		}
		
		
	}

	public void deleteRear()
	{
		if(front==-1)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("the dequeued element is "+arr[rear]);
		if(front==rear)
		{
			front=-1;
			rear=-1;
			return;
		}
		if(rear==0)
		{
			rear=max-1;
		}
		else
		{
			rear--;

		}
		
		
	}


	public void peekf()
	{
		if(front==-1)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("the element at the front is "+arr[front]);
	}

	public void peekr()
	{
		if(front==-1)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("the element at the rear is "+arr[rear]);
	}


	public void disp()
	{
		if(front==-1)
		{
			System.out.println("Queue Underflow!");
			return;

		}
		int i=front;
		if(front<=rear)
		{
			while(i<=rear)
			{
				System.out.println(arr[i]);
				i++;

			}
		}
		else
		{
			while(i<=max-1)
			{
				System.out.println(arr[i]);
				i++;
			}
			i=0;
			while(i<=rear)
			{
				System.out.println(arr[i]);
				i++;

			}

		}
		


	}




}

class MyDQRTest
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size of the deque:");
		int size=sc.nextInt();



		MyDQR dq =new MyDQR(size);




		outerLoop:
		while(true) {
			System.out.println("\n======= MAIN MENU =======");
			System.out.println("enter your choice\n1.for Deque Input Restricted Menu\n2.for Deque Output Restricted Menu\n3.to Exit");
			int ch1=sc.nextInt();
			System.out.println("");

			switch(ch1){
			case 1:
				innerLoop1:
				while(true){
					System.out.println("\n--- Input-Restricted Deque ---");
					System.out.println("enter your choice\n1.for insertRear\n2.for deleteFront\n3.for deleteRear\n4.for peekf\n5.for peekr\n6.for disp\n7.to return to main menu");
					int ch=sc.nextInt();2
					System.out.println("");


					switch(ch) {
					case 1:
						System.out.print("enter the element you want to insert at the rear:");
						

						dq.insertRear(sc.nextInt());
						break;			

					case 2:
						dq.deleteFront();
						break;

					case 3:
						dq.deleteRear();
						break;

					case 4:
						dq.peekf();
						break;

					case 5:
						dq.peekr();
						break;

					case 6:
						dq.disp();
						break;

					case 7:
						System.out.println("Returning to main menu...");
						break innerLoop1;
						

					default:
						System.out.println("invalid entry!");



					}
				}
				break;				

			case 2:
				innerLoop2:
				while(true){
					System.out.println("\n--- Output-Restricted Deque ---");
					System.out.println("enter your choice\n1.for insertRear\n2.for insertFront\n3.for deleteFront\n4.for peekf\n5.for peekr\n6.for disp\n7.to return to main menu");
					int ch=sc.nextInt();
					System.out.println("");


					switch(ch) {
					case 1:
						System.out.print("enter the element you want to insert at the rear:");

						dq.insertRear(sc.nextInt());
						break;	

					case 2:
						System.out.print("enter the element you want to insert at the front:");

						dq.insertFront(sc.nextInt());
						break;				

					case 3:
						dq.deleteFront();
						break;

					case 4:
						dq.peekf();
						break;

					case 5:
						dq.peekr();
						break;

					case 6:
						dq.disp();
						break;

					case 7:
						System.out.println("Returning to main menu...");
						break innerLoop2;
						

					default:
						System.out.println("invalid entry!");



					}
				}
				break;

			case 3:
				System.out.println("Exiting Program...");
				sc.close();
				break outerLoop;

			default:
				System.out.println("invalid option! Try Again.");
			}


		}

	}



}
