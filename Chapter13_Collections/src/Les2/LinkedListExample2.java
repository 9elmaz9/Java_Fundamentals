package Les2;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");


        //We mogen een herhalend element toe
        cities.add("Leuven");

        //We voegen een element toe aan de index die we willen
        cities.add(3,"Genk");

        System.out.println("LinkedList" + cities);
        cities.forEach(city -> System.out.println(cities+" "));
    }

}
