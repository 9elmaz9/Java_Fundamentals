package Les1.Oefening1;

public class Oefening3 {
    public static void main(String[] args) {

        //Oefening 3
        //Schrijf een programma om de even en oneven nummer te vinden in een int array.
//VARIANT 1

   /*     int[] intArray = {10, 11, 12, 13, 14};
        int lenOfArray = intArray.length;
        for (int i = 0; i < lenOfArray; i++) {
            if (intArray[i] % 2 == 0)
                System.out.println(intArray[i] + "is even");
            else
                System.out.println(intArray[i] + "is odd");
        }
    }

    */



        /*VARIANT 2 :
        int[] intArray = {1, 2, 3, 4, 5, 6}; // create array
        System.out.println("Even ");
        for (int num : intArray) { // convert int naar array  for EACH, iterate through all the elements of the array
            if (num % 2 == 0) {
                System.out.println();
                {
          System.out.println(num + ""); from tha array
                }
            }
        }*/


//VARIANT 3 :

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++)//for give values the elements
        {
            numbers[i] = i + 1;

        }
        for (int i = 0; i < numbers.length; i++)//for control (even or no)
        {

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even");
            } else {
                System.out.println(numbers[i] + " is Odd");
            }

        }


    }
}

