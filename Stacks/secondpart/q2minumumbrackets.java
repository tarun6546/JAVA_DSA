// find minimum no of brackets that we need to remove to make hte given brackets sequence balanced
package Stacks.secondpart;
import java.util.*;

public class q2minumumbrackets {
    public static int minBracketsToRemove(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    count++; // unmatched closing bracket
                } else {
                    char top = stack.peek();
                    if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                        stack.pop(); // matched pair
                    } else {
                        count++; // unmatched closing bracket
                    }
                }
            }
        }

        // Remaining unmatched opening brackets
        count += stack.size();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of brackets:");
        String s = sc.nextLine();
        System.out.println("Minimum brackets to remove: " + minBracketsToRemove(s));
        sc.close();
    }

    
}
//fsdfsff