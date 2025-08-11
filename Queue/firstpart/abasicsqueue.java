import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class abasicsqueue{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        // Adding elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        q.peek();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}