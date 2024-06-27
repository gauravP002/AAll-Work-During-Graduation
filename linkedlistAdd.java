
public class linkedlistAdd {

    public static class Node{
        int data ;
        Node next ;
          
        public Node(int data){
        this.data = data ;
        this.next =null;


    }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
        }

        newNode.next =head ;
        head = newNode;
    }

    public  void addLast (int data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
        }

        tail.next = newNode;
        tail = newNode;



    } 

    public void print(){
          Node temp = head ;
        while (temp != null ){

            System.out.println(temp.data +" ");
            temp = temp.next;

        }

        
        }
      
    

    

    public static void main(String[] args) {
        linkedlistAdd ll = new linkedlistAdd();
       
        // ll.addLast(34);
        // ll.addLast(35);
       // ll.addfirst(5);
        ll.addfirst(12);
         ll.addLast(34);
        ll.addLast(35);
        ll.print();
        
    }
    
}
