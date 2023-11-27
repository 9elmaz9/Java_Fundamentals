package intecbrussel.Opdracht2;

import java.util.Scanner;

//Dit Java-programma is bedoeld om elektriciteitsrekeningen te berekenen door
// gebruikersinvoer te accepteren en resultaten weer te geven op basis van een bepaalde berekeningslogica.
// Hier is het belangrijkste doel van het programma:
public class Opdracht333 {
    public static void main(String[] args) {

        // step 1 sat hello and say what it doe
        System.out.println("Welkom bij de elektriciteitsrekeningcalculatorAPP");
        System.out.println("Dit programma berekent elektriciteitsrekeningen"); // doet

        Scanner myScanner = new Scanner(System.in);// create object
        String antword;  // is an announcement/ ogoloshennua: create object to answer the questuon,

        System.out.println(" Wilt u voor meerdere woningen berekeningen maken? ( Ja/Nee):");
        antword = myScanner.nextLine().toLowerCase();

        if (antword.equalsIgnoreCase("Ja") || antword.equalsIgnoreCase("Ja")) {
                System.out.print("Enter the number of houses to calculate: ");
                //int numberOfHouses = scanner.nextInt();
            System.out.println("Gegevens invoeren :");
//vvodim nivye parametri dlua pascheta
            System.out.println(" Naam van de verbruiker");
            int a =myScanner.nextInt();
            System.out.println(" Vermogen in watt per uur");
            int b = myScanner.nextInt();
            System.out.println(" Aantal uren per dag dat elektriciteit wordt gebruikt");
            int c = myScanner.nextInt();
            System.out.println(" Aantal dagen per maand waarop elektriciteit wordt gebruikt");
            int d = myScanner.nextInt();
            System.out.println("Eenheidsprijs voor elektriciteit");
            int e= myScanner.nextInt();
            //dii z parametrami
            int result = a + b;
            System.out.println(" REsult :" + result);


        } else if (antword.equals("Nee")) {


            System.out.println("vvedite parametri 1 haty ");

            System.out.println(" vvedite parametri ");
            int i = myScanner.nextInt();
            System.out.println(" vvedite parametri ");
            int f = myScanner.nextInt();
            System.out.println(" vvedite parametri ");
            int k = myScanner.nextInt();
            System.out.println(" vvedite parametri ");
            int d = myScanner.nextInt();
            //dii z parametrami
            int result2 = i + f;
            System.out.println(" REsult :" + result2);

        } else {
            System.out.println(" ne virno ; proverte svoi parametri ");


        }


    }
}

