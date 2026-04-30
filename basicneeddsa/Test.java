// class A
// {
// 	static void show()
// 	{
// 		System.out.println("method show");
// 	}
// 	void look()
// 	{
// 		System.out.println("method look");
// 	}
// }
// class Test
// {
// 	public static void main(String args[])
// 	{
// 		A.show();
		

// 		A obj=new A();
// 		obj.look();
// 		obj.show();
// 	}
// }


class A
{
	int x=0, y=0;
	static int z=0;
}
class Test
{
	public static void main(){
		System.out.println(A.z);
		// System.out.println(A.x);// error
		A ob=new A();
		A obj=new A();
		ob.x=10;
		obj.x=20;
		ob.y=5;
		obj.y=5;
		System.out.println(ob.x +" "+ obj.y);
		System.out.println(ob.y +" "+ obj.x);
		ob.z=30;
		obj.z=88; 
		System.out.println(ob.z +" "+ obj.z +" "+ A.z);
	}
}