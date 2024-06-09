package Recursion;

// Print x^n (stack height = logn)
public class StackHeight1 {
    public static int calPow(int x, int n){
        if(n == 0){ // base case 1
            return 1;
        }
        if(x == 0){ // base case 2
            return 0;
        }
         // if n is even
         if(n%2 == 0){
            return calPow(x, n/2) * calPow(x, n/2);
         }
        else{  // if n is odd
            return calPow(x, n/2) * calPow(x, n/2) * x;
        
        }
        
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        
        int result = calPow(x, n);
        System.out.println(result);
    }
    
}
