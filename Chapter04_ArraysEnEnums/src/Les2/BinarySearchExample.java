package Les2;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int intArr[]={300,200,100,400,500};
        System.out.println("Before sorting value at index 0"+intArr[0]); //300

        System.out.println("Before sorting value at index 0"+intArr[0]); //100
        Arrays.sort(intArr); // ot min to max 100 , 200 ,300, 400, 500

        System.out.println("After sorting value at index 0"+intArr[0]); // [0]=100
        System.out.println("After sorting value at index 2"+intArr[2]);  // 2=300 , now + it is change
        int keyElements = 300;
        System.out.println(keyElements+"found at index="+Arrays.binarySearch(intArr,keyElements)); // antword 2

    }
}
