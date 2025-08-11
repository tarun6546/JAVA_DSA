// import java.util.*;

public class carryaimplementaion {
    public static class queueA{
        int[] arr= new int[100];
        int f=-1;
        int r=-1;
        int size=0;

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f = r = 0;
                arr[0]=val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            else{
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println("Removed: " + q.remove());
        q.display();
        System.out.println("Peek: " + q.peek());
        System.out.println("Size: " + q.size());
        System.out.println("Is Empty: " + q.isEmpty());
        q.display();

        
    }
    
}
