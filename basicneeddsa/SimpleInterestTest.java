import java.util.*;
class SimpleInterest
{
	private float p, r, t;
	public SimpleInterest(float p, float r, float t)
	{
		this.p=p;
		this.r=r;
		this.t=t;

	}
	public void show()
	{
		System.out.println("principal = "+p);
		System.out.println("rate = "+r);
		System.out.println("time = "+t);
		
	}
	void interest()
	{
		float in;
		in=(p*r*t)/100 ;
		System.out.println("interest = "+in);
	}
	


}

class SimpleInterestTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the parameters: ");
		float pr=sc.nextFloat();
		float rate=sc.nextFloat();
		float time=sc.nextFloat();

		SimpleInterest si=new SimpleInterest(pr, rate, time);
		si.show();
		si.interest();
		
	}
}