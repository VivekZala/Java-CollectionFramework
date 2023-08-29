package JavaCollectionFramework;

import java.util.ArrayDeque;

public class arrayDeque {
    
    public static void main(String ...args) {

        // Double eneded queue.
        ArrayDeque<Integer> aq = new ArrayDeque<>();

        aq.offer(10); // This will be added at the end of the queue.[Queue]
        aq.offerFirst(99); // This will be added to the begining of the queue.[ArrayDeque]
        aq.offerLast(100); // This will be added to the end of the queue.[ArrayDeque]
        aq.offer(20);
        aq.offer(30);
        aq.offer(40);
        aq.offer(50);

        System.out.println(aq);

        System.out.println(aq.peek()); // [Queue]
        System.out.println(aq.peekFirst()); // [ArrayDeque]
        System.out.println(aq.peekLast()); // [ArrayDeque]
        System.out.println(aq);
        System.out.println();

        System.out.println(aq.poll()); // [Queue]
        System.out.println(aq.pollFirst()); // [ArrayDeque]
        System.out.println(aq.pollLast()); // [ArrayDeque]
        System.out.println(aq);
    }
}
