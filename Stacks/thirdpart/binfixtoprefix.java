//Evaluation of infix expression

import java.util.*;

public class binfixtoprefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Input Expression: " + infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);

            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);

            } else if (ch == ')') {
                while (op.peek() != '(') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String result = o + v1 + v2;
                    val.push(result);
                    op.pop();
                }
                op.pop(); // pop the '('
            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String result = o + v1 + v2;
                    val.push(result);

                    // push
                    op.push(ch);

                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String result = o + v1 + v2;
                        val.push(result);
                        // push
                        op.push(ch);
                    } else
                        op.push(ch);
                }
            }
        }
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String result = o + v1 + v2;
            val.push(result);
        }
        String prefixExpression = val.peek();
        System.out.println("Prefix Expression: " + prefixExpression);
        // The prefix expression is now stored in val.peek()

        // Output the result of the expression
        // For the input "9-(5+3)*4/6", it should print

    }
}