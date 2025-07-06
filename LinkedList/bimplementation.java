public class bimplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head ==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                
            }
            tail = temp;

        }
        void insertAtHead(int data){
            Node temp = new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAtIndex(int idx,int data){
            Node t = new Node(data);
            Node  temp = head;
            for(int i=0;i<idx-1 && temp!=null;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        int getAnIndex(int idx){
            Node temp = head;
            for(int i=0;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }void deleteAt(int idx){
            Node temp = head;
            for(int i=0;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            
        }

        
        
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15); 
        ll.insertAtEnd(20);
        ll.display();
        System.out.println("\nSize of the linked list is: " + ll.size() + "\n"  );
        ll.insertAtHead(2);
        ll.insertAtHead(1);
        ll.display();
        System.out.println(" ");
        ll.insertAtIndex(3,99);
        ll.display();
        System.out.println(" ");
        // ll.getAnIndex(3);

    }
    
}
