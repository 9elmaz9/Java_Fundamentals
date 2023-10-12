package Les1.Oefeningen2;

//Oefening 1
//Schrijf een programma dat van de volgende array alle elementen optelt.
//int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//De uitkomst moet 55 zijn.
public class Oefening1 {
    public static void main(String[] args) {

        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int numer : my_array) { // iterate through all the elements of the array
            sum += numer; // sum = sum + numer

            System.out.println("Resultaat bijtelling is : " + sum);

        }

        /*var 2
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index=0;
        int sum=0;
        while (index<my+my_array.length) {
            sum += my_array[index];
            index++;
        }
        System.out.println("the sum is :"+sum);
        }*/

    }
}
