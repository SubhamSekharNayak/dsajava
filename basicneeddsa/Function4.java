import java.util.*;
class Function3
{

	static int add(int no1, int no2)
	{


		int r=no1+no2;
		return r;
	}

	static int sub(int no1, int no2)
	{


		int r=no1-no2;
		return r;
	}

	static int mul(int no1, int no2)
	{


		int r=no1*no2;
		return r;
	}


	public static void main(String arg[])
	{
		


		while (true) {

			Scanner sc=new Scanner(System.in);
		    System.out.println("enter your numbers:");
		    int x=sc.nextInt();
		    int y=sc.nextInt();
			System.out.println("\nEnter your choice:");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Exit");

			

			int ch = sc.nextInt();
			int res;

			switch (ch) {
			case 1:
				res=add(x, y);
				System.out.println("sum="+res);
				break;
			case 2:
				res=sub(x, y);
				System.out.println("sub="+res);
				break;
			case 3:
				res=mul(x, y);
				System.out.println("mul="+res);
				break;
			case 4:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
		}



	}
}
