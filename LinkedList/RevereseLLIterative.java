package LinkedList;

public class RevereseLLIterative {
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
    

    // reverse list
    public void reverseIterateList(){
        if(head == null || head.next == null){
            return;
        }
        
        Node preNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = preNode;

            // update
            preNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = preNode;

    }


    public static void main(String[] args) {
        RevereseLLIterative list =  new RevereseLLIterative();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        list.reverseIterateList();

        list.printList();
        
    }
}
