import java.util.Scanner;

class Stack {
    int max = 100;
    int[] arr;
    int top;

    Stack() {
        arr = new int[max];
        top = -1;
    }

    void push(int ele) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = ele;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class FactorialStack {

    int factorial(int n) {
        Stack s = new Stack();

        // Push n, n-1, n-2,... 1 onto stack
        for (int i = n; i >= 1; i--) {
            s.push(i);
        }

        int result = 1;
        // Pop and multiply
        while (!s.isEmpty()) {
            result = result * s.pop();
        }
        return result;
    }
}

public class FactorialTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorialStack ob = new FactorialStack();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            System.out.println("Factorial of " + num + " is " + ob.factorial(num));
        }

        sc.close();
    }
}




