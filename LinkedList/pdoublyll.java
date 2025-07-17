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

    //Insertion at head
    public static Node insertAtHead(Node head, int data) {
        Node t = new Node(data);
        t.next = head; // new node points to current head
        head.prev = t; // current head's previous points to new node
        head = t; // head now points to new node
        return head;

    }
    //Insertion at tail
    public static Node insertAtTail(Node head, int data){
        Node temp=head;
        //temp ko last tak leke jao
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(data);
        temp.next = t; // last node's next points to new node
        t.prev = temp; // new node's previous points to last node
        return head;
    }
    //Insert at any position in ddl
   public static void insertAtIdx(Node head, int idx, int data) {
    Node s = head;

    for (int i = 1; i < idx; i++) {
        if (s.next == null) break; // prevent null pointer
        s = s.next;
    }

    Node r = s.next;
    Node t = new Node(data);

    s.next = t;
    t.prev = s;

    t.next = r;
    if (r != null) r.prev = t;
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

        Node newHead = insertAtHead(a, 5);
        System.out.println("After inserting at head:");
        display(newHead);
        insertAtTail(a,90);
        display(newHead);
        insertAtIdx(newHead, 3, 25);
        System.out.println("After inserting at index 3:");
        display(newHead);
    }
}
