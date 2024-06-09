package Recursion;

// print x^n (stack height = n)
public class StackHeight {

    public static int calPower(int x, int n){

        if(n == 0){  // base case 1
            return 1;
        }

        if(x == 0){ // base ase 2 
            return 0;
        }

        int xPow1 = calPower(x, n-1);

        int xPown =  x * xPow1;
        return xPown;

    }
    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        int result = calPower(x, n);
        System.out.println(result);

    }
    
}
