package intecbrussel.Opdracht1;

import java.util.Scanner;

public class WhileExample5 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a no from 0 to 10");
        int num = 0;
        char ans = 'y';
        while (ans == 'y') {
            System.out.println("Enter a number");
            num = myScanner.nextInt();
            if ((num < 0) || (num > 10)) {
                System.out.println("Sorry you can enter numbers from 0 to 10 only. " +
                        "Do you want to enter new number ");
                ans = myScanner.nextLine().charAt(0);
            }
        }
    }
}
