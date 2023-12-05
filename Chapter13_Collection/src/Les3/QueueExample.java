package Les3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice ");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        String frontElement = queue.peek();
        System.out.println("Front element: "+ frontElement);

        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated Queue: " + queue);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty ? -> " + isEmpty);

        int size = queue.size();
        System.out.println("Size of Queue: " + size);
    }
}
