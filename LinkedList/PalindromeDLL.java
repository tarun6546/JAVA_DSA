//palindrome linked list


class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
    }
}

public class PalindromeDLL {

    // Function to check if DLL is palindrome
    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node start = head;
        Node end = head;

        // Move end to the last node
        while (end.next != null) {
            end = end.next;
        }

        // Compare from both ends
        while (start != end && start.prev != end) {
            if (start.data != end.data)
                return false;
            start = start.next;
            end = end.prev;
        }

        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(20);
        Node e = new Node(10);

        a.prev = null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next = null;

        Node head = a; // head points to the first node

        if (isPalindrome(head))
            System.out.println("The Doubly Linked List is a Palindrome");
        else
            System.out.println("The Doubly Linked List is NOT a Palindrome");
    }
}

