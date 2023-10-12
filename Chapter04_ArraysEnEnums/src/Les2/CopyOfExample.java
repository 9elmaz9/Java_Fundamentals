package Les2;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {

        //initializing an array original
        int[]originalArray={1,2,3};

        System.out.println("Original Array");

        for(int index = 0 ; index < originalArray.length ; index++)
        System.out.println(originalArray[index]+" ");




        //copyOf()
        //copying array originalArray to newArray
        int[]newArray= Arrays.copyOf(originalArray, 5);
        //changing some elements of new Array
        newArray[3]=11;
        newArray[4]=55;

        System.out.println("\nNew array newArray after modifications:");

        for (int index = 0; index <newArray.length ; index++){
            System.out.println(newArray[index]+" ");
        }
    }
}
