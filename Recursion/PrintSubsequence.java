package Recursion;

// Print all the subsequences of a given string.
public class PrintSubsequence {
    public static void printStringSubsequence(String str, int idx, String newString){
        
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar =str.charAt(idx);

        // to be
        printStringSubsequence(str, idx+1, newString+currChar);
       
        // or not to be
        printStringSubsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        printStringSubsequence(str, 0, " ");
        
    }
    
}
