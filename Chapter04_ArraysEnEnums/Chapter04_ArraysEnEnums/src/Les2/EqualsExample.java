package Les2;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        //om 2 arraysy met elkar te vergelijken

        int[] array01 = {1, 2, 3, 4};
        int[] array02 = {1, 2, 3, 4}; //equal true
        int[] array03 = {1, 2, 3, 4}; //equal false order is different
        int[] array04 = {1, 2, 3, 4, 5}; // equal false length is different
        long[] array05 = {1, 2, 3, 4}; // equal false error for not the same

        System.out.println("Are array01 and aray0é equal:" + Arrays.equals(array01, array02));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


    }
}
