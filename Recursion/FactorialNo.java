package Recursion;

// print factorial of a number n.
public class FactorialNo {

    public static int  printFactorial(int n){
        if (n == 1 || n == 0) {
            return 1;
            
        }
        int factorial = n*printFactorial(n- 1);
        return factorial;

    }



    public static void main(String[] args) {
        
        int n = 3;
        System.out.println(printFactorial(n));
    }
    
}
