package intecbrussel.Les1;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Name:" + name);

        System.out.print("Enter your phonenumber: ");
        String phonenumber = myScanner.nextLine();
        System.out.println("Phonenumber:" + phonenumber);


        System.out.println("Enter your adres:" );
        String adres = myScanner.nextLine();
        System.out.println("Adres:"+ adres);





    }
}
