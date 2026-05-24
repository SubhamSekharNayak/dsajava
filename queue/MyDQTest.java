import java.util.*;
class MyDQ
{
	int arr[], front, rear;
	final int max;

	public MyDQ(int size)
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

class MyDQTest
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size of the array:");
		int size=sc.nextInt();



		MyDQ dq =new MyDQ(size);



		while(true) {
			System.out.println("enter your choice\n1.for insertRear\n2.for insertFront\n3.for deleteFront\n4.for deleteRear\n5.for peekf\n6.for peekr\n7.for disp\n8.to exit");
			int ch=sc.nextInt();
			System.out.println("");


			switch(ch) {
			case 1:
				System.out.print("enter the element you want to insert at the rear:");
				int ele=sc.nextInt();

				dq.insertRear(ele);
				break;

			case 2:

				System.out.print("enter the element you want to insert at the front:");
				int ele1=sc.nextInt();

				dq.insertFront(ele1);
				break;

			case 3:
				dq.deleteFront();
				break;

			case 4:
				dq.deleteRear();
				break;

			case 5:
				dq.peekf();
				break;

			case 6:
				dq.peekr();
				break;

			case 7:
				dq.disp();
				break;

			case 8:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("invalid entry!");



			}
		}


		
	}
}








// import java.util.*;

// class MyDQ {
//     int arr[], front, rear;
//     final int max;

//     public MyDQ(int size) {
//         if (size <= 0) {
//             throw new IllegalArgumentException("Size must be greater than 0!");
//         }
//         max = size;
//         front = -1;
//         rear = -1;
//         arr = new int[size];
//     }

//     // ✅ Check if queue is empty
//     public boolean isEmpty() {
//         return front == -1;
//     }

//     // ✅ Check if queue is full
//     public boolean isFull() {
//         return (front == 0 && rear == max - 1) || (front == rear + 1);
//     }

//     // ✅ Returns current number of elements
//     public int size() {
//         if (isEmpty()) return 0;
//         if (front <= rear) return rear - front + 1;
//         return (max - front) + (rear + 1);
//     }

//     public void insertRear(int ele) {
//         if (isFull()) {
//             System.out.println("Queue Overflow! Cannot insert " + ele);
//             return;
//         }
//         if (front == -1) {
//             front = 0;
//         }
//         if (rear == max - 1) {
//             rear = 0;
//         } else {
//             rear++;
//         }
//         arr[rear] = ele;
//         System.out.println("Enqueued " + ele + " at rear. Size: " + size());
//     }

//     public void insertFront(int ele) {
//         if (isFull()) {
//             System.out.println("Queue Overflow! Cannot insert " + ele);
//             return;
//         }
//         if (front == -1) {
//             front = 0;
//             rear = 0;
//             arr[front] = ele;
//             System.out.println("Enqueued " + ele + " at front. Size: " + size());
//             return;
//         }
//         if (front == 0) {
//             front = max - 1;
//         } else {
//             front--;
//         }
//         arr[front] = ele;
//         System.out.println("Enqueued " + ele + " at front. Size: " + size());
//     }

//     public void deleteFront() {
//         if (isEmpty()) {
//             System.out.println("Queue Underflow! Nothing to delete.");
//             return;
//         }
//         System.out.println("Dequeued " + arr[front] + " from front. Size: " + (size() - 1));
//         if (front == rear) {
//             front = -1;
//             rear = -1;
//             return;
//         }
//         if (front == max - 1) {
//             front = 0;
//         } else {
//             front++;
//         }
//     }

//     public void deleteRear() {
//         if (isEmpty()) {
//             System.out.println("Queue Underflow! Nothing to delete.");
//             return;
//         }
//         System.out.println("Dequeued " + arr[rear] + " from rear. Size: " + (size() - 1));
//         if (front == rear) {
//             front = -1;
//             rear = -1;
//             return;
//         }
//         if (rear == 0) {
//             rear = max - 1;
//         } else {
//             rear--;
//         }
//     }

//     public void peekf() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty!");   // ✅ Fixed message
//             return;
//         }
//         System.out.println("Front element: " + arr[front]);
//     }

//     public void peekr() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty!");   // ✅ Fixed message
//             return;
//         }
//         System.out.println("Rear element: " + arr[rear]);
//     }

//     public void disp() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty!");   // ✅ Fixed message
//             return;
//         }
//         System.out.print("Queue (front -> rear): ");
//         int i = front;
//         if (front <= rear) {
//             while (i <= rear) {
//                 System.out.print(arr[i] + (i == rear ? "" : " -> "));
//                 i++;
//             }
//         } else {
//             while (i <= max - 1) {
//                 System.out.print(arr[i] + " -> ");
//                 i++;
//             }
//             i = 0;
//             while (i <= rear) {
//                 System.out.print(arr[i] + (i == rear ? "" : " -> "));
//                 i++;
//             }
//         }
//         System.out.println();
//         System.out.println("Size: " + size() + "/" + max);
//     }
// }

// class MyDQTest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = 0;

//         // ✅ Validate size input
//         while (true) {
//             System.out.print("Enter the size of the deque (must be > 0): ");
//             try {
//                 size = sc.nextInt();
//                 if (size <= 0) {
//                     System.out.println("Size must be greater than 0. Try again.");
//                 } else {
//                     break;
//                 }
//             } catch (InputMismatchException e) {
//                 System.out.println("Invalid input! Please enter a number.");
//                 sc.next();
//             }
//         }

//         MyDQ dq = new MyDQ(size);

//         while (true) {
//             System.out.println("\n--- Deque Menu ---");
//             System.out.println("1. Insert at Rear");
//             System.out.println("2. Insert at Front");
//             System.out.println("3. Delete from Front");
//             System.out.println("4. Delete from Rear");
//             System.out.println("5. Peek Front");
//             System.out.println("6. Peek Rear");
//             System.out.println("7. Display");
//             System.out.println("8. Exit");
//             System.out.print("Your choice: ");

//             int ch;
//             try {
//                 ch = sc.nextInt();
//             } catch (InputMismatchException e) {
//                 // ✅ Handle non-integer menu input
//                 System.out.println("Invalid input! Please enter a number between 1-8.");
//                 sc.next();
//                 continue;
//             }

//             switch (ch) {
//                 case 1:
//                     System.out.print("Enter element to insert at rear: ");
//                     try {
//                         dq.insertRear(sc.nextInt());
//                     } catch (InputMismatchException e) {
//                         System.out.println("Invalid input! Please enter an integer.");
//                         sc.next();
//                     }
//                     break;
//                 case 2:
//                     System.out.print("Enter element to insert at front: ");
//                     try {
//                         dq.insertFront(sc.nextInt());
//                     } catch (InputMismatchException e) {
//                         System.out.println("Invalid input! Please enter an integer.");
//                         sc.next();
//                     }
//                     break;
//                 case 3:
//                     dq.deleteFront();
//                     break;
//                 case 4:
//                     dq.deleteRear();
//                     break;
//                 case 5:
//                     dq.peekf();
//                     break;
//                 case 6:
//                     dq.peekr();
//                     break;
//                 case 7:
//                     dq.disp();
//                     break;
//                 case 8:
//                     System.out.println("Exiting...");
//                     sc.close();
//                     return;
//                 default:
//                     System.out.println("Invalid choice! Please enter a number between 1-8.");
//             }
//         }
//     }
// }