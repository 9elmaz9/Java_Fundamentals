import java.util.Scanner;

public class E {



        public static void main(String[] args) {
            Scanner mijnScanner = new Scanner(System.in);
            System.out.print("Voer uw leeftijd in: ");



            if (mijnScanner.hasNextInt()) {
                int leeftijd = mijnScanner.nextInt();
                System.out.println("U heeft " + leeftijd + " jaar ingevoerd.");
            } else {
                System.out.println("Ongeldige invoer. Voer alstublieft een geldig getal in.");
            }
        }
    }



