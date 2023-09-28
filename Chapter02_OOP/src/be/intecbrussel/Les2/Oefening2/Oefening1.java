package be.intecbrussel.Les2.Oefening2;

import java.util.Scanner;

public class Oefening1 {

    /*Oefening 1
    Maak een applicatie die kan controleren of een bepaald woord
    een palindroom is.*/

    public static void main(String[] args) {

        Scanner myScanner  = new Scanner(System.in);

        System.out.println(" Schrijf woord");
        String name = myScanner.nextLine();


        StringBuilder woord = new StringBuilder(name);

        woord.reverse();

        if (name == (woord.toString())){
            System.out.println("Yes it is");
    }else{
            System.out.println("It's not ");
        }




    }

}
