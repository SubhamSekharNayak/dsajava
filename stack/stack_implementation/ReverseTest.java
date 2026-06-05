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

class ReverseNumber {
    int reverse(int n) {
        Stack s = new Stack();
        boolean isNegative = n < 0;
        n = Math.abs(n);

        // Push each digit onto the stack
        while (n > 0) {
            s.push(n % 10);   // Extract last digit and push
            n = n / 10;        // Remove last digit
        }

        int result = 0;
        int place = 1;

        // Pop digits and build the reversed number
        while (!s.isEmpty()) {
            result = result + s.pop() * place;
            place = place * 10;
        }

        return isNegative ? -result : result;
    }
}

public class ReverseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseNumber ob = new ReverseNumber();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Reversed number of " + num + " is " + ob.reverse(num));
        sc.close();
    }
}