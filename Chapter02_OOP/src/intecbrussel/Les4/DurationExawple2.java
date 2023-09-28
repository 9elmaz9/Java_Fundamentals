package be.intecbrussel.Les4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DurationExawple2 {
    public static void main(String[] args) { // eerste stap altijd

        //Period class

        // Hier kunnen we de dagen instellen
        Period tenDays = Period.ofDays(10);
        System.out.println(tenDays.getDays());

        // 2 datums creëren om de volgende bewerkingte doen
        LocalDate oldDate=LocalDate.of(1985, Month.NOVEMBER,23);
        LocalDate newDate=LocalDate.of(2022,Month.AUGUST,22)
;

        //check period between date
        Period period=Period.between(oldDate,newDate);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");



    }
}