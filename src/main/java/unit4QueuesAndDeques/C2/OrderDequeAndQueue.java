package unit4QueuesAndDeques.C2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class OrderDequeAndQueue {
    public static void main(String[] args) {
        List<Integer> lInt = List.of(1, 2, 3, 4, 5);
        Deque<Integer> dq = new ArrayDeque<>(lInt);
        Queue<Integer> q = new ArrayBlockingQueue<Integer>(16, false, lInt);
        System.out.println("Deque: " + dq);
        System.out.println("Queue: " + q);
        // For LIFO push-pop
        dq.push(6);
        System.out.println("Deque later dq.push(6): " + dq);
        // For FIFO add, offer
        dq.add(7);
        System.out.println("Deque later dq.add(7): " + dq);
        dq.offer(8);
        System.out.println("Deque later dq.offer(8): " + dq);
        // For get all pointer to head
        System.out.println("Deque later dq.element(): " + dq.element());
        System.out.println("Deque: " + dq);
        System.out.println("Deque later dq.peek(): " + dq.peek()); // Not removed, Not Throwing exception
        System.out.println("Deque: " + dq);
        System.out.println("Deque later dq.poll(): " + dq.poll()); // Not Throwing exception
        System.out.println("Deque: " + dq);
        // Pop and remove is the same
        System.out.println("Deque later dq.remove(): " + dq.remove()); // If removed, If Throwing exception
        System.out.println("Deque: " + dq);
        System.out.println("Deque later dq.pop(): " + dq.pop()); // If removed, If Throwing exception
        System.out.println("Deque: " + dq);

        /**
         * NOTE: In the Queue, the same function for all methods, which are the new methods in deque:
         * Check here: https://docs.oracle.com/javase/10/docs/api/java/util/Deque.html
         * In summary:
         *   - push()
         *   - pop()
         *   - ***First()
         *   - ***Last()
         */
    }
}
