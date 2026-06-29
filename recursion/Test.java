//Recursion - A method calling itself is known as recursion .

// class Test
// {
// 	static int c=0;
// 	static void show()
// 	{
// 		System.out.println("Show start");
// 		++c;
// 		if(c<=3)
// 			show();
// 		System.out.println("Show end");
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println("A");
// 		show();
// 		System.out.println("B");
// 	}
// }
// o/p:-
// A 
// Show start 
// Show start 
// Show start 
// Show start 
// Show end
// Show end
// Show end
// Show end
// B








// class Test
// {
// 	static int c=0;
// 	static void show()
// 	{
// 		System.out.println("Show start"+c);
// 		++c;
// 		if(c<=3)
// 			show();
// 		System.out.println("Show end"+c);
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println("A");
// 		show();
// 		System.out.println("B");
// 	}
// }
// o/p:-
// A 
// Show start0
// Show start1 
// Show start2 
// Show start3
// Show end4
// Show end4
// Show end4
// Show end4
// B







// class Test
// {
// 	static int c=0;
// 	static void show()
// 	{
// 		System.out.println("Show start"+c);
// 		++c;
// 		if(c<=3)
// 			show();
// 		System.out.println("Show end"+c);
// 		c--;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println("A");
// 		show();
// 		System.out.println("B");
// 	}
// }
// o/p:-
// A 
// Show start0
// Show start1 
// Show start2 
// Show start3 
// Show end4
// Show end3
// Show end2
// Show end1
// B










// class Test
// {
// 	static int c=0;
// 	static void show()
// 	{
// 		++c;
// 		System.out.println(c);
// 		if(c<=9)
// 			show();
// 		System.out.println(c);
// 		--c;
// 	}
// 	public static void main(String args[])
// 	{
// 		show();
// 	}
// }
// o/p:-
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1







// class Test
// {
// 	static int c=0;
// 	static void show()
// 	{
// 		++c;
// 		if(c<=9)
// 			show();
// 		System.out.println(c);
// 		--c;
// 	}
// 	public static void main(String args[])
// 	{
// 		show();
// 	}
// }
// o/p:-
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1








// class Test
// {
// 	static void show(int c)
// 	{
// 		System.out.println(c);
// 		if(c<=9)
// 			show(c+1);
// 	}
// 	public static void main(String args[])
// 	{
// 		show(1);
// 	}
// }
// o/p:-
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10








// class Test
// {
// 	static void show(int c)
// 	{
// 		System.out.println(c);
// 		if(c>=2)
// 			show(c-1);
// 	}
// 	public static void main(String args[])
// 	{
// 		show(10);
// 	}
// }
// //or
// class Test
// {
// 	static void show(int c)
// 	{
// 		if(c<=9)
// 			show(c+1);
// 		System.out.println(c);
// 	}
// 	public static void main(String args[])
// 	{
// 		show(1);
// 	}
// }
// o/p:-
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1







//Factorial of a number
// class Test
// {
// 	static int factorial(int n)
// 	{
// 		int f=1;
// 		while(n>0)
// 		{
// 			f=f*n;
// 			n=n-1;
// 		}
// 		return f;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(factorial(3));
// 	}
// }
// //or
// class Test
// {
// 	static int f=1;
// 	static int factorial(int n)
// 	{
// 		if(n>0)
// 		{
// 			f=f*n;
// 			n=n-1;
// 			factorial(n);
// 		}
// 		return f;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(factorial(3));
// 	}
// }
// //or
// class Test
// {
// 	static int factorial(int n)
// 	{
// 		if(n==0)
// 			return 1;
// 		else 
// 			return n*factorial(n-1);
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(factorial(3))
// 	}
// }
// //or
// /*Iterative Version (Without Recursion)
// static int facttest(int no)
// {
//     int fact = 1;
//     for(int i=1;i<=no;i++)
//     {
//         fact = fact * i;
//     }
//     return fact;
// }*/





// //Addition of digits of a number
// class Test
// {
// 	static int addDigit(int n)
// 	{
// 		int sum=0;
// 		while(n!=0)
// 		{
// 			int digit=n%10;
// 			sum=sum+digit;
// 			n=n/10;
// 		}
// 		return sum;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(addDigit(36));
// 	}
// }
// //or
// class Test
// {
// 	static int sum=0;
// 	static int addDigit(int n)
// 	{
// 		if(n!=0)
// 		{
// 			int digit=n%10;
// 			sum=sum+digit;
// 			n=n/10;
// 			addDigit(n);
// 		}
// 		return sum;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(addDigit(36));
// 	}
// }
// //or
// class Test
// {
// 	static int addDigit(int n)
// 	{
// 		if(n==0)
// 			return 0;
// 		else 
// 			return n%10+addDigit(n/10);
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(addDigit(36));
// 	}
// }






// //Reverse Number
// class Test
// {
//     static int rev = 0;

//     static int reverse(int no)
//     {
//         if(no == 0)
//             return rev;
//         else
//         {
//             int r = no % 10;      // last digit
//             rev = rev * 10 + r;   // build reverse number
//             return reverse(no / 10);
//         }
//     }

//     public static void main(String args[])
//     {
//         int n = 1234;
//         System.out.println("Reverse = " + reverse(n));
//     }
// }
// //or
// class Test
// {
//     static int reverse(int no, int rev)
//     {
//         if(no == 0)
//             return rev;
//         else
//             return reverse(no/10, rev*10 + no%10);
//     }

//     public static void main(String args[])
//     {
//         int n = 1234;
//         System.out.println("Reverse = " + reverse(n,0));
//     }
// }
// o/p:-
// Reverse = 4321






// //pallindrome program (Without static)
// class Test
// {
//     static int reverse(int no, int rev)
//     {
//         if(no == 0)
//             return rev;
//         else
//             return reverse(no/10, rev*10 + no%10);
//     }

//     public static void main(String args[])
//     {
//         int n = 121;

//         int r = reverse(n, 0);

//         if(n == r)
//             System.out.println("Palindrome Number");
//         else
//             System.out.println("Not Palindrome");
//     }
// }
// o/p:-
// Palindrome Number






// //Perfect Number (Without static variable)
// class Test
// {
//     static int sumFactor(int no, int i)
//     {
//         if(i == 0)
//             return 0;

//         if(no % i == 0)
//             return i + sumFactor(no, i-1);
//         else
//             return sumFactor(no, i-1);
//     }

//     public static void main(String args[])
//     {
//         int n = 28;

//         int sum = sumFactor(n, n/2);

//         if(sum == n)
//             System.out.println("Perfect Number");
//         else
//             System.out.println("Not Perfect");
//     }
// }
// o/p:-
// Perfect Number






//Prime Number (Without static variable)
class Test
{
    static boolean isPrime(int no, int i)
    {
        if(i == 1)
            return true;

        if(no % i == 0)
            return false;

        return isPrime(no, i-1);
    }

    public static void main(String args[])
    {
        int n = 7;

        if(n <= 1)
            System.out.println("Not Prime");
        else if(isPrime(n, n/2))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
// o/p:-
// Prime Number