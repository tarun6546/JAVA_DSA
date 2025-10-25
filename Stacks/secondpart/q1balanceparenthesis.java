//balnced parentheses
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is 

package Stacks.secondpart;
import java.util.*;

public class q1balanceparenthesis {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
        sc.close();
    }
    
    
}
