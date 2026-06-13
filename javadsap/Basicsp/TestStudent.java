// import java.util.*;
// public class Student
// {

// 	// String name;
// 	// int roll;
// 	// double mark;
// 	// public Student(String name, int roll, double mark)
// 	// {
// 	// 	this.name=name;
// 	// 	this.roll=roll;
// 	// 	this.mark=mark;
// 	// }


// 	public void getInput()
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter data of the student");
// 		System.out.println("Enter name: ");
// 		String name=sc.nextLine();
// 		System.out.println("Enter roll: ");
// 		int roll=sc.nextInt();





// 	}



// 	public void checkGrade()
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter marks secured: ");
// 	    double mark=sc.nextDouble();

// 		if(mark>=0 && mark<=600)
// 		{

// 			while(mark<=600)
// 			{






// 				if(mark>=550 && mark<=600)
// 				{
// 					System.out.println("O Grade");
// 					break;
// 				}else if(mark>=450 && mark<550)
// 				{
// 					System.out.println("A Grade");
// 					break;
// 				}else if(mark>=350 && mark<450)
// 				{
// 					System.out.println("B Grade");
// 					break;
// 				}else if(mark<350)
// 				{
// 					System.out.println("Fail");
// 					break;
// 				}}}else{
// 					System.out.println("invalid marks!!");

// 				}


// 			}
// 		}
// 		public class TestStudent
// 		{
// 			public static void main(String args[])
// 			{












// 		// Student s=new Student(name, roll, mark);
// 				Student s=new Student();

// 				s.getInput();
// 				s.checkGrade();


// 			}
// 		}


import java.util.*;
class Student
{
	private String name;
	private int roll;
	private double total;

	Student(String n, int r, double t)
	{
		name=n; // by default this.name=n;
		roll=r;
		total=t;

	}
	
	String checkGrade()
	{
		if(total < 0 || total > 600)
		{
			return "Invalid marks!!";
		}
		else if(total >= 550)
		{
			return "O Grade";
		}
		else if(total >= 450)
		{
			return "A Grade";
		}
		else if(total >= 350)
		{
			return "B Grade";
		}
		else
		{
			return "Fail";
		}
	}

	void dispDetails()
	{
		System.out.println("name: "+name);
		System.out.println("roll: "+roll);
		System.out.println("total marks: "+total);
		System.out.println("grade obtained: "+checkGrade());

	}
	
	
	
}





class TestStudent
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		System.out.print("Enter roll: ");
		int roll=sc.nextInt();
		double total = 0;

		System.out.println("Add marks of each subject");

		System.out.print("Science: ");
		total += sc.nextDouble();

		System.out.print("Math: ");
		total += sc.nextDouble();

		System.out.print("Social: ");
		total += sc.nextDouble();

		System.out.print("English: ");
		total += sc.nextDouble();

		System.out.print("Odia: ");
		total += sc.nextDouble();

		System.out.print("Music: ");
		total += sc.nextDouble();




		Student s=new Student(name, roll, total);
		
		s.checkGrade();
		s.dispDetails();

		
	}
}














