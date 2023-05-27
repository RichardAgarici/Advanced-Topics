package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    // FIFO
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();

//        queue.add("c");
//        queue.add("a");
//        queue.add("b"); // add(); is more useful in cases where we want the queue to throw an exception.
//        b-a-c
//        queue.offer("d"); //offer(); is a boolean return type if the queue is full (can be set)
//        d - b - a - c

//        var front = queue.peek(); //last item in a queue. first item processed.
        // this returns null if it's empty
//        var front = queue.element(); //same thing. but element
//         this returns an exception if the queue is empty
//        System.out.println(front);

//        var remove = queue.remove(); //removes the first item in the queue. last one to be processed.
        //throws an exception on empty queue.
//        var remove = queue.poll(); //same thing
        //returns null
//        System.out.println(remove);
//        System.out.println(queue);

    }
}
