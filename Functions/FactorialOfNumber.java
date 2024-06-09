package Functions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static int printFactorial(int n){

        if(n < 0){
            System.out.println("Invalid number");

            return 0;
            
        }

        int fact = 1;

        //loop
        for(int i = n; i >= 1; i--){

            fact = fact * i;

        }
        System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printFactorial(num);
    }
    
}
