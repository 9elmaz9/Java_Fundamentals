package be.intecbrussel.Opdracht3;

import java.util.Scanner;

public class Oefening2DoWhileIf {

    public static void main(String[] args) { // step 1:point of entry

        //Scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        //variables
        int cadeautjes = 43; //  колличество подарков в наличии
        int FriendShipRank = 0; // начало отсчета
//say hello
        System.out.println("Welkome!");

        //loop to play  запуск игры и цепочек
        do {
            //show what have you now
            System.out.println("Je hebt" + cadeautjes + " cadeautjes");
            System.out.println("De FriendShip Rank is  " + FriendShipRank);

            //  would like to give a gift - ask
            System.out.println("Geef een cadeautje??(ja/nee)"); // create a  questios
            String userInput = myScanner.nextLine();

            // Check the input
            if (userInput.equalsIgnoreCase("ja")) {
                cadeautjes--; //less
                FriendShipRank++; // grow

                //every 5th friendship level + bonus
                if (FriendShipRank % 5 == 0) {
                    System.out.println("Voor dit cadeau krijgt u 2 punten.");
                    cadeautjes--; //  the number of gifts is taken away
                } else {
                    System.out.println("\"Bedankt voor het cadeautje! +1 punt.");
                }
            } else {
                System.out.println("Bedankt voor het spelen!");
                break; //stop
            }
            //stop when they have 20
        } while (FriendShipRank < 20 && cadeautjes > 0);

        // see the final result
        System.out.println("Einde van het spel. Je hebt een FriendShip Rank van" + FriendShipRank);
    }
}






