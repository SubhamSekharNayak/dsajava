// import java.util.Scanner;

// class MyStack {
//     int max = 100;
//     char[] L;
//     int top;

//     MyStack() {
//         L = new char[max];
//         top = -1;
//     }

//     void push(char ele) {
//         if (top == max - 1) {
//             System.out.println("Overflow!");
//             return;
//         }
//         top = top + 1;
//         L[top] = ele;
//     }

//     char pop() {
//         if (top == -1) {
//             System.out.println("Underflow!");
//             return '\0';
//         }
//         char ele = L[top];
//         top = top - 1;
//         return ele;
//     }

//     char peek() {
//         if (top == -1) return '\0';
//         return L[top];
//     }

//     boolean isEmpty() {
//         return top == -1;
//     }
// }

// class InfixToPostfix {

//     boolean operand(char ch) {
//         return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
//     }

//     boolean operator(char ch) {
//         return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
//     }

//     int precedence(char ch) {
//         if (ch == '^') return 3;
//         else if (ch == '*' || ch == '/') return 2;
//         else if (ch == '+' || ch == '-') return 1;
//         else return 0;
//     }

//     String intopost(String s, MyStack L) {
//         String p = "";
//         s = s + ')';
//         L.push('(');

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (operand(ch)) {
//                 p = p + ch;
//             }
//             else if (ch == '(') {
//                 L.push(ch);
//             }
//             else if (operator(ch)) {
//                 char x = L.pop();
//                 while (operator(x) && precedence(x) >= precedence(ch)) {
//                     p = p + x;
//                     x = L.pop();
//                 }
//                 L.push(x);
//                 L.push(ch);
//             }
//             else if (ch == ')') {
//                 char x = L.pop();
//                 while (x!= '(') {
//                     p = p + x;
//                     x = L.pop();
//                 }
//             }
//         }
//         return p;
//     }
// }

// public class InfixToPostfixTest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         MyStack s = new MyStack();
//         InfixToPostfix ob = new InfixToPostfix();

//         System.out.println("Enter an infix expression : ");
//         String i = sc.nextLine();
//         String p = ob.intopost(i, s);
//         System.out.println("Postfix expression = " + p);

//         sc.close();
//     }
// }








import java.util.Scanner;

class MyStack {
    int max = 100;
    char[] L;
    int top;

    MyStack() {
        L = new char[max];
        top = -1;
    }

    void push(char ele) {
        if (top == max - 1) {
            System.out.println("Overflow!");
            return;
        }
        top = top + 1;
        L[top] = ele;
    }

    char pop() {
        if (top == -1) {
            System.out.println("Underflow!");
            return '\0';
        }
        char ele = L[top];
        top = top - 1;
        return ele;
    }

    char peek() {
        if (top == -1) return '\0';
        return L[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class InfixToPostfix {
    boolean operand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    boolean operator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    int precedence(char ch) {
        if (ch == '^') return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return 0;
    }

    String intopost(String s, MyStack L) {
        String p = "";
        s = s + ')';
        L.push('(');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (operand(ch)) {
                p = p + ch;
            } else if (ch == '(') {
                L.push(ch);
            } else if (operator(ch)) {
                char x = L.pop();
                // FIX: '^' is right-associative — only pop if strictly greater precedence
                //      All others are left-associative — pop if greater OR equal precedence
                while (operator(x) && (ch == '^' ? precedence(x) > precedence(ch)
                                                  : precedence(x) >= precedence(ch))) {
                    p = p + x;
                    x = L.pop();
                }
                L.push(x);
                L.push(ch);
            } else if (ch == ')') {
                char x = L.pop();
                while (x != '(') {
                    p = p + x;
                    x = L.pop();
                }
            }
        }
        return p;
    }
}

public class InfixToPostfixTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack s = new MyStack();
        InfixToPostfix ob = new InfixToPostfix();
        System.out.println("Enter an infix expression : ");
        String i = sc.nextLine();
        String p = ob.intopost(i, s);
        System.out.println("Postfix expression = " + p);
        sc.close();
    }
}