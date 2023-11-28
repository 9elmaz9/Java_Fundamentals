package Les2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList maken
        LinkedList<String> list= new LinkedList<>();

        //Object toevoegen aan linkedlist
        list.add("Jonathan");
        list.add("Deepika");
        list.add("Elmaz");
        list.add("Mausam");
        list.add("Abdulrazak");
        list.add("Rutger");

        //Lijst doorlopen via Iterator
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            //Jonathan
            //Deepika
            //Elmaz
            //Mausam
            //Abdulrazak
            //Rutger
        }

    }
}
