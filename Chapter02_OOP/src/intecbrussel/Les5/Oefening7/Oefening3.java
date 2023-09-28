package be.intecbrussel.Les5.Oefening7;

import java.time.LocalDate;
import java.time.Period;

/*Oefening 3
Schrijf een programma om je leeftijd te berekenen in
dagen, maanden en jaren*/

public class Oefening3 {
    public static void main(String[] args) {

        //Geboortedatum
        LocalDate bitrthdayDate = LocalDate.of(1995,9,9);
        //De huidige datum
        LocalDate currentDate=LocalDate.now();
        //Berekening van de leeftijd
        Period age =Period.between(bitrthdayDate ,currentDate);

        int years= age.getYears();
        int month= age.getMonths();
        int days= age.getDays();

        System.out.println("Leeftijd :"+years+"oud, Aantal maanden : "+month+"maanden, Aantal dagen :" +days+"dagen.");
    }

}
