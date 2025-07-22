//move the elements in reverse order in a stack
// This code demonstrates how to reverse the order of elements in a stack using another stack.

package Stacks.firstpart;
import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // int n;
        // System.out.println("Enter the number of elements to push onto the stack:");
        // n = sc.nextInt();
        // System.out.println("Enter the elements: ");
        // for(int i=1;i<=n;i++){
        //     int element = sc.nextInt();
        //     st.push(element);
        // }
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        System.out.println("Stack after pushing elements: " + st);
        //move elements in reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0) {

            rt.push(st.pop());
        }
        System.out.println("Stack after reversing: " + rt);

        //move elements back to original stack

        while(rt.size() > 0) {
            st.push(rt.pop());
        }
        System.out.println("Stack after moving elements back: " + st);
        sc.close();
    }
    
}
