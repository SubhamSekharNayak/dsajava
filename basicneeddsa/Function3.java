import java.util.*;
class Function3
{
	static Scanner sc = new Scanner(System.in);
    static int no1, no2; // shared variables

    // common input method
    static void getInput() {
        System.out.println("Enter two numbers:");
        no1 = sc.nextInt();
        no2 = sc.nextInt();
    }

	static int add()
	{
	getInput();
	
	int r=no1+no2;
	return r;
    }

    static int sub()
	{
	getInput();
	
	int r=no1-no2;
	return r;
    }

    static int mul()
	{
	getInput();
	
	int r=no1*no2;
	return r;
    }


	public static void main(String arg[])
	{

    
		while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");

            int ch = sc.nextInt();
            int res;

            switch (ch) {
                case 1:
                    res=add();
                    System.out.println("sum="+res);
                    break;
                case 2:
                    res=sub();
                    System.out.println("sub="+res);
                    break;
                case 3:
                    res=mul();
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
