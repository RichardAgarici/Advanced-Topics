package collections;

import java.util.*;

public class SetDemo {
    public static void show() {
//        Set<String> set = new HashSet<>(); // this is used 90% of the times.
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        System.out.println(set);
//        // Set is not guarantee the order. Only if it's unique.

//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection,"a","b","c","c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(collection);
//        System.out.println(set);

//        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        // Arrays.asList() = returns a list which can be used as a parameter for the constructor

        //Union
//        set1.addAll(set2);
//        System.out.println(set1);

        //Intersection
//        set1.retainAll(set2); // returns the common elements from set1 + set2
        /*it's read like " take all the items from set1, compare them to set 2, and if there are any common elements,
        restructure set2 with only the common elements. "
         */
//        System.out.println(set1.retainAll(set2)); // also returns false if there is a mismatch.
//        System.out.println(set1);

        //Difference
//        set1.removeAll(set2);
        /*
        checks for common elements, if there is a common element, it deletes every common thing and leaves a new
        set with only a unique element.
         */
//        System.out.println(set1);
    }
}
