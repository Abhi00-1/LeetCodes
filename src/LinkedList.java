public class LinkedList {
    private Node head;

    public void insert(int val){
        Node node =new Node(val);
        if(head==null){
            head=node;
            head.next=null;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;

        }

    }
    public void remove(){
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
   private class Node{
       int data;
       Node next;

       public Node(int val){
           this.data=val;
       }
   }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.display();
        l.remove();
        l.display();
        l.remove();
        l.display();
    }
}
