package Stacks.firstpart;

import java.util.*;

public class StackOperations {

    // 1. Insert at bottom
    public static void insertAtBottom(Stack<Integer> st, int data) {
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        st.push(data); // insert at bottom
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    // 2. Delete from bottom
    public static void deleteFromBottom(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 1) {
            temp.push(st.pop());
        }
        if (!st.isEmpty()) {
            st.pop(); // remove bottom element
        }
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    // 3. Insert at any index (0 = bottom, size = top)
    public static void insertAtIndex(Stack<Integer> st, int index, int data) {
        if (index < 0 || index > st.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < st.size() - index; i++) {
            temp.push(st.pop());
        }

        st.push(data); // insert at index

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    // 4. Delete from any index (0 = bottom, size-1 = top)
    public static void deleteAtIndex(Stack<Integer> st, int index) {
        if (index < 0 || index >= st.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < st.size() - index - 1; i++) {
            temp.push(st.pop());
        }

        st.pop(); // delete at index

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);

        insertAtBottom(st, 100);
        System.out.println("After insertAtBottom(100): " + st);

        deleteFromBottom(st);
        System.out.println("After deleteFromBottom(): " + st);

        insertAtIndex(st, 2, 200); // 0 = bottom
        System.out.println("After insertAtIndex(2, 200): " + st);

        deleteAtIndex(st, 3);
        System.out.println("After deleteAtIndex(3): " + st);
    }
}

