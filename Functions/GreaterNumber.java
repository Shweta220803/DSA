package Functions;

// Write a function which takes in 2 numbers and returns the greater of those two.


import java.util.Scanner;

public class GreaterNumber {

    public static void greatestNumber(int num1, int num2){

        if( num1 > num2){
            System.out.println("First number is greater");
        }
        else{
            System.out.println("Second number is greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        greatestNumber(num1, num2);

    }
    
}
