import java.util.*;
class MyStack
{
	static int arr[];
	static int top;
	final int max;

	public MyStack(int size)
	{
		
		max=size;
		top=-1;
		arr=new int[size];
	}

	public void push(int ele)
	{
		if(top==max-1)
		{
			System.out.println("Stack Overflow!");
			return;

		}
		top++;
		arr[top]=ele;
		System.out.println("the pushed element is "+ele);
	}

	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow!");
			return;
		}
		System.out.println("the removed element is "+arr[top]);
		top=top-1;
	}

	public void peek()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow!");
			return;
		}
		System.out.println("the element at the top is "+arr[top]);
	}

	public void disp()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow!");
			return;

		}
		int i=top;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;

		}
	}




}

class MyStackTest
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size of the array:");
		int size=sc.nextInt();
		


		MyStack s =new MyStack(size);



		while(true) {
			System.out.println("enter your choice\n1.for push\n2.for pop\n3.for peek\n4.for disp\n5.to exit");
			int ch=sc.nextInt();


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