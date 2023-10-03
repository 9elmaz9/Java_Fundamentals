package intecbrussel.Les3.Oefening2;

import java.util.Scanner;

public class Oefening5 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to EvenOdda");

        System.out.println("Please enter a number:");
        int number = myScanner.nextInt();


        if (number ==10) {
            System.out.println("Even");
            System.out.println("Thank you for using our applivation");
        }else if(number ==9) {
            System.out.println("Odd");
            System.out.println("Thank you for using our applivation");

        }
        }
    }

