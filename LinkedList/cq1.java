public class cq1 {
    public static Node nthNode(Node head,int n){
       int size = 0;
       Node temp = head;
         while(temp != null){
              size++;
              temp = temp.next;
         }
         int m=size-n+1;
         temp = head;
         //nth node from start
         for(int i=1;i<m;i++){
            temp=temp.next;
         }
         return temp;
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
        Node temp=nthNode(a,3);
        System.out.println(temp.data);
    }

    
}
