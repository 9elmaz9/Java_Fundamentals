package EEN.intec.Opdracht3ACHTOCTOBER;
//one of the options, but unfortunately it did not start correctly, can you please tell me why.
//when entering prohibited names, it does not ban

import java.util.Scanner;

public class OefeningIfElseERROR {

    public static void main(String[] args) {
        //create obj
        Scanner myScanner = new Scanner(System.in);
//say hello
        System.out.println("Welkom bij de World Of PeaceCraft-server!");
        //set the input quantity data
        int amount = 0; // number of attempts
        final int MAX_AMOUNT = 3; // max number of attempts

        while (amount < MAX_AMOUNT) {
            System.out.println("Typ je gebruikersnaam:"); //Enter your username
            String userName = myScanner.nextLine().toLowerCase(); //.to.LowerCase() applied to the username string
            // before the if test to make the comparison
            //create conditions
            if (userName.contains("Gorilla") || userName.contains("“gori") || userName.contains("Harambe")) {
                System.out.println("U heeft een serverregel overtreden. Je bent verbannen!"); //banned
                amount++;  // Увеличиваем число попыток на 1

            } else {
                System.out.println("Welkom," + userName + "!");
                break; // stop the loop if the user is not banned
            }
        }

        if (amount == MAX_AMOUNT) {
            System.out.println("Je hebt het maximale aantal pogingen bereikt.");

        }


    }
}
