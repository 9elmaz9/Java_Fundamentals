package Les1.Oefeningen2;
//Oefening 3
//
//Schrijf een programma om het gemiddelde van deze array elementen te berekenen.
//
//int[] numbers = {20, 30, 25, 35, -16, 60, -100};
//
//Uitkomst moet zijn: 7.0
public class Oefening3 {

    public static void main(String[] args) {
        //first step declare and initialize the array
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        // calculate the sum and count
        int sum = 0;
        int count = 0;

        for (int number : numbers) { // iterate through all the elements of the array
            sum += number;
            count++;
        }

        // calculate the average
        double gemiddelde = (double) sum / count;

        System.out.println("Gemiddelde krijgen is:: " + gemiddelde);
    }
}
/* var 2
    public static void main(String[] args) {
        //first step declare and initialize the array
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        float sum =0.0F;
        float mid=0.0F;
        int lengtOfArray; i++){
            sum = sum + numbers[i];
        }
        mid=sum/lengtOfArray;
        System.out.println(mid));
        }
*/

/* var 3
 int[] numbers = {20, 30, 25, 35, -16, 60, -100};
double gemiddelde=0.0;
int sum =0.

for(int num: nummerr){
}
gemiddelde = sum/num.length ;
System.out.println("gemiddelde van nummer is :"+ gemiddelde);

 */
