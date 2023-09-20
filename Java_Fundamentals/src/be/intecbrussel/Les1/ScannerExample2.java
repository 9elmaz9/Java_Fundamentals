package be.intecbrussel.Les1;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String name = myScanner.nextLine();

        int age = myScanner.nextInt();

        double salary = myScanner.nextDouble();

        System.out.println("Name :" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);


    }
}
