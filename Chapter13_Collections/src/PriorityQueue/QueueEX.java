package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEX {

        public static void main(String[] args) {
            // Creating a LinkedList as a Queue - создание LinkedList  как очереди  Queue
            Queue<String> queue = new LinkedList<>();

            // Adding elements to the queue
            //  offer() is used to add elements to the end of the queue.
            queue.offer("Element1");
            queue.offer("Element2");
            queue.offer("Element3");

            // Polling elements from the queue  = опрос элементов по очереди

            //  poll() is used to retrieve and remove the head of the queue.
            String head = queue.poll();
            System.out.println("Head of the queue: " + head);

            // Remaining elements in the queue = оставшиеся элементы в очереди

            System.out.println("Remaining elements in the queue: " + queue);
        }
    }
//Keep in mind that if the queue is empty, poll() returns null.
// It's a way to safely retrieve elements from the queue without causing an exception when the queue is empty.


