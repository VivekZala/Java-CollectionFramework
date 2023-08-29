package JavaCollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    
    public static void main(String ...args) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>();

        // Adding into priority queue.
        // Internally it will be implementing heap.
        // By default it will be min-heap.
        // Here highest prority is minimum number(By default).
        // While deleting minimum number will be delted.
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

        // To change from min-heap to max-heap.
        Queue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());

        p.offer(1);
        p.offer(2);
        p.offer(3);

        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
        System.out.println(p.peek());
    }
}
