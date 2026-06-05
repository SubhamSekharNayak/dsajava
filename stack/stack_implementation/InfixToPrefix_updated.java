import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Converts an infix expression to its prefix (Polish notation) equivalent.
 *
 * Supported operators : + - * / ^
 * Supports           : parentheses, multi-character operands (e.g. "ab+cd"),
 *                      spaces in the input, right-associative ^ operator.
 */
public class InfixToPrefix {

    // ------------------------------------------------------------------ //
    //  Helpers                                                             //
    // ------------------------------------------------------------------ //

    private static boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    private static boolean isOperator(char ch) {
        return "+-*/^".indexOf(ch) != -1;
    }

    /**
     * Returns the precedence of an operator.
     * Higher value = higher precedence.
     */
    private static int precedence(char op) {
        switch (op) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default:  return 0;
        }
    }

    /**
     * Reverses the expression, swapping '(' ↔ ')' so that
     * the infix-to-postfix algorithm can be reused for prefix conversion.
     */
    private static String reverse(String expr) {
        StringBuilder sb = new StringBuilder(expr.length());
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);
            if      (ch == '(') sb.append(')');
            else if (ch == ')') sb.append('(');
            else                sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * Validates that the expression has balanced parentheses and
     * contains only recognised symbols.
     *
     * @throws IllegalArgumentException on the first violation found.
     */
    private static void validate(String expr) {
        int depth = 0;
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == ' ') continue;
            if      (ch == '(') depth++;
            else if (ch == ')') {
                depth--;
                if (depth < 0)
                    throw new IllegalArgumentException(
                        "Unmatched ')' at position " + i);
            } else if (!isOperand(ch) && !isOperator(ch)) {
                throw new IllegalArgumentException(
                    "Unrecognised character '" + ch + "' at position " + i);
            }
        }
        if (depth != 0)
            throw new IllegalArgumentException(
                "Expression has " + depth + " unclosed '(' parenthesis/es.");
    }

    // ------------------------------------------------------------------ //
    //  Core conversion                                                     //
    // ------------------------------------------------------------------ //

    /**
     * Converts a valid infix expression to prefix notation.
     *
     * Algorithm:
     *  1. Reverse the infix string (also swap parentheses).
     *  2. Apply the standard infix-to-postfix algorithm, but treat
     *     ^ as right-associative (use >= instead of > for ^ comparisons).
     *  3. Reverse the resulting postfix string to obtain the prefix.
     *
     * @param infix  a well-formed infix expression (spaces are ignored)
     * @return       the equivalent prefix expression
     */
    public static String infixToPrefix(String infix) {
        if (infix == null || infix.isBlank())
            throw new IllegalArgumentException("Expression must not be empty.");

        // Strip spaces so the rest of the algorithm is space-agnostic.
        infix = infix.replaceAll("\\s+", "");
        validate(infix);

        String reversed = reverse(infix);

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result   = new StringBuilder(reversed.length());

        for (char ch : reversed.toCharArray()) {
            if (isOperand(ch)) {
                result.append(ch);

            } else if (ch == '(') {
                stack.push(ch);

            } else if (ch == ')') {
                // Pop until matching '('
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                if (!stack.isEmpty()) stack.pop();   // discard '('

            } else if (isOperator(ch)) {
                // For right-associative ^, use strict >
                // For left-associative operators, use >=
                while (!stack.isEmpty()
                        && isOperator(stack.peek())
                        && (ch == '^'
                            ? precedence(stack.peek()) >= precedence(ch)
                            : precedence(stack.peek()) > precedence(ch))) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Drain remaining operators
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top != '(') result.append(top);
        }

        // Reverse the postfix of the reversed expression → prefix
        return result.reverse().toString();
    }

    // ------------------------------------------------------------------ //
    //  Entry point                                                         //
    // ------------------------------------------------------------------ //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Infix to Prefix Converter ===");
        System.out.print("Enter an infix expression: ");
        String infix = sc.nextLine().trim();

        try {
            String prefix = infixToPrefix(infix);
            System.out.println("Infix  : " + infix);
            System.out.println("Prefix : " + prefix);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid expression: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
