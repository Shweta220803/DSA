package Recursion;
// Move all 'X' to the end
public class MoveXToEnd {
    public static void moveAllXToEnd(String str, int idx, int count, String newString){
        if(idx == str.length()){ //base case
            for(int i=0; i<count; i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllXToEnd(str, idx+1, count, newString);
        }
        else{
            newString += currChar;  // newString = newString + currChar
            moveAllXToEnd(str, idx+1, count, newString);
        }

    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllXToEnd(str, 0, 0, "");
    }
    
}
