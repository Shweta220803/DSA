package Recursion;

// print fibonnaci series till nth term
public class FibonnaciSeries {

    public static void printFibonnaci(int a, int b, int n){
        //base case
        if(n == 0){
            return ;
        }
         int c = a + b;
         System.out.print(c + " ");
         printFibonnaci(b, c, n-1);


    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        int n = 10;

        printFibonnaci(a, b, n-2);

    }
    
}
