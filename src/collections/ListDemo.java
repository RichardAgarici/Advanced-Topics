package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>(); // It has ALL the Iterator + Collection interface methods.
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!"); // since this is overloaded, we can modify the indexes.

        /*
        The ArrayList is like a sponge, it expands of contracts, based on the data entered.
        Since we started a new array, it will start from index 0.
        Any further elements inserted will automatically expand the array, shrinking it to from margins.
        We can modify specific index, this will not make any effect on the data existing, only if we say so. (delete)
         */

//        System.out.println(list);
//        Collections.addAll(list, "a", "b", "c"); // same as collection example.
//        System.out.println(list.get(0));
//        System.out.println(list);
//        list.set(3, "2"); // this will DELETE the actual data from index 3, and replace it with the string value.

//        list.remove(0); //this will DELETE the actual INDEX, shrinking the values of the Array.
        // This is a List specific method.
//        list.remove("A"); // this will remove a certain object ONLY IF it's found ( boolean = true )
//        list.remove("a"); // idem. But in this case returns true, so the element "a" will be removed, again, shrinking.
//        System.out.println(list);

//        var index = list.indexOf("A"); // this will return the index number only if it's found.
//        var index = list.lastIndexOf("a"); // this will return the index of the LAST element found.
//        -1 means false.
//        System.out.println(list + " index of "+index);
//======================================================================================================================
//        var subList = list.subList(0, 2);
        /*
        this will not modify the first List, it will generate a new one.
        here 0 means that will start from index.
        2 means it will STOP at index 2, it's not going to be shown.
        so always think about this as being 2-1.
         */
//        System.out.println(subList);
//======================================================================================================================

    }
}
