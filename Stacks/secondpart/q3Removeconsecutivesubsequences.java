package Stacks.secondpart;

import java.util.Stack;

public class q3Removeconsecutivesubsequences {

    public static int[] remove(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                // If current element is same as top of stack, pop it (remove the pair)
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        // Now convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5};
        int[] result = remove(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
// This code removes consecutive duplicate elements from an array using a stack.
// hfgfdsad
// fgdfg
//hgi
