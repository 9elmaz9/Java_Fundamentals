package Oefening4;

import java.util.Arrays;
import java.util.HashSet;

//Oefening 3
//
//Schrijf een programma om de dubbele stadsnamen eruit te filteren en uit te printen.
//
//String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};


public class Oefening3 {
        public static void main(String[] args) {
            // given array of city names
            String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};

            // use HashSet to remove duplicates
            HashSet<String> uniqueCities = new HashSet<>(Arrays.asList(myArray));

            // printing city names without duplicates
            System.out.println("Stad Namen zonder duplicaten : ");
            for (String city : uniqueCities) {
                System.out.println(city);
            }
        }
    }


