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
	static void sbiggestEle()
	{
		int big=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) //array.length=size
		{

			if(big<arr[i])
			{
				sbig=big;

				big=arr[i];
			}
			if(arr[i]<big && arr[i]>sbig)
			{
				sbig=arr[i];
			}
		}
		System.out.println("the second biggest ele in the array is: "+sbig);


	}



}
class ASecBiggestEle
{
	public static void main(String args[])
	{
		ArrayDemo obj = new ArrayDemo(5);
		ArrayDemo.input();
		ArrayDemo.dispf();
		ArrayDemo.sbiggestEle();
	
		
	}
}