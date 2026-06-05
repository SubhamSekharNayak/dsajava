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
	static void maxCount()
	{
		
		int maxcount=0, ele=0;
	
		
		for(int i=0; i<size; i++)
		{
			int count=1;
			
			if(arr[i]==-1)
			{
				continue;
			}
			for(int j=i+1; j<size; j++)
			{
				  if(arr[j]==-1)
				  {
				  	continue;
				  }
                   if(arr[i]==arr[j])
                   {
                   	     arr[j]=-1;
                   	     count++;

                   }
                  
			}
			 if(count>maxcount)
                   {
                   	maxcount=count;
                   	ele=arr[i];
                   }

				
		}
		System.out.println(ele+" is present "+maxcount+" times");

	}

	

}
class AMaxCountEle
{
	public static void main(String args[])
	{
		ArrayDemo obj = new ArrayDemo(5);
		ArrayDemo.input();
		ArrayDemo.dispf();
		ArrayDemo.maxCount();

		
	}
}