import java.util.*;
class Function2
{
	static void add(int no1, int no2)
	{


		int result=no1+no2;
		System.out.println("sum="+result);

	}

	static void sub(int no1, int no2) {

		int result = no1-no2;
		System.out.println("Sub = " + result);

	}

	static void mul(int no1, int no2) {

		int result = no1*no2;
		System.out.println("Mul = " + result);
	}


	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();


		while (true) {
			System.out.println("\nEnter your choice:");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Exit");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				add(x, y);
				break;
			case 2:
				sub(x, y);
				break;
			case 3:
				mul(x, y);
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
