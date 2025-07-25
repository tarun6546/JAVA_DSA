package Stacks.firstpart;
public class stackImpleArray {
    public static class Stack{
        private int[] arr = new int[50];
        private int idx = -1; // points to the top of the stack
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            idx++; 
            arr[idx] = x;
               
        }
        int peek(){
            if(idx==0){
                System.out.print("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.print("Stack is Empty");
                return -1;
            }
            int top=arr[idx-1];
            idx--;
            return top;
        }
        void display(){
            for(int i = 0; i <= idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx+1;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

    }
    public static void main(String[] args){
        Stack st = new Stack();
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
        // System.out.println(st.size());


        

    }

    
}
