public class pdoublyll {
    public static class Node{
        int data;
        Node next; //null
        Node prev; //null

        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();

    }
    public static void displayrandom(Node random){
        Node temp = random;
        // Move to the head
        while(temp.prev != null){
            temp = temp.prev;
        }
        // Print from head to tail
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
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
        display(a);
        System.out.println();
        displayrev(e);
        System.out.println("Head: " + a.data);
        System.out.println("Tail: " + e.data);

        displayrandom(c);
    }
}
