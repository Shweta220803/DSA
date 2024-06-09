package Queue;

public class TestQueue1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        } 

        public static boolean isEmpty(){
            return rear == -1;

        }
        public static boolean isFull() {
            return rear == size-1;
        }
 
        // enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Full queue");
                return;
            }
            
        }
        // dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i =0; i< rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
            
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
            
        }


        

    }
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
         q1.add(1);
         q1.add(2);
         q1.add(3);

         while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
         }


        
    }
    
}
