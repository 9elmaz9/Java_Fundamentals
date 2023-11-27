package be.intecbrussel.Les4;
//Deze klassen kun je gebruiken om datum en tijd te manipuleren en om te
//berekenen. Hieronder ga je een aantal voorbeelden zien hun je deze klassen kunt
//gebruiken

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



 //Duration class
public class DurationExample {

    public static void main(String[] args) {
        // 2 datums aangemaakt om te kunnen bewerken.
        LocalDateTime ltd = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime oldDate=LocalDateTime.of(2016, 8, 31, 10, 20, 55);

        String formattedDate = ltd.format(myFormatter);

        //// De methode getSeconds() gaat de seconde berekenen van 1 uur
        //(ofHours(1)
        Duration seconds = Duration.ofHours(1);
        System.out.println(seconds.getSeconds() + "seconds");

        //// Dit berekend de tijd in seconde tussen de nu en de oude datum die we
        //hebben gecreëerd.
        Duration duration = Duration.between(oldDate, ltd);
        System.out.println(duration.getSeconds() + "seconds");


    }
}
