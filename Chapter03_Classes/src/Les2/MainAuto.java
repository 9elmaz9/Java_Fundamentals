package Les2;

public class MainAuto {

        public static void main(String[] args) {
            //Geen toegang doordat het een private constructor is
            //Auto auto1=new Auto();

            // Wel toegang doordat het een public constructor is
            Auto auto2 = new Auto("Toyota", "Camry");

            System.out.println("\"Auro is created!\"");


        }
    }


