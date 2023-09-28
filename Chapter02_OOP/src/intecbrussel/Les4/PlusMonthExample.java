package be.intecbrussel.Les4;

import java.time.LocalDateTime;
import java.time.Month;

//Met de klas LocalDateTime kunnen we niet alleen maar de datum en tijd opvragen maar
//ook: berekenen van tijd door erbij op te tellen of aftrekken, converteren van een andere
//Instance en natuurlijk je eigen specifieke tijd aanmaken
public class PlusMonthExample {
    public static void main(String[] args) {

        System.out.println("now:" + LocalDateTime.now());

        System.out.println("Apr 15,1994,11:30am:" + LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
        System.out.println("now(fromInstant):" + LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
        System.out.println("6 months from now: " + LocalDateTime.now().plusMonths(6));
        System.out.println("6 months ago: " + LocalDateTime.now().minusMonths(6));

    }


}
