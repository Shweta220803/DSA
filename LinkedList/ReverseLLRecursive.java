package LinkedList;

public class ReverseLLRecursive {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }

    }
    // add-first, last
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }

    // add - last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next =  newNode;

    }
    // print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        // currNode.next =  newNode;

    }

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

        // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println(" The List is empty");
            return;
            }
            if(head.next == null){
                head = null;
                return;

            }
            Node secondLast = head;
            Node lastNode = head.next;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondLast = secondLast.next;

            }
            secondLast.next = null;
        }
    

  //  reverse recursive 
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }
    public static void main(String[] args) {
        ReverseLLRecursive list =  new ReverseLLRecursive();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

        
    }
    
}
