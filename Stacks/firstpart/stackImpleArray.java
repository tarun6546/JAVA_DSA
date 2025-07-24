package Stacks.firstpart;
import java .util.*;
public class stackImpleArray {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = -1; // points to the top of the stack
        void push(int x){
            arr[idx] = x;
            idx++;

            
        }

    }
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        // System.out.println(st.size());


        

    }

    
}
