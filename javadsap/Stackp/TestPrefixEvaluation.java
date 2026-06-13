// prefix evaluation
//----------------------
import java.util.Scanner;

class Stack {
    int top;
    int arr[];
    int cap;

    Stack() {
        top = -1;
        cap = 20;
        arr = new int[cap];
    }

    void push(int ele) {
        top++;
        arr[top] = ele;
    }

    int pop() {
        int item = arr[top];
        arr[top] = 0;
        top = top - 1;
        return item;
    }
}

class Pre_Evaluate {
    Stack st = new Stack();

    int preEval(String prefix) {
        int i;
        int item1, item2, r = 0;

        // Traverse the prefix expression from RIGHT to LEFT
        for (i = prefix.length() - 1; i >= 0; i--) {
            char ch;
            ch = prefix.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (isOperand(ch)) {
                if (ch >= '0' && ch <= '9') {
                    // For multi-digit numbers, scan leftward
                    int su = 0;
                    int multiplier = 1;
                    while (i >= 0 && isOperand(prefix.charAt(i))) {
                        ch = prefix.charAt(i);
                        if (ch >= '0' && ch <= '9') {
                            su = su + (ch - 48) * multiplier;
                            multiplier *= 10;
                        }
                        i--;
                    }
                    i++; // step back once since the loop will decrement again
                    st.push(su);
                } else {
                    // Variable operand: ask user for value
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the value of " + ch);
                    r = sc.nextInt();
                    st.push(r);
                }
            }

            if (isOperator(ch)) {
                item1 = st.pop(); // In prefix: first pop -> left operand
                item2 = st.pop(); // second pop -> right operand
                if (ch == '+') {
                    st.push(item1 + item2);
                } else if (ch == '-') {
                    st.push(item1 - item2);
                } else if (ch == '*') {
                    st.push(item1 * item2);
                } else if (ch == '/') {
                    st.push(item1 / item2);
                } else {
                    System.out.println("Invalid operator");
                    System.exit(0);
                }
            }
        }

        return st.pop();
    }

    boolean isOperand(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return true;
        } else
            return false;
    }

    boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        } else
            return false;
    }
}

class Test {
    public static void main(String[] args) {
        Pre_Evaluate ob = new Pre_Evaluate();
        Scanner br = new Scanner(System.in);
        System.out.println("Enter the prefix expression");
        String prefix = br.nextLine();
        System.out.println("Prefix evaluated result = " + ob.preEval(prefix));
    }
}