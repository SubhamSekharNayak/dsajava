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
	static void dispb()
	{
		int i;
		System.out.println("elements in backward: ");
		for(i=size-1; i>=0; i--)
		{
			System.out.println(arr[i]);

		}
	}


	static void searchReplace(int ele, int rep)
	{
		int c=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]==ele)
			{
			c++;

			arr[i]=rep;
			
		    }

		}
		System.out.println(ele+" is replaced by "+rep+" "+c+" times.");
		

	}
}
class ASearchReplace
{
	public static void main(String args[])
	{
		ArrayDemo obj = new ArrayDemo(5);
		ArrayDemo.input();
		ArrayDemo.dispf();
		ArrayDemo.searchReplace(4, 44);
		ArrayDemo.dispf();
		
	}
}