package Functions;

import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.

public class CircumferenceOfCircle {
    public static double circumference(int radius){
        return  2 * 3.14 * radius ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of radius :");
        int radius = sc.nextInt();

        double result = circumference(radius);
        System.out.println("Circumference of circle  is = " +result);


        }
    
}
