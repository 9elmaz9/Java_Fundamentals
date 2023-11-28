package Les3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        //Een QueueExample
        Queue<String> queue= new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue:" + queue);  // Queue:[Alice, Bob, Charlie]


        //Het element aan de voorkant van de Queue opvragen zonder het te verwijderen
        String frontElement = queue.peek();
        System.out.println("Front element:"+ frontElement); //Front element:Alice



        //Het element aan de voorkanr van de Queue opvragen en verwideren
        String removedElement=queue.poll();
        System.out.println("Removed element:"+removedElement);
        System.out.println("Update Queue:"+queue); //Update Queue:[Bob, Charlie]



        //Controleren of de Queue leeg is
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty? "+ isEmpty); //Is Queue empty? false



        //De grootte van de Queue opvragen
        int size= queue.size();
        System.out.println("Size of Queue:"+size); // Size of Queue:2

    }
}
