package Recursion;
public class TowerOfHanoi {
    public static void printTowerOfHanoi(int n, String source, String helper, String destination){

        if(n == 1){
            System.out.println("Transferred disk " + n + " "+ "from" + " " +source + " " + "to" +  " " + destination);
            return;

        }

        printTowerOfHanoi(n-1, source, destination, helper);
        System.out.println("Transferred disk " + n + " "+ "from" + " " +source + " " + "to" +  " " + destination);
        printTowerOfHanoi(n-1, helper,source, destination);
    }


    public static void main(String[] args) {
        int n = 3;
        printTowerOfHanoi(n, "S", "H", "D");

        
    }
    
}
