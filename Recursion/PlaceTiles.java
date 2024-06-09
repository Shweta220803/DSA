package Recursion;
// Place Tiles of size 1*m in a floor of size n*m.
public class PlaceTiles {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        // vertically
        int verticalPlace = placeTiles(n-m, m);

        // horizontally
        int horizontalPlace = placeTiles(n-1, m);
        return verticalPlace + horizontalPlace;
    }
   
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));

        

    }
    
}
