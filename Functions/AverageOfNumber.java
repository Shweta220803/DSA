package Functions;

import java.util.Scanner;

/**
 * AverageOfNumber : Enter 3 numbers from the user & make a function to print their average.


 */
public class AverageOfNumber {

    public static float calculateAverage(float num1, float num2, float num3) {
        float avg = (num1 + num2 + num3) / 3;

        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();


        System.out.println("Average of three numbers : "+ calculateAverage(num1, num2, num3));
    }

    
}