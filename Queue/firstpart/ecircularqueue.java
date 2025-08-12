// import java.util.*;
public class ecircularqueue {
    public static class Cqa{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr = new int[5];

        public void add(int val) throws Exception {
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                front= rear = 0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                arr[++rear] = val;  

            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else{
                int val=arr[front];
                if(front==arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
            
            
        }
        public int peek() throws Exception {
                if(size==0){
                    throw new Exception("Queue is empty");
                }
                return arr[front];
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front<=rear){
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0; i<=rear; i++){
                    System.out.print(arr[i] + " ");
                }
 

            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
    Cqa queue = new Cqa();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.display(); // Output: 10 20 30
        System.out.println(queue.peek()); // Output: 10
        System.out.println(queue.remove()); // Output: 10
        queue.display(); // Output: 20 30
        System.out.println(queue.isEmpty()); // Output: false
        queue.remove();
        queue.remove();
        System.out.println(queue.isEmpty()); // Output: true
        queue.add(90);
        queue.add(40);
        queue.add(50);
        queue.display(); // Output: 90 40 50
        queue.add(60);
        queue.display(); // Output: 90 40 50 60
        queue.add(10);
        queue.display(); // Output: 90 40 50 60 10
        // queue.add(20); // This will throw an exception since the queue is full
        for(int i=0;i<queue.arr.length;i++){
            System.out.print(queue.arr[i] + " ");
        }


        
    }

    
}
