package intecbrussel.Opdracht2;

import java.util.Scanner;

//CalculatorProgram
public class Opdracht1 {
    public static void main(String[] args) {
        //Welcome to age calculator program
        //Write the age
        System.out.println("Welcome to age calculator program");
        System.out.println("Write the age");
        // 2-Vervolgens wordt de gebruiker gevraagd om hun leeftijd in te voeren.
        Scanner myScanner = new Scanner(System.in);
        int age = myScanner.nextInt(); //3-De ingevoerde leeftijd wordt gelezen en opgeslagen in de variabele age.
        //4-Het programma evalueert de ingevoerde leeftijd met behulp van opeenvolgende if,
        //        else if en else statements:

        if (age >= 18) { //a-Als de leeftijd >=18, wordt het volgende bericht afgedrukt:You are an adult
            System.out.println("You are an adult");

        } else if (age >= 10 && age < 18) {//b-Als de leeftijd >=10 maar <18, wordt het volgende bericht afgedrukt:You are a teenager
            System.out.println("You are a teenager");
        } else if (age >= 2 && age < 10) {///c-Als de leeftijd >=2 maar <10, wordt het volgende bericht afgedrukt: You are a child
            System.out.println("You are a child");
        } else if (age < 2) { //d-Als de leeftijd <10, wordt het volgende bericht afgedrukt:You are a baby
            System.out.println("You are a baby");
        }
        // Completion :
        System.out.println("Thank you for using this program");

        /*Met deze code kun je de leeftijd van een persoon invoeren en krijg je een bericht dat
        de leeftijdscategorie van die persoon weergeeft, variërend van "baby" tot "volwassene",
        afhankelijk van de ingevoerde leeftijd.*/
    }
}

