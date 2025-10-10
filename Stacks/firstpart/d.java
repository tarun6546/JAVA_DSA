//display and reverse dispaly stack recursivelively and normaally 

package Stacks.firstpart;

import java.util.*;


public class d {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack: " + st);
        Stack<Integer> rt = new Stack<>();

        // Reverse display using another stack
        while (!st.isEmpty()) {
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x + " ");
            st.push(x); // Push back to original stack
        }
        System.out.println(" ");

        // int n = st.size();
        // int[] arr = new int[n];
        // for(int i=n-1;i>=0;i--){
        //     arr[i] = st.pop();

        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        //     st.push(arr[i]); // Push back to original stack
        //dhfgc }
    }    

    
}
