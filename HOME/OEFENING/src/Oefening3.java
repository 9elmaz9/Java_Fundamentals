import java.util.HashSet;
import java.util.Set;

public class Oefening3 {
        public static void main(String[] args) {
            String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};

            // Maak een Set om dubbele stadsnamen te filteren
            Set<String> uniqueCities = new HashSet<>();

            // Loop door de array en voeg elke stad toe aan de Set
            for (String city : myArray) {
                uniqueCities.add(city);
            }

            // Druk de unieke stadsnamen af
            System.out.println("Unieke stadsnamen:");
            for (String uniqueCity : uniqueCities) {
                System.out.println(uniqueCity);
            }
        }
    }




