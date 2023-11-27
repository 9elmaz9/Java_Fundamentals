package intecbrussel.Les2.Oefening1;

import java.util.Scanner;

public class Oefening4 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = myScanner.nextLine();


        System.out.println("Enter telefoonummer:");
        String telefoonnummer = myScanner.nextLine();


        System.out.println("Enter adres:");
        String adres = myScanner.nextLine();

        System.out.println("Name :"+name);
        System.out.println("Telefoonnummer:"+telefoonnummer);
        System.out.println("Adres:" +adres);


    }

}
