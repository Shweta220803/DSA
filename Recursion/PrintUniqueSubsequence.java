package Recursion;

import java.util.HashSet;

// Print all the unique subsequences of a given string.
public class PrintUniqueSubsequence {
    public static void printUniqueSubsequence(String str, int idx, String newString, HashSet<String> set){
        
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar =str.charAt(idx);

        // to be
        printUniqueSubsequence(str, idx+1, newString+currChar, set);
       
        // or not to be
        printUniqueSubsequence(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequence(str, 0, " ", set);
        
    }
    

    
}
