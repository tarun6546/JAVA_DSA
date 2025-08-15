//reverse first k elements of queue

import java.util.*;

public class bq2 {
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue == null || k <= 0 || k > queue.size()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push first K elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Step 2: Enqueue back stack elements into queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move remaining elements to the back
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        int k = 4;

        System.out.println("Original Queue: " + queue);
        reverseFirstK(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + queue);
    }
}
