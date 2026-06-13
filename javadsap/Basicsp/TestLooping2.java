import java.util.*;
class TestLooping2
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your numbers: ");
	int no1 = sc.nextInt();
	int no2 = sc.nextInt();
	int result=0;

	

	while(no1>0)
	{
	result=result+no2;
	no1--;
	}
	System.out.println("the multiplied number is: "+result);
	

	


	}
}