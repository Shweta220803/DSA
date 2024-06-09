package Recursion;

// print sum of first n natural number.
// public class NaturalNo {

//     public static void printNumber(int n){

//         int sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {

//         int n = 5;
//         printNumber(n);
        
//     }
    
// }

// print sum of first n natural number.

class NaturalNo{

    public static void printNumber(int i, int n, int sum){

        if(i == n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printNumber(i+1, n, sum);

    }
    public static void main(String[] args) {
        printNumber(1, 5, 0);
        
    }
}
