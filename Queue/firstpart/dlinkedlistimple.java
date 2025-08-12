
public class dlinkedlistimple {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail =temp;
                
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;

        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1; // or throw an exception
            }
            return head.val;

        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1; // or throw an exception
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
            
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println("Peek: " + q.peek());
        q.remove();
        q.display();
        System.out.println("Peek after remove: " + q.peek());
        q.remove();
        q.isEmpty();

    }
    
}
