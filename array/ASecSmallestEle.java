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
	static void secsmallestEle()
	{
		int small=Integer.MAX_VALUE;
		int secsmall=Integer.MAX_VALUE;
		
		for(int i=0; i<size; i++) //array.length=size
		{

			if(small>arr[i])
			{
				secsmall=small;
				

				small=arr[i];
			}
			if(arr[i]>small && arr[i]<secsmall)
			{
				secsmall=arr[i];
			}
			
		}
		System.out.println("the sec smallest ele in the array is: "+secsmall);


	}



}
class ASecSmallestEle
{
	public static void main(String args[])
	{
		ArrayDemo obj = new ArrayDemo(5);
		ArrayDemo.input();
		ArrayDemo.dispf();
		ArrayDemo.secsmallestEle();
	
		
	}
}