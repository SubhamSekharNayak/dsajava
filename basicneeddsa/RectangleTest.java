import java.util.*;
class Rectangle
{
	private int L, B;
	public Rectangle(int L, int B)
	{
		this.L=L;
		this.B=B;

	}
	public void show()
	{
		System.out.println("length = "+L);
		System.out.println("breadth = "+B);
	}
	void area()
	{
		int ar;
		ar=L*B;
		System.out.println("area = "+ar);
	}
	int perimeter()
	{
		return 2*(L+B);
	}


}

class RectangleTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth: ");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Rectangle r1=new Rectangle(length, breadth);
		r1.show();
		r1.area();
		System.out.println("perimeter = "+r1.perimeter());
	}
}