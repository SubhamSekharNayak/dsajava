// import java.util.*;
// class Function1
// {


//     static void add()
//     {
// 	Scanner sc=new Scanner(System.in);
//     System.out.println("enter your numbers:");
// 	int no1=sc.nextInt();
//     int no2=sc.nextInt();
//     int s=no1+no2;
//     System.out.println("sum="+s);
//     return ;
//     }
//     static void sub()
//     {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter your numbers:");
//     int no1=sc.nextInt();
//     int no2=sc.nextInt();
//     int su=no1-no2;
//     System.out.println("sub="+su);
//     return ;
//     }
//     static void mul()
//     {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter your numbers:");
//     int no1=sc.nextInt();
//     int no2=sc.nextInt();
//     int m=no1*no2;
//     System.out.println("mul="+m);
//     return ;
//     }


  
//     public static void main(String arg[])
//     {
//         Scanner sc=new Scanner(System.in);
//           while(true)
//           {
//               System.out.println("enter your choice\n1.add\n2.sub\n3.mult\n4.exit");
//            int ch=sc.nextInt();
//                 switch(ch)
//                 {
//                     case 1:add();break;
//                     case 2:sub();break;
//                     case 3:mul();break;
//                     case 4:System.exit(0);
//                     default:System.out.println("invalid choice");

            
//                 }
    
//             }
//         }
// }



import java.util.*;

class Function1 {

    static Scanner sc = new Scanner(System.in);
    static int no1, no2; // shared variables

    // common input method
    static void getInput() {
        System.out.println("Enter two numbers:");
        no1 = sc.nextInt();
        no2 = sc.nextInt();
    }

    static void add() {
        getInput();
        int sum = no1 + no2;
        System.out.println("Sum = " + sum);
    }

    static void sub() {
        getInput();
        int result = no1 - no2;
        System.out.println("Sub = " + result);
    }

    static void mul() {
        getInput();
        int result = no1 * no2;
        System.out.println("Mul = " + result);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}