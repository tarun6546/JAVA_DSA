import java.util.*;
public class fdequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        deque.addLast(20);
        deque.addLast(20);
        deque.addLast(40);
        deque.addLast(50);
        System.out.println("Deque after adding elements: " + deque);
        deque.addFirst(10);
        System.out.println("Deque after adding first element: " + deque);
        deque.removeLast();
        System.out.println("Deque after removing last element: " + deque);
        deque.removeFirst();
        System.out.println("Deque after removing first element: " + deque);

    }
    
}
