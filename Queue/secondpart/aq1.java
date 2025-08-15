//reverse the queue
import java.util.*;
public class aq1{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);

    }
}