package Recursion;
// Print keypad combination
public class PrintKeypadCombination {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static void KeypadCombination(String str, int idx, String combination){

        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);

        String mapping = keypad[currChar -'0'];

        for(int i=0; i<mapping.length(); i++){
            KeypadCombination(str, idx+1, combination+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        // String str = "23";
        String str = "4";
        KeypadCombination(str, 0, "");
        
    }
    
}
