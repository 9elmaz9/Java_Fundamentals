package Example;
import java.util.Scanner;
public class ai {


        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Welcome message
            System.out.println("Welcome to EvenOdda");

            try {
                // Prompt the user to enter a number
                System.out.print("Please enter a number: ");
                int number = scanner.nextInt();

                // Check if the input number is even or odd
                String result = (number % 2 == 0) ? "Even" : "Odd";

                // Display the result
                System.out.println(result);
            } catch (java.util.InputMismatchException e) {
                // Handle the case where the user enters invalid input (not a number)
                System.out.println("Error!! You have NOT entered any number.");
            }

            // Close the Scanner
            scanner.close();

            // Thank you message
            System.out.println("Thank you for using our application.");
        }
    }

