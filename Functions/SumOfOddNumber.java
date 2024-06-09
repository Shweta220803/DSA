package Functions;

import java.util.Scanner;

// Write a function to print the sum of all odd numbers from 1 to n.

public class SumOfOddNumber {
    public static int  sumOfOddNumber( int num){

        int sum = 0;
        //loop
        for(int i =1; i <= num; i++ ){
            if( i % 2 != 0 ){
                 sum = sum + i;

            }
        }
        return sum;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Sum of odd number from 1 to " +num+" : " + sumOfOddNumber(num));
        
    }
    
}
