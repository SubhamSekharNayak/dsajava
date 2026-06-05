import java.util.*;
class Init
{
	// static int arr[][];


	static void disp()
	{
		// arr=new int[2][3];
		// arr[0][0]=10;
		// arr[0][1]=20;
		// arr[0][2]=30;
		// arr[1][0]=40;
		// arr[1][1]=50;
		// arr[1][2]=60;
		// int i,j;
		// for(i=0;i<2;i++)
		// {
		// 	for(j=0;j<3;j++)
		// 	{
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }


		// int arr[][]={{10, 20, 30}, {40, 50, 60}};
		// int i, j;
		// for(i=0; i<2; i++)
		// {
		// 	for(j=0; j<3; j++)
		// 	{
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }


		// int arr[][]={{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		// int i, j;
		// for(i=0; i<arr.length; i++)
		// {
		// 	for(j=0; j<arr[i].length; j++)
		// 	{
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }



  // --------------JAGGED ARRAY--------------

		// int arr[][]={{10, 20, 30}, {40, 50}, {70}};
		// int i, j;
		// for(i=0; i<arr.length; i++)
		// {
		// 	for(j=0; j<arr[i].length; j++)
		// 	{
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }


		// int arr[]={10, 20, 30, 40};
		// for(int ele:arr)
		// {
		// 	System.out.println(ele);
		// }


	// 	int arr[][]={{10, 20, 30}, {40, 50}, {70}};
	// 	for(int i[]:arr)
	// 	{
	// 		for(int j:i)
	// 		{
	// 			System.out.print(j+"\t");
	// 		}
	// 		System.out.println();
	// 	}


	// }


		Scanner sc=new Scanner(System.in);
		int arr[][];
		arr=new int[2][3];
		System.out.println("enter 6 elements");
		int i,j;

		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements are");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();

		}
	}

	public static void main(String args[])
	{
		Init.disp();
	}

}
