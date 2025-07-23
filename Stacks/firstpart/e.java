// display stack normally and recursively

package Stacks.firstpart;

import java.util.*;

public class e {
    public static void displayReverseRecursively(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int x = st.pop();
        System.out.print(x + " ");
        displayReverseRecursively(st);

        st.push(x); // Push back to maintain original stack
    }

    public static void displayRecursively(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int x = st.pop();

        displayReverseRecursively(st);
        System.out.print(x + " ");

        st.push(x); // Push back to maintain original stack
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);
        displayRecursively(st);
        System.out.println();
        displayReverseRecursively(st);
        System.out.println(); 

        // Reverse display using recursion

    }

}
