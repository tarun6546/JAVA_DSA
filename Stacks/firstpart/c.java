//insert at the bottom of the stack.



package Stacks.firstpart;

import java.util.*;
public class c {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack: " + st);
        int idx=2;
        int element = 5;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(element);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("Stack after inserting " + element + " at index " + idx + ": " + st);
        


        
    
    }

    
}
