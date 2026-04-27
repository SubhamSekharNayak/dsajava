import java.util.*;
class MenuDriven
{
    public static void main(String arg[])
    {
    	Scanner sc=new Scanner(System.in);
    	int no1,no2,ch;
    	System.out.println("enter two nos ");
    	no1=sc.nextInt();
    	no2=sc.nextInt();
    	System.out.println("enter your choice\n1.add\n2.sub\n3.mult");
    	ch=sc.nextInt();
    	if(ch==1)
    	{
    		System.out.println("sum="+(no1+no2));
    	}
    	else if(ch==2)
    	{
    		System.out.println("sub="+(no1-no2));
    	}
    	else if(ch==3)
    	{
    		System.out.println("mult="+no1*no2);
    	}
    	else
    	{
    		System.out.println("invalid choice");
    	}
    }
  }
