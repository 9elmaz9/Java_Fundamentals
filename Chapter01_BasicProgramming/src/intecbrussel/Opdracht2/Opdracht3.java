package intecbrussel.Opdracht2;

import java.util.Scanner;

public class Opdracht3 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);// create object

        System.out.println("Welkom bij het electriciteitsmeetprogramma"); //welcome and objectives of the programma
        System.out.println("Ik bereken uw electriciteitsrekening!");
        System.out.print("Wilt u voor meerdere woningen berekeningen maken? ( Ja/Nee):"); // start of selection ; for several houses
        String keuze = myScanner.nextLine(); //  create a selection

        if (keuze.equalsIgnoreCase("Ja") || keuze.equalsIgnoreCase("y")) { //4
            System.out.print("Vul het aantal huizen in : \n"); //5
            int numberofhouses = myScanner.nextInt(); // obj for conditions calculat
            myScanner.nextLine();// clean buffer//6

            for (int i = 1; i <= numberofhouses; i++) ; //8 creating conditions
            //calculateAndDisplayBill(numberofhouses, myScanner); //9
            factuurBerekenenEnWeergeven(numberofhouses,myScanner);


        } else if (keuze.equalsIgnoreCase("Nee") || keuze.equalsIgnoreCase("n")) {
            //calculateAndDisplayBill(1, myScanner); // single house counting function; body is down
            factuurBerekenenEnWeergeven(1,myScanner);

        } else {  // if something else
            System.out.println("De selectie is niet geldig.");

        }
        System.out.println("Bedankt voor het gebruik van de applicatie!"); // last expression
    }

    private static void
    //calculateAndDisplayBill(int houseNumber, Scanner myScanner) {
    factuurBerekenenEnWeergeven(int houseNumber, Scanner myScanner){
        System.out.println("\n House" + houseNumber);

        System.out.println("\n Naam van de verbruiker:"); // Name of the consumer - spozcivach
        String klantName = myScanner.nextLine();
        // System.out.println("klantName:"+klantName);

        System.out.print("Vermogen in watt per uur: ");// Power
        double kracht = myScanner.nextDouble();

        System.out.print("Aantal uren per dag dat electriciteit wordt gebruikt: "); //hours of use
        int uurPerDag = myScanner.nextInt();

        System.out.print("Aantal dagen per maand  dat electriciteit wordt gebruikt:"); // number of days in a month
        int dagPerMand = myScanner.nextInt();


        System.out.print("Prijs per eenheid elektriciteit:");  //prise per unit of electricity  - edinitca
        double eenheidPrice = myScanner.nextDouble(); // edinitca

        double totalConsumptie = kracht  * uurPerDag * dagPerMand / 1000;   // potreblenie = consumption
        double totalPrijs = totalConsumptie * eenheidPrice;


        System.out.println("Kosten van verbruikte electriciteit :" + totalConsumptie + " kW"); // total cost of electriciteit : electroenergie in kWt

        System.out.println("Kosten van electriciteit : " + totalPrijs + " eur"); //cost of electricity


    }
}


