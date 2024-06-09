// Make a function multiply of two numbers and return product.

package Functions;

import java.util.Scanner;;
public class MultiplyOfNumber {

    public static int multiplyOfNumber(int x , int y){
        // int mul = x * y;
        // return mul;
        return (x * y) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // int mul1 = multiplyOfNumber(x, y);
        // System.out.println("Multiply of two numbers : "+mul1);

        System.out.println("Product of two numbers :" + multiplyOfNumber(x, y));

    }
    
}
