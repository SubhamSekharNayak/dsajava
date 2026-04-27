// import java.util.*;
// class Looping
// {
// 	public static void main(String arg[])
// 	{
// 	int i;
// 	i=1;
// 	System.out.println("A");
// 	while(i<5)
// 	{
// 	System.out.println("B");
// 	i++;
// 	if(i>=3)
// 	{
// 	break;
// 	}
// 	System.out.println("C");
// 	}
// 	System.out.println(i);
// 	System.out.println("D");

// 	}
// }

import java.util.*;
class Looping
{
	public static void main(String arg[])
	{
	int i;
	i=1;
	System.out.println("A");
	while(i<5)
	{
	System.out.println("B");
	i++;
	if(i>=3)
	{
	continue;
	}
	System.out.println("C");
	}
	System.out.println(i);
	System.out.println("D");

	}
}