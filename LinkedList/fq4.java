// Finding Intersection of two linked lists
// hint 1- find the length of both lists
// hint 2- find the difference of lengths
public class fq4 {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to delete the N-th node from the end
    public static Node deleteNthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;

        // Move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }

        // If fast is null, that means we need to delete the head
        if (fast == null) {
            head = head.next;
            return head;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete the node
        slow.next = slow.next.next;

        return head;
    }

    // Method to display the list
    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(45);
        Node c = new Node(67);
        Node d = new Node(89);
        Node e = new Node(12);
        Node f = new Node(34);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original List:");
        displayList(a);

        // Delete 6th node from end (head in this case)
        a = deleteNthNode(a, 6);

        System.out.println("After deleting 6th node from end:");
        displayList(a);
    }
}

