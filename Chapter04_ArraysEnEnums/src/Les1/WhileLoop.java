package Les1;

public class WhileLoop {

    public static void main(String[] args) {
        int[] numberArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // create array
        int index = 0; // index 0= 2; index1=4 ; index3=6...
        while (index < numberArray.length) {
            System.out.println("This iteration is done by a while loop :" + numberArray[index]);
            index++;

        }
        // if index = 0 then
        //This iteration is done by a while loop :2
        //This iteration is done by a while loop :4
        //This iteration is done by a while loop :6
        //This iteration is done by a while loop :8
        //This iteration is done by a while loop :10
        //This iteration is done by a while loop :12
        //This iteration is done by a while loop :14
        //This iteration is done by a while loop :16
        //This iteration is done by a while loop :18
        //This iteration is done by a while loop :20


        // if index= 5
        // This iteration is done by a while loop :12
        //This iteration is done by a while loop :14
        // This iteration is done by a while loop :16
        //This iteration is done by a while loop :18
        //This iteration is done by a while loop :20


    }
}
