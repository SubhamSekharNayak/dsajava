import java.util.*;

class ArrayDemo
{
	static int arr[];
	static int size;

	ArrayDemo(int size)
	{
		this.size=size;
		arr=new int[size];
	}

	static void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entered size of the array is "+size);
		System.out.println("enter the elements: ");



		int i;
		for(i=0;  i<size; i++)
		{
			arr[i]=sc.nextInt();
		}

	}
	static void dispf()
	{
		int i;
		System.out.println("elements in forward: ");
		for(i=0; i<size; i++)
		{
			System.out.println(arr[i]);

		}
	}
	static void biggestEle()
	{
		int big=arr[0];
		for(int i=1; i<arr.length;i++) //array.length=size
		{
			if(big<arr[i])
			{
				big=arr[i];
			}
		}
		System.out.println("the biggest ele in the array is: "+big);


	}



}
class ABiggestEle
{
	public static void main(String args[])
	{
		ArrayDemo obj = new ArrayDemo(5);
		ArrayDemo.input();
		ArrayDemo.dispf();
		ArrayDemo.biggestEle();
	
		
	}
}