package be.intecbrussel.Opdracht1;

import java.util.Scanner;

public class ForExample5 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int x = 10;
        int y = 0;

        do {
            System.out.println("Enter a number from 0 to 10: ");
            while (!myScanner.hasNextInt()) {
                System.out.println("Repeat the request");

            }
            {

                //if (myScanner.hasNextInt()) {
                    //int number = myScanner.nextInt();
                   // System.out.println("repeat the request " + number);
                    //} else {
                    //System.out.println("Ongeldige invoer. Voer alstublieft een geldig getal in.");
                }
            }















