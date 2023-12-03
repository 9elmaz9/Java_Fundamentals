package ArrayListOehening;

import java.util.ArrayList;
import java.util.Comparator;

public class Oefening2 {

    public static void main(String[] args) {

        ArrayList<Integer> listOfRandoms = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {

            listOfRandoms.add((int) Math.round(100 * Math.random()));

        }

        System.out.println("Unsorted:");

        listOfRandoms.forEach(num -> System.out.println(num));

        System.out.println("Sorted:");

        listOfRandoms.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.println(num));

    }

}
