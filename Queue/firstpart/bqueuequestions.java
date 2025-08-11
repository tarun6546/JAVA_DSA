//print all thr e elements in the given queue only using add(), remove(), 
// poll(), element(), peek(), size(), isEmpty() methods and extra queue.
import java.util.*;

public class bqueuequestions {
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
        // Adding elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        //rear  5 4 3 2 1 front
        Queue<Integer> tempQueue = new ArrayDeque<>();
        while(q.size()>0){
            System.out.println(q.peek() + "  ");
        
            tempQueue.add(q.poll());
            
        }
        while(tempQueue.size()>0){
            q.add(tempQueue.poll());
        }
    }

    
}
