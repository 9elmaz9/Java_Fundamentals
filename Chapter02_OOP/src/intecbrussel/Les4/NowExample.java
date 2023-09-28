package be.intecbrussel.Les4;

import java.time.Instant;

public class NowExample {

    public static void main(String[] args) {
        //now() methode
        /*Wanneer we de functie now() gebruiken van de Instant class, krijgen we de
        het huidige moment terug UTC. Omdat meestal onze "business logic", "data
        storage" en "data exchange" in UTC formaat is, is dit een handige class om
        te gaan gebruiken.*/
        Instant dateAndTime=Instant.now();
        System.out.println(dateAndTime);



       /*Een epoch is een specifieke tijd en datum waarvan een computer de
       systeem tijd berekend. Als je de epoch opvraagt net als hieronder dan zul
       je als antwoord dit krijgen: 1970-01-01T00:00:00Z*/
        Instant epochDate = Instant.EPOCH;
        System.out.println(epochDate);
    }
}

