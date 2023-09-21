package be.intecbrussel.Les5.Oefening4;

import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Name:" + name);

        System.out.print("Enter your age: ");
        String phonenumber = myScanner.nextLine();
        System.out.println("Age:" + phonenumber);

        for (int index =28;index<0;index++){
            if(index==28){
                break;
            }
        }

        int age = 28;

        do {
            System.out.println("The age is:" + age);

            age++;
        }
        while (age < 0);

        for (int count = 28; count >= 1; count--) {
            System.out.println("The counter is:" + count);

        }
    }
}


