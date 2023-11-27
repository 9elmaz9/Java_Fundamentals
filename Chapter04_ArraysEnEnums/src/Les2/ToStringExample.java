package Les2;

import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {

        //get the aaray

        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //get the String representation of array
        String stringArr = Arrays.toString(myArr);
        //print the String representation
        System.out.println("Array:" + stringArr);

    }
}