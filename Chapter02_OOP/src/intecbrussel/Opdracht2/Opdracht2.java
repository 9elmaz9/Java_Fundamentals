package intecbrussel.Opdracht2;
//HigherLowerApp

import java.util.Random;
import java.util.Scanner;

public class Opdracht2 {

    public static void main(String[] args) {
        //1-Welkomstbericht: Het programma begint met het afdrukken van een welkomstbericht:
        System.out.println("Welcome to Higher Lower App");

        // 2-Scanner en Random Generator: Het programma maakt een Scanner-object aan om gebruikersinvoer
        // te lezen en een Random-object om een willekeurig getal tussen 0 en 99 te genereren.
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 99:");

        int num = myScanner.nextInt();
        System.out.println(num);
        //// Dit willekeurige getal wordt opgeslagen in de variabele randomNumber.
        //creëren van een nieuw object Random Generator/
        Random random = new Random();
        int randomNumber = random.nextInt(99);

        //3-Spelloop: Het spel heeft een while-loop die doorgaat zolang doesNotMatch waar is.
        //Deze variabele wordt gebruikt om te controleren of de speler het juiste getal heeft geraden.
        //у грі є цикл while, який триває до тих пір, поки doesNotMatch не збігається.Поки doesNotMatch має значення true, гравець продовжує вгадувати.
        boolean doesNotMatch = true;

        if (randomNumber == num) {
            System.out.println("Right");
        }
        while (doesNotMatch) { // besconechnaya petlua  : Zolang doesNotMatch waar is, blijft de speler raden.
            System.out.println("Guess the number:");
            // Вгадай: у циклі while гравця просять вгадати число:
            int guessedNumber = myScanner.nextInt();//Guess the number:De ingevoerde gok wordt opgeslagen in de variabele guessedNumber.
            /*5-Vergelijking met het willekeurige getal: Het programma vergelijkt de ingevoerde gok
            (guessedNumber) met het willekeurige getal (randomNumber). */

            if (guessedNumber < randomNumber) { // a-Als de gok kleiner is dan het willekeurige getal, wordt "Higher" afgedrukt.
                System.out.println("Higher");

            } else if (guessedNumber > randomNumber) { //  b-Als de gok groter is dan het willekeurige getal, wordt "Lower" afgedrukt.
                System.out.println("Lower");

            } else { //c-Als de gok gelijk is aan het willekeurige getal, wordt "Congrats!" afgedrukt,
                System.out.println("Congratulations!");
                doesNotMatch = false; //en de waarde van doesNotMatch wordt ingesteld op false, wat de while-loop beëindigt omdat de speler
                // het juiste getal heeft geraden.
            }
        }
        //6-Einde van het spel:wordt het volgende bedankbericht afgedrukt:
        System.out.println("Thank you for choosing our app");
    }
}




