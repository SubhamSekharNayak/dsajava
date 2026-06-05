import java.util.Scanner;

class Stack {
    int max = 100;
    char[] arr;
    int top;

    Stack() {
        arr = new char[max];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }

    void push(char ele) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = ele;
    }

    char pop() {
        if (isEmpty()) {
            return '\0';
        }
        return arr[top--];
    }

    char peek() {
        if (isEmpty()) return '\0';
        return arr[top];
    }
}

class ParenthesesChecker {

    boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    boolean isBalanced(String exp) {
        Stack s = new Stack();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (s.isEmpty()) {
                    return false; // Closing with no opening
                }
                char top = s.pop();
                if (!isMatching(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }
        return s.isEmpty(); // Stack empty = balanced
    }
}

public class ParenthesesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParenthesesChecker ob = new ParenthesesChecker();

        System.out.print("Enter expression with parentheses: ");
        String exp = sc.nextLine();

        if (ob.isBalanced(exp)) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are NOT balanced");
        }

        sc.close();
    }
}