package be.intecbrussel.Les5.Oefening7;
//Oefening 1
//Schrijf een programma om de huidige tijd en datum te krijgen.
import java.time.Instant;
public class Oefening1 {
    public static void main(String[] args) {

        Instant dateAndTime = Instant.now();
        System.out.println(dateAndTime);



    }
}
