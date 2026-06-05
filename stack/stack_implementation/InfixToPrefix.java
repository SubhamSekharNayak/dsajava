import java.util.Scanner;

class MyStack {
    int max = 100;
    char[] L = new char[max];
    int top = -1;

    void Push(char ele) {
        if (top == max - 1) {
            System.out.println("Overflow!");
            return;
        }
        top++;
        L[top] = ele;
    }

    char Pop() {
        if (top == -1) {
            System.out.println("Underflow!");
            return '\0';
        }
        char ele = L[top];
        top--;
        return ele;
    }
}

public class InfixToPrefix {

    static boolean operand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    static boolean operator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' ||
               ch == '/' || ch == '^';
    }

    static int precedence(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return 0;
    }

    static String rev(String s) {
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(')
                r = ')' + r;
            else if (ch == ')')
                r = '(' + r;
            else
                r = ch + r;
        }

        return r;
    }

    static String intopre(String s, MyStack st) {
        s = rev(s);

        String p = "";
        s = s + ")";

        st.Push('(');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (operand(ch)) {
                p = p + ch;
            }
            else if (ch == '(') {
                st.Push(ch);
            }
            else if (operator(ch)) {
                char x = st.Pop();

                while (operator(x) &&
                       precedence(x) > precedence(ch)) {
                    p = p + x;
                    x = st.Pop();
                }

                st.Push(x);
                st.Push(ch);
            }
            else if (ch == ')') {
                char x = st.Pop();

                while (x != '(') {
                    p = p + x;
                    x = st.Pop();
                }
            }
        }

        p = rev(p);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an infix expression : ");
        String infix = sc.nextLine();

        MyStack s = new MyStack();

        String prefix = intopre(infix, s);

        System.out.println("Prefix expression = " + prefix);

        sc.close();
    }
}