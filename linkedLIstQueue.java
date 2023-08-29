package JavaCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class linkedLIstQueue {
    
    public static void main(String ...args) {

        Queue<Integer> queue = new LinkedList<>();

        // Add an element in queue.
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        // Removing an element from queue.
        System.out.println(queue.poll());
        System.out.println(queue);
        
        // Reading which element is at first or which element will be removed.
        System.out.println(queue.peek());
    }

}
