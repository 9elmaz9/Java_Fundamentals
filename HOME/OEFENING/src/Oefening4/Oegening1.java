package Oefening4;

import java.util.Arrays;
import java.util.Collections;

public class Oegening1 {

        public static void main(String[] args) {
            // example array with double == met getal
            Double[] doubleArray = {5.7, 2.3, 8.9, 4.1, 1.5, 6.8, 3.2, 9.6, 7.4, 2.9, 6.0, 8.2, 1.7, 3.8, 5.4};

            // exqmple with string
            String[] stringArray = {"London", "New York", "Sydney", "  Paris", "Tokyo", "Berlin", "Rome", "Beijing", "Istanbul", "Cairo", "Rio de Janeiro", " Kiev", "Mumbai", "Barcelona", "Toronto"};

            // sort the array of doubles from highest to lowest
            Arrays.sort(doubleArray, Collections.reverseOrder());

            //sort the array of strings from highest to lowest
            Arrays.sort(stringArray, Collections.reverseOrder());

            // prtint
            System.out.println("Gesorteerde array van doubles (van hoog naar laag): " + Arrays.toString(doubleArray));
            System.out.println("Gesorteerde array van strings (van hoog naar laag): " + Arrays.toString(stringArray));
        }
    }


