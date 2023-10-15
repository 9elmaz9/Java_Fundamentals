package Oefening4;
//Oefening 2
//
//Schrijf een programma om deze array te kopiëren en te vergroten naar 10 elementen.
//
//int[] myIntArray = {1, 2, 3, 4, 5};
import java.util.Arrays;

public class Oegening2 {

        public static void main(String[] args) {
            // Given array
            int[] myIntArray = {1, 2, 3, 4, 5};

            //Copy and enlarge to 10 elements
            int[] expandedArray = Arrays.copyOf(myIntArray, 10);

            // Print the original and enlarged arrays
            System.out.println("Originele array: " + Arrays.toString(myIntArray));
            System.out.println("Vergrote array: " + Arrays.toString(expandedArray));
        }
    }


