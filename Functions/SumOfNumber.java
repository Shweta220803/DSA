//  Make a function to add 2 numbers and return sum.

package Functions;

import java.util.Scanner;

public class SumOfNumber {
    public static int sumOfNumber(int num1 , int num2){
        // System.out.println(num1 + num2);
        int sum = num1 + num2;

        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum1 = sumOfNumber(num1, num2);
        System.out.println("Sum of two number is : " + sum1);

        
    }
    
}
