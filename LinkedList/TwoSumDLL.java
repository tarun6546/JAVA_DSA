class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
    }
}

public class TwoSumDLL {

    // Function to check if a pair exists with given target sum
    static boolean isTwoSum(Node head, int target) {
        if (head == null) return false;

        Node left = head;
        Node right = head;

        // Move right to last node
        while (right.next != null)
            right = right.next;

        // Two pointer approach
        while (left != right && left.prev != right) {
            int sum = left.data + right.data;
            if (sum == target) {
                System.out.println("Pair found: " + left.data + " + " + right.data + " = " + target);
                return true;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return false;
    }

    // Manually create DLL
    public static void main(String[] args) {
        // DLL: 10 ⇄ 20 ⇄ 30 ⇄ 40 ⇄ 50
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        int target = 70;

        if (!isTwoSum(a, target))
            System.out.println("No such pair found for sum " + target);
    }
}
//,jnkzxcz