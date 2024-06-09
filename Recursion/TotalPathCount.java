package Recursion;
// Counttotal path in a maze to move from(0,0) to (n,m)
public class TotalPathCount {
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){  // base case 1
            return 0;
        }
        if(i == n-1 && j == m-1){ // base case 2
            return 1;
        }
        // move downwords
        int downPaths = countPath(i+1, j, n, m);
        
        // move right
        int rightPaths = countPath(i, j+1, n, m);

        return rightPaths + downPaths;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPath(0, 0, n, m);
        System.out.println(totalPaths);
        
    }
    
}
