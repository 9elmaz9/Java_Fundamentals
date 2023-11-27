package be.intecbrussel.Les5;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//ChronoUnit class
public class ChronoUnitExample {
    public static void main(String[] args) {

        //Creeren van een datum
        LocalDateTime oldDate = LocalDateTime.of(1985, 11, 23, 12, 29, 55);
        LocalDateTime newDate = LocalDateTime.of(2022, 8, 22, 2, 15, 33);

        //calculate tijd tussen de 2 datums

        long years = ChronoUnit.YEARS.between(oldDate, newDate);
        long months = ChronoUnit.MONTHS.between(oldDate, newDate);
        long weeks = ChronoUnit.WEEKS.between(oldDate, newDate);
        long days = ChronoUnit.DAYS.between(oldDate, newDate);
        long hours = ChronoUnit.HOURS.between(oldDate, newDate);
        long minutes = ChronoUnit.MINUTES.between(oldDate, newDate);
        long seconds = ChronoUnit.SECONDS.between(oldDate, newDate);
        long milis = ChronoUnit.MILLIS.between(oldDate, newDate);
        long nano = ChronoUnit.NANOS.between(oldDate, newDate);

        System.out.println(years + "years");
        System.out.println(months + "months");
        System.out.println(weeks + "weeks");
        System.out.println(days + "days");
        System.out.println(hours + "hours");
        System.out.println(minutes + "minutes");
        System.out.println(seconds + "seconds");
        System.out.println(milis + "milis");
        System.out.println(nano + "nano");


    }

}
