import java.util.*;
class Square
{
	private int a;
	public Square(int a)
	{
		this.a=a;

	}
	public void show()
	{
		System.out.println("edge = "+a);
		
	}
	void area()
	{
		int ar;
		ar=a*a;
		System.out.println("area = "+ar);
	}
	int perimeter()
	{
		return 4*a;
	}


}

class SquareTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of edge: ");
		int edge=sc.nextInt();
		Square s1=new Square(edge);
		s1.show();
		s1.area();
		System.out.println("perimeter = "+s1.perimeter());
	}
}