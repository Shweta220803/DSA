package Recursion;

// print numbers from  1 to 5

public class PrintNumber1 {
    public static void printNumber(int n){

    //   1 st method :  if(n == 6){ // base case
    //         return;
    //     }

    // 2nd method:
    if(n > 5){
        return;
    }

        System.out.println(n); // print n
        printNumber(n+1);  // recursion call
    }
    public static void main(String[] args) {

        int n = 1;
        printNumber(n);
        
    }
    
}
