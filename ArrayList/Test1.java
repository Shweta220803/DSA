package ArrayList;

import java.util.ArrayList;
// import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        
        // add elements
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1); // output : [2,3,4]

        // get elements
        int elements = list1.get(1);
        System.out.println(elements); // output : 3

        // add elements in between
        list1.add(1,1); // here, first 1 show index number and 2 1 show element
        System.out.println(list1); // output: [2,1,3,4]

        // set element
        list1.set(0,5);
        System.out.println(list1); // output: [5, 1,3,4]

        // delete element
        list1.remove(3);
        System.out.println(list1); // output : [5, 1, 3]

        // size 
        int size = list1.size();
        System.out.println(size);   // output: 3

        // loop
        for(int i =0; i < list1.size(); i++){
            System.out.print(list1.get(i) +" "); //  5 1 3
        }


    }

    // sorting
    // Collection.sort(list1);
    
}
