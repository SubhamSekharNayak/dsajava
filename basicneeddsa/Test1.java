// class A
// {
// 	public void loop(){
// 		System.out.println("print loop!");
// 	}
// }
// class B extends A
// {
// 	public void show(){
// 		System.out.println("print show!");
// 	}

	
// }

// class Test1
// {
// 	public static void main(String args[])
// 	{
// 		B ob=new B();
// 		ob.show();
// 		ob.loop();
		
// 	}
// }


class A
{
	public void loop(){
		System.out.println("print loop!");
	}
}
class B 
	{
		 A obj=new A();
		public void show(){
			System.out.println("print show!");
		}


}

class Test1
{
	public static void main(String args[])
	{
		B ob=new B();
		ob.show();
		ob.obj.loop();
	}
}