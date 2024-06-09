package Recursion;
// Check if the array is sorted(strictly increasing)
public class PrintSortedArray {
    public static boolean isSorted(int arr[], int idx){

        if(idx == arr.length-1){ //base case
            return true;

        }
        if(arr[idx] < arr[idx+1]){
            // array is sorted till now
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // int arr[] = {1, 3, 5};  // true
        //int arr[] = {1, 3, 3}; // false
        int arr[] = {1, 3, 5 , 4};  // false



        System.out.println(isSorted(arr, 0));
        
    }
    
}
