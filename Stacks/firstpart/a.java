package Stacks.firstpart;

//basics of stacks in Java

import java.util.*;

public class a {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Stack: " + st);
        st.peek(); // Returns the top element without removing it
        System.out.println("Top element: " + st.peek());
        st.pop(); // Removes the top element
        System.out.println("Stack after pop: " + st);
        st.size(); // Returns the size of the stack
        System.out.println("Size of stack: " + st.size());
        st.push(7);
        st.push(8);
        System.out.println("Stack after pushing 7 and 8: " + st);
        st.isEmpty(); // Checks if the stack is empty
        System.out.println("Is stack empty? " + st.isEmpty());
        // st.isFull(); // Checks if the stack is full (not applicable for dynamic stacks)
        // System.out.println("Is stack full? (not applicable for dynamic stacks)");
        
    }

    
}
