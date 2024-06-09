package Functions;
// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class EligibleForVote {
    public static void eligiblePerson(int age){
        if(age > 18){
            System.out.println("Person Eligible for vote");
        }
        else{
            System.out.println("Person not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter person age : ");
        int age = sc.nextInt();

        eligiblePerson(age);
        
    }
    
}
