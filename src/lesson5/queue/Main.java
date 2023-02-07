package lesson5.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Fedor");
        queue.add("Mark");
        queue.add("Bob");
        queue.add("Helen");
        System.out.println(queue);
        queue.remove("Helen");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.element());
        queue.offer("Leroi");
        System.out.println(queue);
        Deque<String> deque = new ArrayDeque<>(queue);
        System.out.println(deque.getLast());
        deque.removeFirst();
        System.out.println(deque);
        String s = deque.pop();
        System.out.println(deque);
        System.out.println(s);
    }
}
