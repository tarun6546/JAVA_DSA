package Stacks.firstpart;
import java.util.*;

public class llImple {
    public static class Node{ //user-defined data type
        int val;
        Node next;
        Node(int x){
            this.val = x;
            // this.next = null;
        }
    }
    public static class LLStack{ //user define data structure
        private Node head = null;
        private int size = 0; // to keep track of the number of elements in the stack
        void push(int x){
            Node temp = new Node(x);
            temp.next = head; // new node points to the current head
            head = temp; // head now points to the new node
            size++;
        }
        void displayrev(){
            Node temp= head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        void display(){
        

        }
        int size(){
            return size;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.val; // get the value of the top element
            head = head.next;
            return top; // return the value of the popped element
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val; // return the value of the top element
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;

            // returns true if the stack is empty
        }


    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);

        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(50);
        st.push(60);
        st.display();
        System.out.println(st.size());
    }
}