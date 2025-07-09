//removing nth node from the end of linkedlist
public class eq3 {
    public static Node deleteNthNode(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head = head.next; // if n is equal to the length of the list, delete the head
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return head; // delete the nth node from end
    }
    public static void displayList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a  = new Node(23);
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
        displayList(a);
        a=deleteNthNode(a, 6);
        displayList(a);
       
    }

    
}


    

