package EEN.intec.Opdracht3ACHTOCTOBER;

import java.util.Scanner;

public class Oefening1IfElse {

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Welkom bij de World Of PeaceCraft-server!");

        // number of attempts
        int attempts = 0;

        while (attempts < 3) { //max number of attempts
            System.out.print("Typ je gebruikersnaam: ");
            String username = myscanner.nextLine();

            // Проверка наличия "горилла" в имени пользователя
            if (username.contains("Gorilla") || username.contains("gori") || username.contains("Haramble")) {
                System.out.println("U heeft een serverregel overtreden. Je bent verbannen!");
                attempts++;
            } else {
                System.out.println("\"Welkom, " + username + "!");
                break; // go out
            }
        }
    }
}
