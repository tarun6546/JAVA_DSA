public class abasicsll {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // recursively
    public static void dispalyrecursion(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data + " ");
        dispalyrecursion(head.next);

    }

    public static void dispalyrecursionreverse(Node head) {
        if (head == null) {
            return;
        }
        dispalyrecursion(head.next);
        System.out.println(head.data + " ");

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            // this.next = null;
        }
    }
    public static int length(Node head) {
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;


    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null; // Last node points to null
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);

        // sasti displaying
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // System.out.println(a.next.next.next.next.next.data);

        // badiya implementation
        Node temp = a;
        // for(int i=0;i<=5;i++){
        // System.out.println(temp.data);
        // temp = temp.next;
        // }
        // while(temp != null){
        // System.out.println(temp.data);
        // temp = temp.next;
        // }
        // display(a);
        // dispalyrecursion(a);
        // dispalyrecursionreverse(a);
        System.out.println("Length of the linked list is: " + length(a));
        


    }
}