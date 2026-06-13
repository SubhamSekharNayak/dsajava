import java.util.*;
class TestLooping1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your number: ");
	int no = sc.nextInt();
	int reversed=0;

	while(no>0)
	{
	int digit=no%10;
	reversed=reversed*10+digit;
	no=no/10;
	}
	System.out.println("reversed number: "+reversed);
	

	


	}
}