package Stacks;

import java.util.ArrayList;

// Implement stack using ArrayList
public class TestStack2 {
   static class Stack{
       static  ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
           return  list.size() == 0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek 
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);

        }
    }
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }


        

    
    }
}
